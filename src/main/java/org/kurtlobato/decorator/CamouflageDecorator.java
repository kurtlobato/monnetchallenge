package org.kurtlobato.decorator;

public class CamouflageDecorator implements BaseCar {
    private final BaseCar car;

    public CamouflageDecorator(BaseCar car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
        System.out.println("Camouflage activated");
    }
}