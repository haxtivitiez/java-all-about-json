package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import com.fasterxml.jackson.annotation.JsonSetter;

public class Person {

	private long personId = 0;
	private String name = null;
	public long getPersonId() {
		return personId;
	}
	
	@JsonSetter("id")
	public void setPersonId(long personId) {
		this.personId = personId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [personId=" + personId + ", name=" + name + "]";
	}
	
	

}
