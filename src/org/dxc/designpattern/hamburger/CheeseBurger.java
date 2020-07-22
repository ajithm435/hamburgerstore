package org.dxc.designpattern.hamburger;

public class CheeseBurger extends Hamburger{
	
	public void prepare() {
		System.out.println("Preparing CheeseBurger");
		}
		
	public void cook() {
		System.out.println("Cooking CheeseBurger");
	}

	public void box() {
		System.out.println("Your CheeseBurger is ready");
	}

}
