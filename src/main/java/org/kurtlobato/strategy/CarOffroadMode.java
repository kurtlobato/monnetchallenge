package org.kurtlobato.strategy;

public class CarOffroadMode implements CarMode {
    @Override
    public void use() {
        System.out.println("Car is in offroad mode");
    }
}