package org.kurtlobato.decorator;

public class WeaponsDecorator implements BaseCar {
    private final BaseCar car;

    public WeaponsDecorator(BaseCar car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
        System.out.println("Weapons locked and loaded");
    }
}