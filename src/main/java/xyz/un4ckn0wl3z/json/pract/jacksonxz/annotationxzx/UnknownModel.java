package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;

public class UnknownModel {
	
	private Map<String, Object> properties = new HashMap<String, Object>();

	@JsonAnySetter
	public void set(String fieldName, Object value) {
		this.properties.put(fieldName, value);
	}

	@JsonAnyGetter
	public Object get(String fieldName) {
		return this.properties.get(fieldName);
	}
	
	@JsonAnyGetter
	public Map<String, Object> get() {
		return this.properties;
	}

	@Override
	public String toString() {
		return "UnknownModel [properties=" + properties + "]";
	}

}
