package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AnnotationTester {

	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		
		String personJson = "{\r\n  \"id\"   : 1234,\r\n  \"name\" : \"John\"\r\n}";
		
		ObjectMapper objectMapper = new  ObjectMapper();
		ObjectMapper objectMapperCustomDe = new  ObjectMapper();
		ObjectMapper objectMapperWrite = new  ObjectMapper();
		
		Person person = objectMapper.readValue(personJson, Person.class);
		
		System.out.println(person);
		
		Bag bag = objectMapper.readValue(personJson, Bag.class);
		
		System.out.println(bag);
		
		PersonImmutable personImmutable = objectMapper.readValue(personJson, PersonImmutable.class);
		

		System.out.println(personImmutable);
		
		
		InjectableValues injectableValues = new InjectableValues.Std().addValue(String.class, "www.un4ckn0wl3z.xyz");
		PersonInject personInject = new ObjectMapper().reader(injectableValues).forType(PersonInject.class).readValue(new File("data/person.json"));
		System.out.println(personInject);
		
		
		@SuppressWarnings("deprecation")
		PersonDeserialize personDe = objectMapperCustomDe
		        .reader(PersonDeserialize.class)
		        .readValue(new File("data/person-optimized-boolean.json"));
		
		System.out.println(personDe.toString());
		
		System.out.println(objectMapperWrite.writeValueAsString(new PersonInclude()));
		System.out.println(objectMapperWrite.writeValueAsString(new PersonGetter()));
		System.out.println(objectMapperWrite.writeValueAsString(bag));
		
		
		
		
		String personJsonOrder = "{\r\n  \"personId\"   : 1234,\r\n  \"name\" : \"John\"\r\n}";
		
		PersonPropertyOrder personPropertyOrder = objectMapper.readValue(personJsonOrder, PersonPropertyOrder.class);
		
		System.out.println(objectMapperWrite.writeValueAsString(personPropertyOrder));
		
		System.out.println(objectMapperWrite.writeValueAsString(new PersonRawValue()));
		System.out.println(objectMapperWrite.writeValueAsString(new PersonValue()));
		System.out.println(objectMapperWrite.writeValueAsString(new PersonSerializer()));
		
		
		
		
	}

}
