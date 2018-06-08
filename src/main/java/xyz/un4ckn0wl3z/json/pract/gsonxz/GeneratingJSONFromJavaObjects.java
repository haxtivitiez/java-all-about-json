package xyz.un4ckn0wl3z.json.pract.gsonxz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GeneratingJSONFromJavaObjects {

	public static void main(String[] args) {

		Car car = new Car();
		car.brand = "Rover";
		car.doors = 5;
		
		CarExcludeWithTransient carExcludeWithTransient = new CarExcludeWithTransient();
		carExcludeWithTransient.brand = "Rover";
		carExcludeWithTransient.doors = 5;

		Gson gson = new Gson();

		String json = gson.toJson(car);
		
		System.out.println(json);
		
		Gson gsonPretty = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonPretty = gsonPretty.toJson(car);
		
		System.out.println(jsonPretty);
		
		
		String jsonPrettyExculde = gsonPretty.toJson(carExcludeWithTransient);
		System.out.println(jsonPrettyExculde);

	}

}
