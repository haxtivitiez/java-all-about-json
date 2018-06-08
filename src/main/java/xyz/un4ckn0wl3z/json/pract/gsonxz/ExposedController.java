package xyz.un4ckn0wl3z.json.pract.gsonxz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ExposedController {

	public static void main(String[] args) {

		GsonBuilder builder = new GsonBuilder();
		//builder.excludeFieldsWithoutExposeAnnotation();
		Gson gson = builder.create();
		
		System.out.println(gson.toJson(new CarExposed()));

	}

}
