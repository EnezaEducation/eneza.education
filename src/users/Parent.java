package users;

public class Parent extends User{
	
	public Parent(String name, String password, int number){
		super(name, password, number);
		this.user_type = "parent";
		this.user_id = getNewUserID();
	}
	
	public Parent(String name, String password, String email){
		super(name, password, email);
		this.user_type = "parent";
		this.user_id = getNewUserID();
	}

}
