package org.example;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Beer {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("tagline")
    private String tagline;
    @JsonProperty("first_brewed")
    private String firstBrewed;
    @JsonProperty("description")
    private String description;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("abv")
    private Double abv;
    @JsonProperty("ibu")
    private Integer ibu;
    @JsonProperty("target_fg")
    private Integer targetFg;
    @JsonProperty("target_og")
    private Integer targetOg;
    @JsonProperty("ebc")
    private Integer ebc;
    @JsonProperty("srm")
    private Integer srm;
    @JsonProperty("ph")
    private Double ph;
    @JsonProperty("attenuation_level")
    private Integer attenuationLevel;
    @JsonProperty("volume")
    private Volume volume;
    @JsonProperty("boil_volume")
    private BoilVolume boilVolume;
    @JsonProperty("method")
    private Method method;
    @JsonProperty("ingredients")
    private Ingredients ingredients;
    @JsonProperty("food_pairing")
    private List<String> foodPairing = null;
    @JsonProperty("brewers_tips")
    private String brewersTips;
    @JsonProperty("contributed_by")
    private String contributedBy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("tagline")
    public String getTagline() {
        return tagline;
    }

    @JsonProperty("tagline")
    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    @JsonProperty("first_brewed")
    public String getFirstBrewed() {
        return firstBrewed;
    }

    @JsonProperty("first_brewed")
    public void setFirstBrewed(String firstBrewed) {
        this.firstBrewed = firstBrewed;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("image_url")
    public String getImageUrl() {
        return imageUrl;
    }

    @JsonProperty("image_url")
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("abv")
    public Double getAbv() {
        return abv;
    }

    @JsonProperty("abv")
    public void setAbv(Double abv) {
        this.abv = abv;
    }

    @JsonProperty("ibu")
    public Integer getIbu() {
        return ibu;
    }

    @JsonProperty("ibu")
    public void setIbu(Integer ibu) {
        this.ibu = ibu;
    }

    @JsonProperty("target_fg")
    public Integer getTargetFg() {
        return targetFg;
    }

    @JsonProperty("target_fg")
    public void setTargetFg(Integer targetFg) {
        this.targetFg = targetFg;
    }

    @JsonProperty("target_og")
    public Integer getTargetOg() {
        return targetOg;
    }

    @JsonProperty("target_og")
    public void setTargetOg(Integer targetOg) {
        this.targetOg = targetOg;
    }

    @JsonProperty("ebc")
    public Integer getEbc() {
        return ebc;
    }

    @JsonProperty("ebc")
    public void setEbc(Integer ebc) {
        this.ebc = ebc;
    }

    @JsonProperty("srm")
    public Integer getSrm() {
        return srm;
    }

    @JsonProperty("srm")
    public void setSrm(Integer srm) {
        this.srm = srm;
    }

    @JsonProperty("ph")
    public Double getPh() {
        return ph;
    }

    @JsonProperty("ph")
    public void setPh(Double ph) {
        this.ph = ph;
    }

    @JsonProperty("attenuation_level")
    public Integer getAttenuationLevel() {
        return attenuationLevel;
    }

    @JsonProperty("attenuation_level")
    public void setAttenuationLevel(Integer attenuationLevel) {
        this.attenuationLevel = attenuationLevel;
    }

    @JsonProperty("volume")
    public Volume getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Volume volume) {
        this.volume = volume;
    }

    @JsonProperty("boil_volume")
    public BoilVolume getBoilVolume() {
        return boilVolume;
    }

    @JsonProperty("boil_volume")
    public void setBoilVolume(BoilVolume boilVolume) {
        this.boilVolume = boilVolume;
    }

    @JsonProperty("method")
    public Method getMethod() {
        return method;
    }

    @JsonProperty("method")
    public void setMethod(Method method) {
        this.method = method;
    }

    @JsonProperty("ingredients")
    public Ingredients getIngredients() {
        return ingredients;
    }

    @JsonProperty("ingredients")
    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    @JsonProperty("food_pairing")
    public List<String> getFoodPairing() {
        return foodPairing;
    }

    @JsonProperty("food_pairing")
    public void setFoodPairing(List<String> foodPairing) {
        this.foodPairing = foodPairing;
    }

    @JsonProperty("brewers_tips")
    public String getBrewersTips() {
        return brewersTips;
    }

    @JsonProperty("brewers_tips")
    public void setBrewersTips(String brewersTips) {
        this.brewersTips = brewersTips;
    }

    @JsonProperty("contributed_by")
    public String getContributedBy() {
        return contributedBy;
    }

    @JsonProperty("contributed_by")
    public void setContributedBy(String contributedBy) {
        this.contributedBy = contributedBy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
