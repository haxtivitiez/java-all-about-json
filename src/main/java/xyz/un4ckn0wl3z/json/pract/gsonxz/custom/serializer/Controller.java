package xyz.un4ckn0wl3z.json.pract.gsonxz.custom.serializer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Controller {

	public static void main(String[] args) {

		PojoWithBoolean pojo = new PojoWithBoolean();
		pojo.username = "abc";
		pojo.isSuperUser = false;

		GsonBuilder builder = new GsonBuilder();

		builder.registerTypeAdapter(Boolean.class, new BooleanSerializer());

		Gson gson = builder.create();

		String pojoJson = gson.toJson(pojo);

		System.out.println(pojoJson);

	}

}
