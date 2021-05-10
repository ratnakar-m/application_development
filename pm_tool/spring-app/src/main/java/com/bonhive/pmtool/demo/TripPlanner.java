package com.bonhive.pmtool.demo;

import java.util.Date;
import java.util.List;

public class TripPlanner {
    Car car;
    List<String> friends;
    List<String> locations;
    Date startDate;
    Date endDate;

    public void TripPlanner(){

    }

    public void TripPlanner(Car car, List<String> friends, List<String> locations, Date startDate, Date endDate){
        this.car = car;
        this.friends = friends;
        this.locations = locations;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
