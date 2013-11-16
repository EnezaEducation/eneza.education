package users;

public class Teacher extends User {
	String school;

	public Teacher(String name, String password, int mobile_number,
			String school) {
		super(name, password, mobile_number);
		this.school = school;
		this.user_type = "teacher";
	}

	public Teacher(String name, String password, String email, String school) {
		super(name, password, email);
		this.school = school;
		this.user_type = "teacher";
	}

	
}
