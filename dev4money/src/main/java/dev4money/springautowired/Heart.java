package dev4money.springautowired;

public class Heart {
	private String nameofMammal;
	private int noOfhearts;
	
	public void setNameofMammal(String nameofMammal) {
		this.nameofMammal = nameofMammal;
	}
	
	public void setNoOfhearts(int noOfhearts) {
		this.noOfhearts = noOfhearts;
	}
	
	public String getNameofMammal() {
		return nameofMammal;
	}

	public int getNoOfhearts() {
		return noOfhearts;
	}

	public void isPumping() {
		System.out.println("Heart is pumping. The mammal is alive!");
	}
}
