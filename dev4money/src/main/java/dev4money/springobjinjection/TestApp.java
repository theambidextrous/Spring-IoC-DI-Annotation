package dev4money.springobjinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
//		manually inject objects into Person class ==> Takebath & takeBreakfast are dependencies for Person.
//		Test and it will work... 
//		##############################
//		Person p = new Person();
//		TakeBath tb = new TakeBath();
//		TakeBreakfast tbf = new TakeBreakfast();
//		p.setTb(tb);
//		p.setTbf(tbf);
//		p.Bathing();
//		p.EatingBreakfast();
//		#####################################
//		Now let us look at the same thing done by SPRING OBJECT INJECTION
//		NOTICE - how spring does the object creation and injection in person class
//		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
//		Person p  = a.getBean("person", Person.class);
//		p.Bathing();
//		p.EatingBreakfast();
//		
//		AnotherPerson ap = a.getBean("anotherperson", AnotherPerson.class);
//		ap.Bathing();
//		ap.EatingBreakfast();
//		## LOOSE COUPLING SUING INTERFACE ###########################################################################
		ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
		Human h = a.getBean("human", Human.class);
		h.Bathing();
	}
}
