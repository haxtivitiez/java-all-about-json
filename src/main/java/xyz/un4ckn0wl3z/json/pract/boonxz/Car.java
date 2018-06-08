package xyz.un4ckn0wl3z.json.pract.boonxz;

public class Car {
	
	public String brand = null;
	public int doors = 0;

	public Car() {
	}

	public Car(String brand, int doors) {
		this.brand = brand;
		this.doors = doors;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", doors=" + doors + "]";
	}

	
	
}
