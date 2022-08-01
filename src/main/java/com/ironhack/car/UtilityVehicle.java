package com.ironhack.car;

public class UtilityVehicle extends Car{
    private boolean fourWheelDrive;


    public UtilityVehicle(long vinNumber, String make, String model, int millage, boolean fourWheelDrive) {
        super(vinNumber, make, model, millage);
        setFourWheelDrive(fourWheelDrive);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }
    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
