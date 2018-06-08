package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class PersonImmutable {

	private long id = 0;
	private String name = null;
	
	@JsonCreator
	public PersonImmutable(@JsonProperty("id")long id, @JsonProperty("name")String name) {
		
		this.id = id;
		this.name = name;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "PersonImmutable [id=" + id + ", name=" + name + "]";
	}
	
	

}
