package model;

public class Car {

    /**
     * The below variables are instance variables. Each instance of the Car class has a separate copy
     * of these variables, aka, each time you create a car object, your instance variables will
     * have different values.
     */
    private String make;
    private String model;
    private String year;
    private String tires;
    private double price;
    private int doors; //primitive value: int. Java has 8 primitive values. int, double, float, char, byte, long, short, and boolean
    private int milage;
    private Engine engine;

    /**
     * Java creates a default (empty) constructor for every class. This default constructor will always be there
     * unless you create your own constructor. When you create your own constructor, the default constructor is no
     * longer accessible unless it is also created. In this case, we created a default constructor for demo purposes.
     */
    public Car() {}

    /**
     * The following are getters and setters. They allow us to access our private instance variables.
     * The set lets us set the value and the get lets us retrieve the value. To generate, right click and
     * then select getters and setters.
     */

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    /**
     * Each class in the Java ecosystem extends the Object superclass. One of the methods inside that class
     * is the toString method. The toString method in the Object class returns a reference to where the object
     * exists in memory (objects live on the heap). In order to display the actual values of our instance variables
     * within our class, we MUST Override the toString method.
     *
     */

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
