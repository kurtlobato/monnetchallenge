package org.kurtlobato.factory;

import org.kurtlobato.decorator.BaseCar;
import org.kurtlobato.decorator.BasicCar;
import org.kurtlobato.decorator.CamouflageDecorator;
import org.kurtlobato.decorator.WeaponsDecorator;
import org.kurtlobato.strategy.*;

public class CarFactory {
    public static BaseCar createCar(String weekDay) {
        return switch (weekDay) {
            case "monday" -> new BasicCar(new CarWorkMode());
            case "tuesday" -> new BasicCar(new CarCircuitMode());
            case "wednesday", "thursday" -> new BasicCar(new CarOffroadMode());
            case "friday" -> new WeaponsDecorator(new CamouflageDecorator(new BasicCar(new CarSecretAgentMode())));
            default -> throw new IllegalArgumentException("Weekday not supported: " + weekDay);
        };
    }
}