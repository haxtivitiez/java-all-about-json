package xyz.un4ckn0wl3z.json.pract.boonxz.datezc;

import org.boon.json.JsonFactory;
import org.boon.json.ObjectMapper;

public class ParsingalongIntoaDate {

	public static void main(String[] args) {

		String paymentJson = "{ \"paymentDate\" : 1434016456493 }";

		ObjectMapper objectMapper = JsonFactory.create();

		Payment payment = objectMapper.readValue(paymentJson, Payment.class);
		
		System.out.println(payment.toString());

	}

}
