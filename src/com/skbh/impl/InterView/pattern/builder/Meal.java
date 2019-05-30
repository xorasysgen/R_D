package com.skbh.impl.InterView.pattern.builder;

public class Meal {

	private String coldDrink;
	private String burger;
	private String puff;
	private String fryies;
	private String cheeseBurger;
	
	
	public Meal(String coldDrink, String burger, String puff, String fryies,String cheeseBurger) {
		this.coldDrink = coldDrink;
		this.burger = burger;
		this.puff = puff;
		this.fryies = fryies;
		this.cheeseBurger=cheeseBurger;
	}


	@Override
	public String toString() {
		return "Meal [coldDrink=" + coldDrink + ", burger=" + burger
				+ ", puff=" + puff + ", fryies=" + fryies + ", cheeseBurger="
				+ cheeseBurger + "]";
	}
	
	
	
	
}
