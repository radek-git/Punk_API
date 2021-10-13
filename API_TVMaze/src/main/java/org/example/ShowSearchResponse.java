package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ShowSearchResponse {

    @lombok.Getter(onMethod_ = {@JsonProperty("id")})
    @lombok.Setter(onMethod_ = {@JsonProperty("id")})
    private long id;
    @lombok.Getter(onMethod_ = {@JsonProperty("url")})
    @lombok.Setter(onMethod_ = {@JsonProperty("url")})
    private String url;
    @lombok.Getter(onMethod_ = {@JsonProperty("name")})
    @lombok.Setter(onMethod_ = {@JsonProperty("name")})
    private String name;
    @lombok.Getter(onMethod_ = {@JsonProperty("type")})
    @lombok.Setter(onMethod_ = {@JsonProperty("type")})
    private String type;
    @lombok.Getter(onMethod_ = {@JsonProperty("language")})
    @lombok.Setter(onMethod_ = {@JsonProperty("language")})
    private String language;
    @lombok.Getter(onMethod_ = {@JsonProperty("genres")})
    @lombok.Setter(onMethod_ = {@JsonProperty("genres")})
    private List<String> genres;
    @lombok.Getter(onMethod_ = {@JsonProperty("status")})
    @lombok.Setter(onMethod_ = {@JsonProperty("status")})
    private String status;
    @lombok.Getter(onMethod_ = {@JsonProperty("runtime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("runtime")})
    private long runtime;
    @lombok.Getter(onMethod_ = {@JsonProperty("averageRuntime")})
    @lombok.Setter(onMethod_ = {@JsonProperty("averageRuntime")})
    private long averageRuntime;
    @lombok.Getter(onMethod_ = {@JsonProperty("premiered")})
    @lombok.Setter(onMethod_ = {@JsonProperty("premiered")})
    private LocalDate premiered;
    @lombok.Getter(onMethod_ = {@JsonProperty("officialSite")})
    @lombok.Setter(onMethod_ = {@JsonProperty("officialSite")})
    private String officialSite;
    @lombok.Getter(onMethod_ = {@JsonProperty("schedule")})
    @lombok.Setter(onMethod_ = {@JsonProperty("schedule")})
    private Schedule schedule;
    @lombok.Getter(onMethod_ = {@JsonProperty("rating")})
    @lombok.Setter(onMethod_ = {@JsonProperty("rating")})
    private Rating rating;
    @lombok.Getter(onMethod_ = {@JsonProperty("weight")})
    @lombok.Setter(onMethod_ = {@JsonProperty("weight")})
    private long weight;
    @lombok.Getter(onMethod_ = {@JsonProperty("network")})
    @lombok.Setter(onMethod_ = {@JsonProperty("network")})
    private Network network;
    @lombok.Getter(onMethod_ = {@JsonProperty("webChannel")})
    @lombok.Setter(onMethod_ = {@JsonProperty("webChannel")})
    private Object webChannel;
    @lombok.Getter(onMethod_ = {@JsonProperty("dvdCountry")})
    @lombok.Setter(onMethod_ = {@JsonProperty("dvdCountry")})
    private Object dvdCountry;
    @lombok.Getter(onMethod_ = {@JsonProperty("externals")})
    @lombok.Setter(onMethod_ = {@JsonProperty("externals")})
    private Externals externals;
    @lombok.Getter(onMethod_ = {@JsonProperty("image")})
    @lombok.Setter(onMethod_ = {@JsonProperty("image")})
    private Image image;
    @lombok.Getter(onMethod_ = {@JsonProperty("summary")})
    @lombok.Setter(onMethod_ = {@JsonProperty("summary")})
    private String summary;
    @lombok.Getter(onMethod_ = {@JsonProperty("updated")})
    @lombok.Setter(onMethod_ = {@JsonProperty("updated")})
    private long updated;
    @lombok.Getter(onMethod_ = {@JsonProperty("_links")})
    @lombok.Setter(onMethod_ = {@JsonProperty("_links")})
    private Links links;
}
