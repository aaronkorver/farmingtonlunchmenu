package com.example;

import com.example.lunch.Lunch;
import com.example.lunch.LunchMenuService;
import com.example.lunch.LunchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;

/**
 * Created by Korver on 4/25/2017.
 */
@RestController
public class HelloController {

    @Autowired
    LunchMenuService menuService;

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    public String hello()
    {
        return "hello world";
    }

    @RequestMapping(method = RequestMethod.POST, value="/webhook")
    public @ResponseBody APIResponse postit(@RequestBody APIRequest apiRequest) throws IOException {
        System.out.println(apiRequest);
        LunchRequest request = new LunchRequest(apiRequest.result.parameters.schoolName,apiRequest.result.parameters.date);
        Lunch lunch = getLunch(request);

        return new APIResponse(lunch.getStringMenuItems(),lunch.getStringMenuItems(),"farmington.nutrislice.com");
    }

    @RequestMapping(method = RequestMethod.GET, value="/lunch")
    public @ResponseBody Lunch retrieveLunch() throws IOException {
        LunchRequest request = new LunchRequest("FES");
        return getLunch(request);
    }

    private Lunch getLunch(LunchRequest request) throws IOException {
        TemporalAccessor temporalAccessor = DateTimeFormatter.ISO_LOCAL_DATE.parse(request.getLunchDate());
        Call<Lunch> call = menuService.getLunch(request.getSchoolName(),
                temporalAccessor.get(ChronoField.YEAR),
                temporalAccessor.get(ChronoField.MONTH_OF_YEAR),
                temporalAccessor.get(ChronoField.DAY_OF_MONTH));
        Response<Lunch> response = call.execute();
        if(response.isSuccessful())
        {
            return response.body();
        }
        else return null;
    }

}
