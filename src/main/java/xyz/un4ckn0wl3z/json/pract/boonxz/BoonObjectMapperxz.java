package xyz.un4ckn0wl3z.json.pract.boonxz;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class BoonObjectMapperxz {

	public static void main(String[] args) {
		
		ObjectMapper mapper = new JsonFactory().create();
		String fleetStr = "{" +
		        "  \"cars\" : [" +
		        "     { \"brand\" : \"Audi\", \"doors\" : 4 }" +
		        "    ,{ \"brand\" : \"Mercedes\", \"doors\" : 3}" +
		        "    ,{ \"brand\" : \"BMW\",  \"doors\" : 2 }" +
		        "  ]" +
		        "}";
		
	System.out.println(fleetStr.replace(" ", ""));
	
	Fleet fleet = mapper.fromJson(fleetStr,Fleet.class);
	
	System.out.println(fleet.toString());
	
	


	}

}
