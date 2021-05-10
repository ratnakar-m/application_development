package com.bonhive.pmtool.demo;

public class Swift implements Car{

    @Override
    public void start() {
        System.out.println("Starting Swift car");
    }

    public void drive() {
        System.out.println("Driving Swift car");
    }

    @Override
    public void gearChange() {
        System.out.println("Changing gears for Swift car");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Applying brakes for Swift car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Swift car");
    }

    String carModel = "Swift";
    public String getCarModel(){
        return carModel;
    }
}
