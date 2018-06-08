package xyz.un4ckn0wl3z.json.pract.gsonxz;

public class CarExcludeWithTransient {

	public transient String brand = null;
	public int doors = 0;
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", doors=" + doors + "]";
	}
	
	

}
