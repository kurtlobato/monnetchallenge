package org.kurtlobato.strategy;

public class CarSecretAgentMode implements CarMode {
    @Override
    public void use() {
        System.out.println("Car is in secret agent mode. Activating weapons and camouflage");
    }
}