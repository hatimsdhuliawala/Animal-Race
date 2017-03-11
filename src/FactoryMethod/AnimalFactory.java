package FactoryMethod;

import Decorator.*;

//Assignment 4- Abstract Factory and singleton design pattern implementation
public class AnimalFactory {
	
	static AnimalFactory p=null;
	//Singleton design pattern implementation
	private AnimalFactory() {
	}

	//Singleton design pattern to ensure that object is created only when it not already created
	public static synchronized AnimalFactory getfactory() {
		if (p == null) {
			p = new AnimalFactory();
			return p;
		}
		return p;
	}
	//Singleton design pattern to ensure that clone is disabled
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	//getAnimal method will get different animal objects based on the string parameters that is passed
	public Animal getAnimal(String animalName) {

		Animal animal=null;
		if(animalName.equals("Poodle")){
			animal = Poodle.getAnimal();
		}
	
		else if(animalName.equals("Dalmation")){
			animal = Persian.getAnimal();
		}
		else if(animalName.equals("FoxSparrow")){
			animal = FoxSparrow.getAnimal();
		}
		else if(animalName.equals("Persian")){
			animal = Persian.getAnimal();
		}
		return animal;
	}
	
	

}
