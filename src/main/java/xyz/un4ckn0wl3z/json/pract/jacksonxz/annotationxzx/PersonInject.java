package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import com.fasterxml.jackson.annotation.JacksonInject;

public class PersonInject {
	

    public long   id   = 0;
    public String name = null;

    @JacksonInject
    public String source = null;
    
    

	@Override
	public String toString() {
		return "PersonInject [id=" + id + ", name=" + name + ", source="
				+ source + "]";
	}
    
    

}
