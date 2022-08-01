package com.ironhack.car;

public class Truck extends Car{
    private int towingCapacity;

    public Truck(long vinNumber, String make, String model, int millage, int towingCapacity) {
        super(vinNumber, make, model, millage);
        setTowingCapacity(towingCapacity);
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
