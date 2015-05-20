package backend;

import java.util.ArrayList;
import java.util.List;

public class Donor extends User {
	
	private List<Item> donorItems;

	public Donor(int generalID, String name, String email, String phoneNum) {
		super(generalID, name, email, phoneNum);
		donorItems = new ArrayList<Item>();
	}
	
	public void DonateItem(Item item) {
		
	}
	
	/*
	 * Not Implemented
	 */
	public void donateMoney(double money) {
		
	}

}
