package dev4money.springautowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Body {
 public static void main(String[] args) {
	ApplicationContext a = new ClassPathXmlApplicationContext("Beans.xml");
	Mammal mammal = a.getBean("mammal", Mammal.class);
	mammal.StartPumping();
 }
}
