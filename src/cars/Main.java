package cars;

import cars.Car;

public class Main {

    public static void main(String[] args) {

        //Instantiation
        //Create an instance of a class
        //myCar is an instance of Car
        Car myCar = new Car();
        myCar.make = "Toyota";
        myCar.owner = "Ben";
        myCar.info();

        Car yourCar = new Car();
        yourCar.make = "BMW";
        yourCar.owner = "Stan"; 
        yourCar.info();

        // Car trailer for 6 cars
        Car[] trailer = new Car[6];
        trailer[6] = myCar;

    }

}   
