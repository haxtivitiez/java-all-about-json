package xyz.un4ckn0wl3z.json.pract.boonxz.annotation;

import java.util.Map;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class ParsingPrimitives {

	public static void main(String[] args) {


		ObjectMapper objectMapper = JsonFactory.create();

		int intVal = objectMapper.parser().parseInt("123");
		
		System.out.println(intVal+2);
		
		int[] ints = objectMapper.parser().parseIntArray("[123, 456, 789]");
		
		for(int num:ints){
			System.out.println(num+1);
		}
		
		
		String jsonMap = "{ \"key1\" : \"val1\", \"key2\" : \"val2\" }";

		Map<String, Object> map = objectMapper.parser().parseMap(jsonMap);
		
		for(Map.Entry<String, Object> item:map.entrySet()){
			System.out.println(item.getKey() + " = " + item.getValue());
		}
		

	}

}
