package org.kurtlobato.strategy;

public class CarCircuitMode implements CarMode {
    @Override
    public void use() {
        System.out.println("Running in circuit");
    }
}