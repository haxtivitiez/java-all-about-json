package xyz.un4ckn0wl3z.json.pract.boonxz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class GeneratingJSONFromMaps {

	public static void main(String[] args) throws FileNotFoundException {
		
		Map car = new HashMap();
		car.put("brand", "BMW");
		car.put("doors", 4);
		
		List cars = new ArrayList();
		cars.add(car);
		
		Map fleet = new HashMap();
		fleet.put("cars", cars);
		
		ObjectMapper mapper = JsonFactory.create();
		String json = mapper.writeValueAsString(fleet);
		System.out.println(json);

		mapper.writeValue(new FileOutputStream("data/output-map-cars-fleet.json"),fleet);


	}

}
