package org.dxc.designpattern.hamburger;

public class SimpleHamburgerFactory{
	
	
	public Hamburger  getInstance(String burgername) {
		
		if (burgername.equals("Veggie")) {
		return new VeggieBurger();
		} else if (burgername.equals("Meat")) {
		return new MeatLoverBurger();
		} else
		return new CheeseBurger();
		}

}
