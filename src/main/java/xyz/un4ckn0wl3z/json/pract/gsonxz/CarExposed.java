package xyz.un4ckn0wl3z.json.pract.gsonxz;

import com.google.gson.annotations.Expose;

public class CarExposed {

	@Expose(serialize = false, deserialize = false)
	public String brand = null;

	@Expose(serialize = true, deserialize = true)
	public int doors = 0;
	
	public int ignoreThis = 99;

}
