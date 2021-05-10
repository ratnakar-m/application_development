package com.bonhive.pmtool.demo;

public class Etios implements Car{
    @Override
    public void start() {
        System.out.println("Starting Etios car");
    }

    public void drive() {
        System.out.println("Driving Etios car");
    }

    @Override
    public void gearChange() {
        System.out.println("Changing gears for Etios car");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Applying brakes for Etios car");
    }

    @Override
    public void stop() {
        System.out.println("Stopping Etios car");
    }

    String carModel = "Etios";
    public String getCarModel(){
        return carModel;
    }
}
