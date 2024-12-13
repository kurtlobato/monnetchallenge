package org.kurtlobato.strategy;

public class CarWorkMode implements CarMode {
    @Override
    public void use() {
        System.out.println("Driving car to work");
    }
}