package dev4money.spring.annotation.classes;

import org.springframework.stereotype.Component;

//@Component("collegebean")
// ALTERNATIVELY ===> we could remove the above @component annot, then define a @Bean method in Beans.java where the method name becomes our bean Id
//check out the Beans.java for @bean
/**
 * if @component has not name defined.. by default spring will use class name but with lowecase first letter
 * @author jotuya
 *
 */
public class College {
	public void Test() {
		System.out.println("Tested weeeeeeell");
	}
}
