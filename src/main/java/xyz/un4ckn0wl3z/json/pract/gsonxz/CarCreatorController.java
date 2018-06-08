package xyz.un4ckn0wl3z.json.pract.gsonxz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class CarCreatorController {

	public static void main(String[] args) {

		GsonBuilder gsonBuilder = new GsonBuilder();

		gsonBuilder.registerTypeAdapter(Car.class, new CarCreator());

		Gson gson = gsonBuilder.create();
		
		String carJson = "{ \"doors\" : 4 }";

		Car car = gson.fromJson(carJson, Car.class);

		System.out.println(car);
		
		
	}

}
