package org.example;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class GetSearchTest {

    @Test
    public void shouldSearchEpisode() {
        given().contentType(ContentType.JSON)
                .when()
                .get("http://api.tvmaze.com/singlesearch/shows?q=the%20office")
                .then().extract().as()
    }
}
