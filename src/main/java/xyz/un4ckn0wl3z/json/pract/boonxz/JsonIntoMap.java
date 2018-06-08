package xyz.un4ckn0wl3z.json.pract.boonxz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class JsonIntoMap {

	public static void main(String[] args) throws FileNotFoundException {

		String fleetStr = "{" + "  \"cars\" : ["
				+ "     { \"brand\" : \"Audi\", \"doors\" : 4 }"
				+ "    ,{ \"brand\" : \"Mercedes\", \"doors\" : 3}"
				+ "    ,{ \"brand\" : \"BMW\",  \"doors\" : 2 }" + "  ]" + "}";
		
		
		//System.out.println(fleetStr.replace(" ", ""));
		
		ObjectMapper mapper = new JsonFactory().create();
		
		Fleet fleet = mapper.readValue(new FileInputStream("data/fleet.json"), Fleet.class);
		
		Map fleetMap = mapper.readValue(fleetStr, Map.class);
		
		System.out.println(fleetMap);
		
		List<Map> carList = (List<Map>) fleetMap.get("cars");
		
		for(Map carMap : carList){
		    String brand = (String) carMap.get("brand");
		    int    doors = (Integer)carMap.get("doors");

		    System.out.println("brand: " + brand);
		    System.out.println("doors: " + doors);
		}
		
		
		

	}

}
