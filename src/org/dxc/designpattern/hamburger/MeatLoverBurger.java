package org.dxc.designpattern.hamburger;

public class MeatLoverBurger extends Hamburger{
	
	public void prepare() {
		System.out.println("Preparing MeatLoverBurger");
		}
		
	public void cook() {
		System.out.println("Cooking MeatLoverBurger");
	}

	public void box() {
		System.out.println("Your MeatLoverBurger is ready");
	}

}
