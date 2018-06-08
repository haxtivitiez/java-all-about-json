package xyz.un4ckn0wl3z.json.pract.boonxz.annotation;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class ControllerBoon {

	public static void main(String[] args) {
		
		ObjectMapper mapper = JsonFactory.create();

		String json = mapper.writeValueAsString(new Car("NISSAN",4));
		System.out.println(json);

	}

}
