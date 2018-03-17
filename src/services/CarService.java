package services;

import model.Car;
import model.Engine;

/**
 * This is our CarService interface. You will want to use an interface when you want to define
 * a role that other classes can adhere to. Basically, this provides a blueprint that other classes
 * must use. You will note that the method inside the interface has no body(no curly braces). Methods
 * inside interfaces aren't allowed to have a body, as the classes that implement the interface are required
 * to put in their own logic inside the method body.
 */
public interface CarService {

  Car carData(Engine engine);

}
