package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class PersonDeserialize {
	
	public long    id      = 0;
    public String  name    = null;

    @JsonDeserialize(using = OptimizedBooleanDeserializer.class)
    public boolean enabled = false;

	@Override
	public String toString() {
		return "PersonDeserialize [id=" + id + ", name=" + name + ", enabled="
				+ enabled + "]";
	}
    
    
    

}
