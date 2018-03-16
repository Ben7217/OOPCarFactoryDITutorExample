package app;

import model.Engine;
import services.CarFactory;
import services.CarService;
import services.DealersLot;

public class Main {

    public static void main(String[] args) {

        Engine acuraEngine = new Engine("100 HP", "Gas");

        CarService acura = CarFactory.buildCar();

        acura.carData(acuraEngine).setMake("Acura");
        acura.carData(acuraEngine).setModel("TL");
        acura.carData(acuraEngine).setDoors(4);
        acura.carData(acuraEngine).setEngine(acuraEngine);
        acura.carData(acuraEngine).setTires("Michelin");
        acura.carData(acuraEngine).setMilage(29009);
        acura.carData(acuraEngine).setYear("2008");
        acura.carData(acuraEngine).setPrice(6000.50);

        CarService volvo = CarFactory.buildCar();
        Engine volvoEngine = new Engine("80 HP", "Diesel");

        volvo.carData(volvoEngine).setMilage(200450);
        volvo.carData(volvoEngine).setDoors(4);
        volvo.carData(volvoEngine).setTires("Swedish Rugged");
        volvo.carData(volvoEngine).setMake("Volvo");
        volvo.carData(volvoEngine).setModel("240");
        volvo.carData(volvoEngine).setPrice(500.12);
        volvo.carData(volvoEngine).setYear("1984");

        Engine fordEnginge = new Engine("180 HP", "Gas");
        CarService fordTruck = CarFactory.buildCar();
        fordTruck.carData(fordEnginge).setYear("2017");
        fordTruck.carData(fordEnginge).setPrice(48150.65);
        fordTruck.carData(fordEnginge).setModel("F-150");
        fordTruck.carData(fordEnginge).setMake("Ford");
        fordTruck.carData(fordEnginge).setTires("Firestone");
        fordTruck.carData(fordEnginge).setDoors(4);
        fordTruck.carData(fordEnginge).setMilage(3000);


        System.out.println(acura.carData(acuraEngine));
        System.out.println(volvo.carData(volvoEngine));
        System.out.println(fordTruck.carData(fordEnginge));

//        if (volvo.carData(volvoEngine).getDoors() <= 2) {
//            System.out.println("Where do I put all my stuff?");
//        } else {
//            System.out.println("Lots of room for all my junk!");
//        }



        DealersLot.addCarToLot(acura.carData(acuraEngine));
        DealersLot.addCarToLot(volvo.carData(volvoEngine));
        DealersLot.addCarToLot(fordTruck.carData(fordEnginge));

        DealersLot.listCarsOnLot(DealersLot.listOfCars);

        DealersLot.addCarsToSaleList(acura.carData(acuraEngine));
        DealersLot.listCarsOnSale(DealersLot.carsOnSale);

        DealersLot.addCarsToSaleList(fordTruck.carData(fordEnginge));

    }
}