package services;

import model.Car;
import model.Engine;


/**
 * this class implements our interface (CarService). What that means is, we are required to implement the methods
 * inside CarService (carData). This class creates a new car object each time it is instantiated.
 */
public class CarServiceImpl implements CarService {

    //Here we create a private instance variable of type Car. This is no different than other instance variables
    //except it is with our own object.

    private Car car;

    //This is the constructor. While it contains no parameters, every time an instance of the CarServiceImpl
    //class is created, it creates a new car object. Since we have a new car created, we can use it in our carData
    //method.

    CarServiceImpl() {
        car = new Car();
    }

    /**
     * carData has one parameter of type Engine. That means that we cannot use the carData method without
     * passing in an engine object. We call the car.setEngine method on our car object (created within the constructor).
     * Because the car object is an instance of the class, we are able to use it inside our various methods within
     * the class.
     *
     * Since the carData method is a Car type, we must also return a Car type, so in this case, we just return the car
     * that we created within the constructor, but it now has an engine set and ready to go.
     */
    @Override
    public Car carData(Engine engine) {
        car.setEngine(engine);
        return car;
    }


}
