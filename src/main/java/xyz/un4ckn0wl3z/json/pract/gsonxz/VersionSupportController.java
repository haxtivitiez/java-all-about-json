package xyz.un4ckn0wl3z.json.pract.gsonxz;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VersionSupportController {

	public static void main(String[] args) {


//		GsonBuilder builder = new GsonBuilder();
//		builder.setVersion(2.0);
//
//		Gson gson = builder.create();
		
		Person person     = new Person();
		person.firstName  = "John";
		person.lastName   = "Doe";
		person.middleName = "Blocks";
		person.email      = "john@doe.com";

		GsonBuilder builder = new GsonBuilder();
		builder.setVersion(2.0);

		Gson gson = builder.create();

		String personJson = gson.toJson(person);

		System.out.println(personJson);
		
		String personJson2  = "{\"firstName\":\"John\",\"lastName\":\"Doe\",\"middleName\":\"Blocks\",\"email\":\"john@doe.com\"}";

		Person personRead = gson.fromJson(personJson2, Person.class);
		
		System.out.println(personRead);

	}

}
