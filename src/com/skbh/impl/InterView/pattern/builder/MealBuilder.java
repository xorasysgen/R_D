package com.skbh.impl.InterView.pattern.builder;

public class MealBuilder {
	
	private String coldDrink;
	private String burger;
	private String puff;
	private String fryies;
	private String cheeseBurger;
	
	
	public MealBuilder setColdDrink(String coldDrink) {
		this.coldDrink = coldDrink;
		return this;
	}
	public MealBuilder setBurger(String burger) {
		this.burger = burger;
		return this;
	}
	public MealBuilder setPuff(String puff) {
		this.puff = puff;
		return this;
	}
	public MealBuilder setFryies(String fryies) {
		this.fryies = fryies;
		return this;
	}
	public MealBuilder setCheeseBurger(String cheeseBurger) {
		this.cheeseBurger = cheeseBurger;
		return this;
	}
	
	public Meal build(){
		return new Meal(coldDrink, burger, puff, fryies, cheeseBurger);
	}

}
