package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Image {

    @lombok.Getter(onMethod_ = {@JsonProperty("medium")})
    @lombok.Setter(onMethod_ = {@JsonProperty("medium")})
    private String medium;
    @lombok.Getter(onMethod_ = {@JsonProperty("original")})
    @lombok.Setter(onMethod_ = {@JsonProperty("original")})
    private String original;
}
