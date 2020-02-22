package dev4money.springobjinjection;

public class Human {
	private Bath bath;
		
	public void setBath(Bath bath) {
		this.bath = bath;
	}

	public void Bathing() {
		bath.isBathing();
	}
		
}
