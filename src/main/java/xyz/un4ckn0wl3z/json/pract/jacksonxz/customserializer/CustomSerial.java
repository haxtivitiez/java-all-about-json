package xyz.un4ckn0wl3z.json.pract.jacksonxz.customserializer;

import xyz.un4ckn0wl3z.json.pract.Car;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class CustomSerial {

	public static void main(String[] args) throws JsonProcessingException {

		CarSerializer carSerializer = new CarSerializer(Car.class);
		ObjectMapper objectMapper = new ObjectMapper();

		SimpleModule module = new SimpleModule("CarSerializer", new Version(2,
				1, 3, null, null, null));
		module.addSerializer(Car.class, carSerializer);

		objectMapper.registerModule(module);

		Car car = new Car();
		car.setBrand("Mercedes");
		car.setDoors(5);

		String carJson = objectMapper.writeValueAsString(car);
		System.out.println(carJson);

	}

}
