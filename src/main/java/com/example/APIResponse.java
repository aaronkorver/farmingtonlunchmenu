package com.example;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Korver on 4/25/2017.
 */

public class APIResponse {

    @JsonProperty
    String speech;

    @JsonProperty
    String displayText;

    @JsonProperty
    String source;



    public APIResponse(String speech, String displayText, String source) {
        this.speech = speech;
        this.displayText = displayText;
        this.source = source;
    }
}
