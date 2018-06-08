package xyz.un4ckn0wl3z.json.pract.gsonxz;

import com.google.gson.Gson;

public class ParsingJSONIntoJavaObjects {

	public static void main(String[] args) {

		String json = "{\"brand\":\"Jeep\", \"doors\": 3}";

		Gson gson = new Gson();

		Car car = gson.fromJson(json, Car.class);
		
		System.out.println(car);

	}

}
