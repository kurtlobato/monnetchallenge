package org.kurtlobato.decorator;

import org.kurtlobato.strategy.CarMode;

public class BasicCar implements BaseCar {

    private CarMode mode;

    public BasicCar(CarMode mode) {
        this.mode = mode;
    }

    @Override
    public void drive() {
        this.mode.use();
    }
}