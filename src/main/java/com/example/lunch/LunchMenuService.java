package com.example.lunch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Korver on 4/25/2017.
 */
public interface LunchMenuService {
    ///menu/api/digest/school/farmington-elementary/menu-type/lunch/date/2017/04/19/
    @GET("/menu/api/digest/school/{school_name}/menu-type/lunch/date/{year}/{month}/{day}/")
    Call<Lunch> getLunch(@Path("school_name") String school_name,
                         @Path("year") int year,
                         @Path("month") int month,
                         @Path("day") int day);
}
