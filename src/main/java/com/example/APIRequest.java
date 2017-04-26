package com.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

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



    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("APIRequest{");
        sb.append("id='").append(id).append('\'');
        sb.append(", timestamp='").append(timestamp).append('\'');
        sb.append(", lang='").append(lang).append('\'');
        sb.append(", result=").append(result);
        sb.append('}');
        return sb.toString();
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Result{
    @JsonProperty
    String source;
    @JsonProperty
    String resolvedQuery;

    @JsonProperty
    String action;

    @JsonProperty
    Parameters parameters;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Result{");
        sb.append("source='").append(source).append('\'');
        sb.append(", resolvedQuery='").append(resolvedQuery).append('\'');
        sb.append(", action='").append(action).append('\'');
        sb.append(", parameters=").append(parameters);
        sb.append('}');
        return sb.toString();
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Parameters{
    @JsonProperty
    String date;
    @JsonProperty
    String schoolName;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Parameters{");
        sb.append("date='").append(date).append('\'');
        sb.append(", schoolName='").append(schoolName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}