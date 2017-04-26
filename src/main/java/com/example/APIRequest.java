package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.Map;

/**
 * Created by Korver on 4/25/2017.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class APIRequest {

    String id;
    String timestamp;
    String lang;
    Result result;
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
    String source;
    String resolvedQuery;
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