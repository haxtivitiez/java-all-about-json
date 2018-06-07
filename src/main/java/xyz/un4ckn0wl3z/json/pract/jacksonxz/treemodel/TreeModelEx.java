package xyz.un4ckn0wl3z.json.pract.jacksonxz.treemodel;

import java.io.IOException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TreeModelEx {

	public static void main(String[] args) {

		String carJson = "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";

		ObjectMapper objectMapper = new ObjectMapper();

		try {

			JsonNode node = objectMapper.readValue(carJson, JsonNode.class);
			
			System.out.println(node);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
