package org.kurtlobato.decorator;

import org.kurtlobato.strategy.CarMode;

public interface BaseCar {

    CarMode mode = null;
    
    void drive();
}

