package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class PersonAnyGetter {
	
	   private Map<String, Object> properties = new HashMap<String, Object>();

	    @JsonAnyGetter
	    public Map<String, Object> properties() {
	        return properties;
	    }
	    

}
