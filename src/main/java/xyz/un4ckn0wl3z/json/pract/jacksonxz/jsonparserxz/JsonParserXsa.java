package xyz.un4ckn0wl3z.json.pract.jacksonxz.jsonparserxz;

import java.io.IOException;

/*
 * 
 *  The Jackson JsonParser class is a low level JSON parser. It is similar to the Java StAX parser for XML, except the JsonParser parses JSON and not XML.

 The Jackson JsonParser works at a lower level than the Jackson ObjectMapper. This makes the JsonParser faster than the ObjectMapper, but also more cumbersome to work with. 
 * 
 * */

import xyz.un4ckn0wl3z.json.pract.Car;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

public class JsonParserXsa {

	public static void main(String[] args) throws JsonParseException,
			IOException {

		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		JsonFactory jsonFactory = new JsonFactory();
		JsonParser jsonParser = jsonFactory.createParser(carJson);
		// System.out.println(jsonParser);
		Car car = new Car();
		while (!jsonParser.isClosed()) {
			JsonToken jsonToken = jsonParser.nextToken();

			// System.out.println("jsonToken = " + jsonToken);
			if (JsonToken.FIELD_NAME.equals(jsonToken)) {
				String fieldName = jsonParser.getCurrentName();
				System.out.println(fieldName);

				jsonToken = jsonParser.nextToken();

				if ("brand".equals(fieldName)) {
					car.setBrand(jsonParser.getValueAsString());
				} else if ("doors".equals(fieldName)) {
					car.setDoors(jsonParser.getValueAsInt());
				}
			}
		}
		System.out.println("car.brand = " + car.getBrand());
		System.out.println("car.doors = " + car.getDoors());

	}

}
