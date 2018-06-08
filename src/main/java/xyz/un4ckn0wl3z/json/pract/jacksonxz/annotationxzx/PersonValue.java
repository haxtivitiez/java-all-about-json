package xyz.un4ckn0wl3z.json.pract.jacksonxz.annotationxzx;

import com.fasterxml.jackson.annotation.JsonValue;

public class PersonValue {
	

    public long   personId = 0;
    public String name = null;

    @JsonValue
    public String toJson(){
        // return this.personId + "," + this.name;
    	return "WTF";
    }

}
