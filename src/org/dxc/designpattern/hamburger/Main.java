package org.dxc.designpattern.hamburger;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		SimpleHamburgerFactory factory=new SimpleHamburgerFactory();
		HamburgerStore store=new HamburgerStore();
		store.order();
		String name;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
	
		//Hamburger.getInstance(name);
		
		
		System.out.println("----------------------------");
		
		// Veggie object
		if(n == 1) {
		Hamburger burger1=factory.getInstance("Veggie");
		burger1.prepare();
		burger1.cook();
		burger1.box();
		//System.out.println("My vehicle speed is "+speed1);
		System.out.println("----------------------------");
		}
		else if(n==2) {
		//Cheese Object
		Hamburger burger2=factory.getInstance("Meat");
		burger2.prepare();
		burger2.cook();
		burger2.box();
		System.out.println("----------------------------");
		}
		
		else {
		
		//Meat object
		Hamburger burger3=factory.getInstance("Cheese");
		burger3.prepare();
		burger3.cook();
		burger3.box();
		System.out.println("----------------------------");
		}

	}

}
