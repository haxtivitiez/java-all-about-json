package xyz.un4ckn0wl3z.json.pract.jacksonxz.read;

import java.io.Reader;
import java.io.StringReader;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import xyz.un4ckn0wl3z.json.pract.Car;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;


/*
 * 
 * 
 * 
 * 
 * 
 *  The Jackson ObjectMapper class (com.fasterxml.jackson.databind.ObjectMapper) is the simplest way to parse JSON with Jackson. The Jackson ObjectMapper can parse JSON from a string, stream or file, and create a Java object or object graph representing the parsed JSON. Parsing JSON into Java objects is also referred to as to deserialize Java objects from JSON.

The Jackson ObjectMapper can also create JSON from Java objects. Generating JSON from Java objects is also referred to as to serialize Java objects into JSON.

The Jackson Object mapper can parse JSON into objects of classes developed by you, or into objects of the built-in JSON tree model explained later in this tutorial. 
 * 
 * 
 *  - Java objects to JSON = serialize
 * 	- JSON to Java objects =  deserialize 
 * 
 * */

public class ObjectMapperEx {

	public static void main(String[] args) {
		
		// Jackson ObjectMapper Example
		
		ObjectMapper objectMapper = new ObjectMapper();
		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
		String carJson2 = "{ \"brand\" : \"Totota\", \"doors\" : 2 }";
		String carJson3 = "{ \"brand\" : \"Ducati\", \"doors\" : 0 }";
		try {
			
			Car car = objectMapper.readValue(carJson, Car.class);
			System.out.println("car brand = " + car.getBrand());
		    System.out.println("car doors = " + car.getDoors());
		    
		    
		    // Read Object From JSON Reader
		    
		    Reader reader = new StringReader(carJson2);
		    car = objectMapper.readValue(reader, Car.class);
		    System.out.println("car brand = " + car.getBrand());
		    System.out.println("car doors = " + car.getDoors());
		    
		    // Read Object From JSON via URL
		    
		    // Ignore Unknown JSON Fields
		    objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		    

		    
		    URL url = new URL("file:data/car.json");
		    car = objectMapper.readValue(url, Car.class);
		    System.out.println("car brand = " + car.getBrand());
		    System.out.println("car doors = " + car.getDoors());
		    
		    // Read Object From JSON Byte Array
		    byte[] bytes = carJson3.getBytes("UTF-8");
		    car = objectMapper.readValue(bytes, Car.class);
		    System.out.println("car brand = " + car.getBrand());
		    System.out.println("car doors = " + car.getDoors());
		    
		    
		    // Read Object Array From JSON Array String
		    String jsonArray = "[{\"brand\":\"ford\"}, {\"brand\":\"Fiat\"}]";
		    
		    Car[] cars = objectMapper.readValue(jsonArray, Car[].class);
		    System.out.println(Arrays.toString(cars));
		    
		    // Read Object List From JSON Array String
		    List<Car> carList = objectMapper.readValue(jsonArray, new TypeReference<List<Car>>() {});
		    
		    System.out.println("Car list ......");
		    for(Car c:carList){
		    	System.out.println("car brand = " + c.getBrand() +"|"+"car doors = " + c.getDoors());
		    }
		    
		    
		    // Read Map from JSON String
		    String jsonObject = "{\"brand\":\"NISSAN\", \"doors\":4}";
		    Map<String, Object> jsonMap = objectMapper.readValue(jsonObject, new TypeReference<HashMap<String, Object>>() {});
		    
		    System.out.println("Car Map ......");
		    for(Map.Entry<String, Object> obj:jsonMap.entrySet()){

		    	System.out.println("KEY: "+obj.getKey());
		    	System.out.println("VALUE: "+obj.getValue());
		    	
		    }
		    
		    System.out.println(objectMapper.writeValueAsString(jsonMap));
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    
		  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
