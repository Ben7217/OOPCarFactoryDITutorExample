package services;

import model.Car;
import model.Engine;

public class CarServiceImpl implements CarService {

    private Car car = new Car();

    @Override
    public Car carData(Engine engine) {
        car.setEngine(engine);
        return car;
    }


}
