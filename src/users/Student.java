package users;

public class Student extends User {
	String school;
	boolean gender;
	int level;

	public Student(String name, String password, int number, int level, String school, boolean gender){
		super(name, password, number);
		this.user_type = "student";
		this.school = school;
		this.gender = gender;
		this.level = level;
		this.user_id = getNewUserID();
	}
	
	public Student(String name, String password, String email, int level, String school, boolean gender){
		super(name, password, email);
		this.user_type = "student";
		this.school = school;
		this.gender = gender;
		this.level = level;
		this.user_id = getNewUserID();
	}
	

}
