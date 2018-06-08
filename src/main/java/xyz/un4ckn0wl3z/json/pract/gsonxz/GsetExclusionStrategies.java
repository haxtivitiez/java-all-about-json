package xyz.un4ckn0wl3z.json.pract.gsonxz;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsetExclusionStrategies {

	public static void main(String[] args) {


		ExclusionStrategy exclusionStrategy = new ExclusionStrategy() {
		    public boolean shouldSkipField(FieldAttributes fieldAttributes) {
		        if("brand".equals(fieldAttributes.getName())){
		            return true;
		        }
		        return false;
		    }

		    public boolean shouldSkipClass(Class aClass) {
		        return false;
		    }
		};
		
		
		GsonBuilder builder = new GsonBuilder();
		builder.setExclusionStrategies(exclusionStrategy);

		Gson gson = builder.create();
		
		System.out.println(gson.toJson(new Car()));

	}

}
