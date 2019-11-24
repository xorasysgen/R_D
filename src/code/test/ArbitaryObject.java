package code.test;

import java.util.Arrays;

class Person {
	String name;

//constructor
	public Person(String name) {
		this.name = name;
	}

public Person() {
	// TODO Auto-generated constructor stub
}

//instance method 1
	public int personInstanceMethod1(Person person) {
		return this.name.compareTo(person.name);
	}

//instance method 2
	public int personInstanceMethod2(Person person1, Person person2) {
		return person1.name.compareTo(person2.name);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
	
}

class ArbitaryObject {
	public static void main(String[] args) throws Exception {
		Person[] personArray = { new Person("F" ),new Person("A"), new Person("B") };

		// Scenario 1 : Getting compiled successfully
		//Arrays.sort(personArray, Person::personInstanceMethod1);

		// Scenario 2 : Compile failure
		// Arrays.sort(personArray, Person::personInstanceMethod2);

		// Scenario 3 : Getting compiled successfully.
		Person personInstance = new Person();
		Arrays.sort(personArray, personInstance::personInstanceMethod2);

		// Scenario 4 : Getting compiled successfully. As the same way as "Scenario 1"
		String[] stringArray = { "Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda" };
		Arrays.sort(stringArray,(a,b)-> a.compareToIgnoreCase(b));
		
		System.out.println(Arrays.deepToString(personArray));
	}

}