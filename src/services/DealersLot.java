package services;

import model.Car;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DealersLot {

   public static ArrayList<Car> listOfCars = new ArrayList<>();
   public static ArrayList<Car> carsOnSale = new ArrayList<>();

    public static void addCarToLot(Car car) {
        listOfCars.add(car);
    }

    public static void listCarsOnLot(ArrayList<Car> cars) {

        listOfCars = cars;

        System.out.println("\nI have the following cars on my lot: \n");
        for (Car car : cars) {
            System.out.println(car.getYear() + " " + car.getMake() + " with " + car.getMilage() + " miles. Retail price: $" +
                    car.getPrice());

        }
    }

    public static void addCarsToSaleList(Car car) {
        if(car.getMake().equalsIgnoreCase("acura")) {
            carsOnSale.add(car);
        } else {
            System.out.println("\nWe aren't running a sale on " + car.getMake() + "'s right now!");
        }
    }

    public static void listCarsOnSale(ArrayList<Car> cars) {
        carsOnSale = cars;

        System.out.println("\nI have the following cars ON SALE! \n");
        for(Car car : cars) {
            System.out.println(car.getYear() + " " + car.getMake() + " with " + car.getMilage() + " miles. Retail price: $" +
                    car.getPrice() + " Sale price: $4500.30");
        }
    }
}
