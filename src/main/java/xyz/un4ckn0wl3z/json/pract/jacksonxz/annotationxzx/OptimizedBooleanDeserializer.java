package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

public class OptimizedBooleanDeserializer extends JsonDeserializer<Boolean>{

	@Override
	public Boolean deserialize(JsonParser arg0, DeserializationContext arg1) throws IOException, JsonProcessingException {
		
		String text = arg0.getText();
		if("0".equals(text)){
			return false;
		}
			return true;
	}
	
	

}
