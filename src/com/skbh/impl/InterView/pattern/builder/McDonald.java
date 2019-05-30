package com.skbh.impl.InterView.pattern.builder;

public class McDonald {

	public static void main(String[] args) {
		Meal m=new MealBuilder()
				.setBurger("Allo Tikki")
				.setFryies("large")
				.setColdDrink("pepsi")
				.build();
		//Meal m=new MealBuilder().setBurger("Allo Tikki").setColdDrink("pepsi").prepare();
		
		System.out.println(m);
		System.out.println();

	}

}
