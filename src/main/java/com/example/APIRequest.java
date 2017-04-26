package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

/**
 * Created by Korver on 4/25/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class APIRequest {

    @JsonProperty
    String id;
    @JsonProperty
    String timestamp;
    @JsonProperty
    String lang;
    @JsonProperty
    Result result;
    @JsonProperty
    Map<String,String> parameters;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("APIRequest{");
        sb.append("id='").append(id).append('\'');
        sb.append(", timestamp='").append(timestamp).append('\'');
        sb.append(", lang='").append(lang).append('\'');
        sb.append(", result=").append(result);
        sb.append(", parameters=").append(parameters);
        sb.append('}');
        return sb.toString();
    }
}

class Result{
    @JsonProperty
    String source;
    @JsonProperty
    String resolvedQuery;

    @JsonProperty
    String action;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Result{");
        sb.append("source='").append(source).append('\'');
        sb.append(", resolvedQuery='").append(resolvedQuery).append('\'');
        sb.append(", action='").append(action).append('\'');
        sb.append('}');
        return sb.toString();
    }
}