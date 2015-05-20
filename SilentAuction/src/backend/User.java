package backend;

public abstract class User {

	private final int generalID;
	private final String name;
	private final String email;
	private final String phoneNum;
	
	public User(int generalID, String name, String email, String phoneNum) {
		this.name = name;
		this.generalID = hash();
		this.email = email;
		this.phoneNum = phoneNum;
	}
	
	public int hash() {
		return name.hashCode(); 
	}
	
	/*
	 * 
	 */
	public void viewStats() {
		
	}
}
