package com.example;

/**
 * Created by Korver on 4/25/2017.
 */

public class APIResponse {

    String speech;
    String displayText;
    String source;



    public APIResponse(String speech, String displayText, String source) {
        this.speech = speech;
        this.displayText = displayText;
        this.source = source;
    }
}
