package services;

public class CarFactory {

    public static CarService buildCar() {
        return new CarServiceImpl();
    }
}
