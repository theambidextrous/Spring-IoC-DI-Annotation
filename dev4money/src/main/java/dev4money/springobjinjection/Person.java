package dev4money.springobjinjection;

public class Person {
	private TakeBath tb;
	private TakeBreakfast tbf;
	
	public void setTb(TakeBath tb) {
		this.tb = tb;
	}
	public void setTbf(TakeBreakfast tbf) {
		this.tbf = tbf;
	}
	
	public void Bathing() {
		tb.Bathing();
	}
	
	public void EatingBreakfast() {
		tbf.Eating();
	}
	
	
}
