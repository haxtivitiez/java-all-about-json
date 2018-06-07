package xyz.un4ckn0wl3z.json.pract;

public class Car {

	private String brand = null;
	private int doors = 0;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", doors=" + doors + "]";
	}
	
	

}
