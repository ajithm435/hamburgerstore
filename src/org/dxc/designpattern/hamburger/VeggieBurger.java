package org.dxc.designpattern.hamburger;

public class VeggieBurger extends Hamburger{
	
	
	public void prepare() {
		System.out.println("Preparing Veggieburger");
		}
		
		public void cook() {
			System.out.println("Cooking Veggieburger");
			}

		public void box() {
			System.out.println("Your Veggieburger is ready");
			}
	

}
