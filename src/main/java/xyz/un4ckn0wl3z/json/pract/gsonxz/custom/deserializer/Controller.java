package xyz.un4ckn0wl3z.json.pract.gsonxz.custom.deserializer;

import xyz.un4ckn0wl3z.json.pract.gsonxz.custom.serializer.PojoWithBoolean;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Controller {

	public static void main(String[] args) {
		
		GsonBuilder builder = new GsonBuilder();
		builder.registerTypeAdapter(Boolean.class, new BooleanDeserializer());

		Gson gson = builder.create();
		
		String jsonSource = "{\"username\":\"abc\",\"isSuperUser\":1}";

		PojoWithBoolean pojo = gson.fromJson(jsonSource, PojoWithBoolean.class);

		System.out.println(pojo);

	}

}
