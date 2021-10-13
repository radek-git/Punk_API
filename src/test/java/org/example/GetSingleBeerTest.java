package org.example;

import io.restassured.http.ContentType;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Optional;

import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class GetSingleBeerTest {


    @Test
    public void getBeerById() {
        Beer beer = given().contentType(ContentType.JSON)
                .when()
                .get("https://api.punkapi.com/v2/beers/1")
                .then()
                .extract().as(Beer[].class)[0];

        Optional<Malt> malt = beer.getIngredients().getMalt().stream().filter(malt1 -> malt1.getName().equals("Caramalt")).findFirst();

        assertTrue(malt.isPresent());
        assertEquals(malt.get().getAmount().getValue(), 0.2);
        assertEquals(malt.get().getAmount().getUnit(), "kilograms");

        assertEquals(beer.getIngredients().getHops().stream().filter(hop -> hop.getAmount().getValue() < 30
                && hop.getAttribute().equals("bitter")).count(), 2);
    }


    @Test
    public void getPaginatedListOfBeers() {
        Beer[] beers = given().contentType(ContentType.JSON)
                .when()
                .get("https://api.punkapi.com/v2/beers?page=2&per_page=80")
                .then()
                .extract().as(Beer[].class);

        long count = Arrays.stream(beers).filter(beer -> beer.getMethod().getMashTemp().stream()
                .anyMatch(mashTemp -> mashTemp.getTemp().getValue() > 60)
                && beer.getIngredients().getMalt().stream().anyMatch(malt -> malt.getName().equals("Munich"))).count();

        System.out.println(count);

    }


    @Test
    public void shouldCountBeersWithBitterOrFlavourAttribute() {
        Beer[] beers = given().contentType(ContentType.JSON)
                .when()
                .get("https://api.punkapi.com/v2/beers?page=2&per_page=80")
                .then()
                .extract().as(Beer[].class);

        long count = Arrays.stream(beers).filter(b -> b.getIngredients().getHops().stream()
                .anyMatch(h -> h.getAttribute().equals("bitter"))
                && b.getIngredients().getHops().stream().anyMatch(h -> h.getAttribute().equals("flavour"))).count();
        System.out.println(count);
    }
}
