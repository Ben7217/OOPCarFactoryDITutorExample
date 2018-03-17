package app;

import model.Engine;
import services.CarFactory;
import services.CarService;
import services.DealersLot;

public class Main {

    public static void main(String[] args) {

        //In order to create a car object, we required an Engine within our interface. So lets go ahead and
        //create an engine:
        Engine acuraEngine = new Engine("V6", "Gas");


        //Here is where things get interesting.
        //In order to create a car object, we use our interface, CarService and after creating a variable name,
        //we set it equal to the CarFactory.buildCar(). buildCar() is a method within the CarFactory.
        //This all works because the CarServiceImpl implements the CarService interface AND the buildCar() method
        //returns a new instance of the CarServiceImpl

        //This is where things get dicey, so I suggest studying this relationship between these classes carefully
        //Mess with the code, break the code, and try to fix it again. You can always refer to the repo if you get stuck
        //or can't fix it.

        CarService acura = CarFactory.buildCar();

        //at this point our acura object is of type CarServiceImpl. It is not a car object... YET!

        //in order to create a car object, we have to call our carData method!
        //If you remember, our carData method is of type car and returns a new Car instance.
        //You will also notice that you cannot invoke the carData method without injecting the engine type into its
        //argument list. This is Dependency Injection.

        //after you have typed acura.carData(acuraEngine), type the . operator. As soon as you do, the IDE will
        //list all of the getters and setters that we had created in our Car class. What this means is we are NOW creating
        //a Car object, but it is entirely encapsulated within our other classes.
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