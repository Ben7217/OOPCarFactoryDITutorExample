package model;

import services.CarService;

public class Car {

    private String make;
    private String model;
    private String year;
    private String tires;
    private double price;
    private int doors;
    private int milage;
    private Engine engine;

    public Car() {}

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public Car (Engine engine) {
//        this.engine = engine;
//
//    }

//    public Car(String make, String model, String tires, int doors, int milage, Engine engine) {
//        this.make = make;
//        this.model = model;
//        this.tires = tires;
//        this.doors = doors;
//        this.milage = milage;
//        this.engine = engine;
//    }

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

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getMilage() {
        return milage;
    }

    public void setMilage(int milage) {
        this.milage = milage;
    }

    public Engine getEngine() {
        return engine;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", tires='" + tires + '\'' +
                ", price=" + price +
                ", doors=" + doors +
                ", milage=" + milage +
                ", engine=" + engine +
                '}';
    }
}
