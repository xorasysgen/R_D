package com.skbh.impl.inheritance;

class Halter{  // it is example of [ autowired ] as dependency injection
	//Has a relation with Horse
	public String tieRope() {
		return "Halter tie Rope";		
	}

	Halter(){
		System.out.println("Halter Construtor");
	}
}

class Animal{
	
	static int x;
	Animal(){
		System.out.println("Animal Construtor");
	}
	
	public String Walk() {
		return "Animal walk";
	}
	
	public Animal getObject() {
		return new Animal();
		
	}
	
}

class Horse  extends Animal{
	//IS a relation with Animal
	private Halter halter;
	
	Horse() {
		super();
		System.out.println("Horse Construtor");
	}
	
	public String Walk(String t) {
		return "Animal walk" + t;
	}
	
	@Override
	public String Walk() {
		return super.Walk() + " Horse Walk";
	}

	public Halter getHalter() {
		halter=new Halter();
		return halter;
	}

	public void setHalter(Halter halter) {
		this.halter = halter;
	}
	
}

public class IsAHasARelation {

	public static void main(String[] args) {
		//Animal animal=new Animal(); 
		Horse horse=new Horse();
		//Horse h=(Horse)animal;
		if(horse instanceof Animal) {
			System.out.println("horse is animal object");
		}
		else {
			System.out.println("horse is not animal object");
		}
		System.out.println(horse.Walk());
		System.out.println(horse.Walk("Test"));
		System.out.println(horse.getHalter().tieRope());
		
	}

}
