package hr.air.projekt.datamodule;

/**
 * Created by mico on 13.12.2016..
 */

public class Vehicle {
    private String manufacturer;
    private String model;
    private String productYear;
    private String registrationDate;
    private String registrationExpired;
    private String kw;
    private String chassisNumber;
    private String registrationNumber;
    private double averageFuelConsumption;
    private boolean free;
    private double fuelStatus;

    public Vehicle() {
    }

    public Vehicle(String manufacturer, String model, String productYear, String registrationDate, String registrationExpired, String kw,
                   String chassisNumber, String registrationNumber, double averageFuelConsumption,
                   boolean free, double fuelStatus) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.productYear = productYear;
        this.registrationDate = registrationDate;
        this.registrationExpired = registrationExpired;
        this.kw = kw;
        this.chassisNumber = chassisNumber;
        this.registrationNumber = registrationNumber;
        this.averageFuelConsumption = averageFuelConsumption;
        this.free = free;
        this.fuelStatus = fuelStatus;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProductYear() {
        return productYear;
    }

    public void setProductYear(String productYear) {
        this.productYear = productYear;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getRegistrationExpired() {
        return registrationExpired;
    }

    public void setRegistrationExpired(String registrationExpired) {
        this.registrationExpired = registrationExpired;
    }

    public String getKw() {
        return kw;
    }

    public void setKw(String kw) {
        this.kw = kw;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(String chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public double getAverageFuelConsumption() {
        return averageFuelConsumption;
    }

    public void setAverageFuelConsumption(double averageFuelConsumption) {
        this.averageFuelConsumption = averageFuelConsumption;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public double getFuelStatus() {
        return fuelStatus;
    }

    public void setFuelStatus(double fuelStatus) {
        this.fuelStatus = fuelStatus;

    }

}