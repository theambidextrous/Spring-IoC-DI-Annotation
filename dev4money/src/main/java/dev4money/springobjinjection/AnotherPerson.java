package dev4money.springobjinjection;

public class AnotherPerson {
	private TakeBath atb;
	private TakeBreakfast atbf;
	
	public void setAtb(TakeBath atb) {
		this.atb = atb;
	}
	public void setAtbf(TakeBreakfast atbf) {
		this.atbf = atbf;
	}
	
	public void Bathing() {
		atb.Bathing();
	}
	
	public void EatingBreakfast() {
		atbf.Eating();
	}
	
}
