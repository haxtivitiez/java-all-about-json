package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "personId"})
public class PersonPropertyOrder {

	public long personId = 0;
	public String name = null;
	

}
