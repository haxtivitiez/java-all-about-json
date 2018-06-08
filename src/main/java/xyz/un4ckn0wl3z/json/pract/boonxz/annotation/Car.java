package xyz.un4ckn0wl3z.json.pract.boonxz.annotation;

import org.boon.json.annotations.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonInclude;


public class Car {

    public String brand = null;
    public int    doors = 0;

    @JsonIgnore
    public String comment = "blablabla";
    
    @JsonInclude
    public String owner = "Anuwaz";

    public Car() {}

    public Car(String brand, int doors) {
        this.brand = brand;
        this.doors = doors;
    }
    
}