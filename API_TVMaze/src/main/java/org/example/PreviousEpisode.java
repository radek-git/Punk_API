package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PreviousEpisode {

    @lombok.Getter(onMethod_ = {@JsonProperty("href")})
    @lombok.Setter(onMethod_ = {@JsonProperty("href")})
    private String href;
}
