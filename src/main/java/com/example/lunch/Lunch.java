package com.example.lunch;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Korver on 4/25/2017.
 */
@JsonIgnoreProperties(ignoreUnknown=true)
public class Lunch {

    @JsonProperty("menu_items")
    List<String> menuItems;

    public List<String> getMenuItems() {
        return menuItems;
    }

    public String getStringMenuItems()
    {
        if(menuItems != null)
        {
            return menuItems.stream().collect(Collectors.joining(","));
        }
        return "";
    }
}
