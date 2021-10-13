package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {

    @lombok.Getter(onMethod_ = {@JsonProperty("self")})
    @lombok.Setter(onMethod_ = {@JsonProperty("self")})
    private PreviousEpisode self;
    @lombok.Getter(onMethod_ = {@JsonProperty("previousepisode")})
    @lombok.Setter(onMethod_ = {@JsonProperty("previousepisode")})
    private PreviousEpisode previousepisode;
}
