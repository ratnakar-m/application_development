package com.bonhive.pmtool.web;

import com.bonhive.pmtool.demo.Car;
import com.bonhive.pmtool.demo.TripPlanner;
import com.bonhive.pmtool.demo.Util;
import com.bonhive.pmtool.domain.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("api/trip")
public class TripController {

    @Autowired
    Car car;

    @GetMapping
    public ResponseEntity<TripPlanner> getTripPlan() throws ParseException {
        List<String> friends = new ArrayList<>();
        friends.add("Ram");
        friends.add("Raj");
        friends.add("Ravi");

        List<String> locations = new ArrayList<>();
        locations.add("Ooty");
        locations.add("Coorg");
        locations.add("Bangalore");

        Date startDate = Util.getDate("15-05-2021");
        Date endDate = Util.getDate("22-05-2021");

        TripPlanner tripPlanner = new TripPlanner();
        tripPlanner.setCar(car);
        tripPlanner.setLocations(locations);
        tripPlanner.setFriends(friends);
        tripPlanner.setStartDate(startDate);
        tripPlanner.setEndDate(endDate);

        ResponseEntity<TripPlanner> response = new ResponseEntity<TripPlanner>(tripPlanner, HttpStatus.OK);

        return response;
    }

}
