package xyz.un4ckn0wl3z.json.pract.gsonxz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class SerializingNullFields {

	public static void main(String[] args) {


		GsonBuilder builder = new GsonBuilder();

		builder.serializeNulls();

		Gson gson = builder.create();

		Car car = new Car();
		car.brand = null;

		String json = gson.toJson(car);
		System.out.println(json);

	}

}
