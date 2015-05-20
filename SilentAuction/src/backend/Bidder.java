package backend;

public class Bidder extends User {

	public Bidder(int generalID, String name, String email, String phoneNum) {
		super(generalID, name, email, phoneNum);
		hash();
	}
	
	public void bid(Item item) {
		
	}

	/*
	 * Not Implemented
	 */
	public void bidQR() {
		
	}
}
