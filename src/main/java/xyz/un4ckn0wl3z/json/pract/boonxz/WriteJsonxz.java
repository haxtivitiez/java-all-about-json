package xyz.un4ckn0wl3z.json.pract.boonxz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class WriteJsonxz {

	public static void main(String[] args) throws FileNotFoundException {

		Fleet fleet = new Fleet();
		fleet.cars = new Car[1];
		fleet.cars[0] = new Car("Mercedes", 5);

		ObjectMapper mapper = JsonFactory.create();

		String json = mapper.writeValueAsString(fleet);
		System.out.println(json);
		
		mapper.writeValue(new FileOutputStream("data/outputFleet.json"),fleet);

	}

}
