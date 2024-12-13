package org.kurtlobato;

import org.kurtlobato.decorator.BaseCar;
import org.kurtlobato.factory.CarFactory;

public class Main {
    public static void main(String[] args) {
        BaseCar car = CarFactory.createCar("monday");
        car.drive();
        car = CarFactory.createCar("tuesday");
        car.drive();
        car = CarFactory.createCar("wednesday");
        car.drive();
        car = CarFactory.createCar("thursday");
        car.drive();
        car = CarFactory.createCar("friday");
        car.drive();
    }
}