package xyz.un4ckn0wl3z.json.pract.jacksonxz.jsongeneratorxz;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;

/*
 * 
 * 
 * 
 * The Jackson JsonGenerator is used to generate JSON from Java objects 
 * (or whatever data structure your code generates JSON from). 
 * 
 * 
 * 
 * */


public class JsonGeneratorxzzx {

	public static void main(String[] args) throws IOException {
		
		JsonFactory jsonFactory = new JsonFactory();
		JsonGenerator jsonGenerator = jsonFactory.createGenerator(new File("data/gen.json"),JsonEncoding.UTF8);
		
		jsonGenerator.writeStartObject();
		jsonGenerator.writeStringField("brand", "Mercedes");
		jsonGenerator.writeNumberField("doors", 5);
		jsonGenerator.writeEndObject();
		
		jsonGenerator.close();
		

	}

}
