package xyz.un4ckn0wl3z.json.pract.jacksonxz.customdeserializer;

import java.io.IOException;

import xyz.un4ckn0wl3z.json.pract.Car;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class CustomDeserial {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException, JsonMappingException, IOException {
		
		String json = "{ \"brand\" : \"Ford\", \"doors\" : 6 }";
		SimpleModule module = new SimpleModule("CarDeserializer", new Version(3, 1, 8, null, null, null));
		module.addDeserializer(Car.class, new CarDeserializer(Car.class));

		ObjectMapper mapper = new ObjectMapper();
		mapper.registerModule(module);

		Car car = mapper.readValue(json, Car.class);

	}

}
