package com.ironhack.car;

public class Car {
    private long vinNumber;
    private String make;
    private String model;
    private int millage;

    public Car(long vinNumber, String make, String model, int millage) {
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMillage(millage);
    }

    public long getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(long vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMillage() {
        return millage;
    }

    public void setMillage(int millage) {
        this.millage = millage;
    }
}
