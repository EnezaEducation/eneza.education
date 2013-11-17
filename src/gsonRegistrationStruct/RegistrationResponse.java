package gsonRegistrationStruct;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class RegistrationResponse {
	public int userId;
	public String username;
	
	public RegistrationResponse(JsonObject obj) {
		JsonObject uid = obj.getAsJsonObject("user_id");
		JsonObject uname = obj.getAsJsonObject("username");
		this.userId = Integer.parseInt(uid.getAsString());
		this.username = uname.getAsString();
	}
}
