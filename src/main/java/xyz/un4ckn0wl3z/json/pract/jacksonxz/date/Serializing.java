package xyz.un4ckn0wl3z.json.pract.jacksonxz.date;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Serializing {

	public static void main(String[] args) throws JsonProcessingException {

		Transaction transaction = new Transaction("transfer", new Date());

		ObjectMapper objectMapper = new ObjectMapper();
		ObjectMapper objectMapper2 = new ObjectMapper();
		String output = objectMapper.writeValueAsString(transaction);

		System.out.println(output);
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		objectMapper2.setDateFormat(dateFormat);

		String output2 = objectMapper2.writeValueAsString(transaction);
		System.out.println(output2);

	}

}
