package dev4money.springobjinjection;

public class ChildBath implements Bath{

	@Override
	public void isBathing() {
		System.out.println("Child is now taking a bath...!");
	}
	
}
