package xyz.un4ckn0wl3z.json.pract.jacksonxz.write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import xyz.un4ckn0wl3z.json.pract.Car;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperWriteEx {

	public static void main(String[] args) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException {
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		Car car = new Car();
		car.setBrand("BMW");
		car.setDoors(4);
		
		objectMapper.writeValue(new FileOutputStream("data/output-2.json"), car);
		String json = objectMapper.writeValueAsString(car);
		System.out.println(json);
	}

}
