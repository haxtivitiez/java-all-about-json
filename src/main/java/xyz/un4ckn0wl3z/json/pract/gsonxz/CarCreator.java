package xyz.un4ckn0wl3z.json.pract.gsonxz;

import java.lang.reflect.Type;

import com.google.gson.InstanceCreator;

public class CarCreator implements InstanceCreator<Car> {
    public Car createInstance(Type type) {
        Car car = new Car();
        car.brand = "Toyota";
        return car;
    }
}