package xyz.un4ckn0wl3z.json.pract.boonxz.datezc;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class ParsingaDateStringIntoaDate {
	
	public static void main(String[] args){
		String paymentJson = "{ \"paymentDate\" : \"2015-06-11T12:33:00.014Z\" }";

		ObjectMapper objectMapper = JsonFactory.create();
		//ObjectMapper objectMapper = JsonFactory.createUseJSONDates();

		Payment payment = objectMapper.readValue(paymentJson, Payment.class);

		System.out.println("payment.paymentDate = " + payment.paymentDate);
	}

}
