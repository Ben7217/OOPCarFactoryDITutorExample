package services;


/**
 * The CarFactory will build us a car without ever having to create the object in the
 * Main method (the code within the main method is often referred to as the "client code" or the "business logic").
 */
public class CarFactory {

    //What this method is essentially doing is creating a method of type CarService (our interface) and
    //since the CarServiceImpl implements the interface, CarService, we can then return a new instance of our class
    //CarServiceImpl.

    //When we call CarService.buildCar(), the object will be of type CarServiceImpl, which means we can then use the
    //method within the CarServiceImpl class. Please refer to the Main method to make this a bit more clear.
    public static CarService buildCar() {
        return new CarServiceImpl();
    }
}
