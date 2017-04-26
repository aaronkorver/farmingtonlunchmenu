package com.example.lunch;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

/**
 * Created by Korver on 4/25/2017.
 */
public class LunchRequest {
    String schoolName;
    String lunchDate;
    SCHOOLS school;

    enum SCHOOLS {
        AKIN("akin-rd"),
        FES("farmington-elementary"),
        MEADOWVIEW("meadowview"),
        RIVERVIEW("riverview"),
        NORTHTRAIL("north-trail");

        String schoolCode;

        SCHOOLS(String code) {
            this.schoolCode = code;
        }

        public static SCHOOLS getSchool(String schoolCode)
        {
            return Arrays.stream(SCHOOLS.values()).filter(s -> s.name().equals(schoolCode)).findFirst().get();
        }

    }

    public LunchRequest(String schoolName) {
        this(schoolName,null);
    }

    public LunchRequest(String schoolName, String lunchDate) {
        this.schoolName = schoolName;
        school = SCHOOLS.getSchool(schoolName);
        if(lunchDate == null)
        {
            this.lunchDate = DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now());
        }
        else {
            this.lunchDate = lunchDate;
        }

    }

    public String getSchoolName() {
        return school.schoolCode;
    }



    public String getLunchDate() {
        return lunchDate;
    }
}
