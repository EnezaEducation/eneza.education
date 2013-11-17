package gsonRegistrationStruct;

import com.google.gson.JsonObject;

public class Registration {
	public String name;
	public String password;
	public String mobile_no;
	public String email;
	public UserType usrType;
	
	public Registration(String name, String password, String mobile_no, String email, UserType usrType) throws IncorrectParametersException {
		if(!name.contains(" ")) {
			throw new IncorrectParametersException();
		}
		this.name = name;
		this.password = password;
		if(mobile_no.matches("\\+\\d+")) {
			this.mobile_no = mobile_no;
		} else {
			throw new IncorrectParametersException();
		}
		if(email.contains("@") && email.contains(".")) {
			this.email = email;
		} else {
			throw new IncorrectParametersException();
		}
		this.usrType = usrType;
	}
	
	public JsonObject getDataInJSONFormat() {
		JsonObject obj = new JsonObject();
		obj.addProperty("names", this.name);
		obj.addProperty("password", this.password);
		obj.addProperty("mobile_number", this.mobile_no);
		obj.addProperty("email", this.email);
		obj.addProperty("user_type", this.usrType.toString());
		return obj;
	}
	
	/*public String[][] getDataInGSONFormat() {
		String[][] data = new String[5][2];
		String fullName = "";
		for(int i=0; i<this.name.length; i++) {
			fullName += this.name[i] + " ";
		}
		data[0][0] = "Name";
		data[0][1] = fullName.substring(0, fullName.lastIndexOf(" "));
		data[1][0] = "Password";
		data[1][1] = this.password;
		data[2][0] = "Mobile Number";
		data[2][1] = this.mobile_no;
		data[3][0] = "Email";
		data[3][1] = ""
		return data;
	}*/
}
