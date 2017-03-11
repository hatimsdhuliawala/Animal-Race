package AbstractFactory;

import Decorator.*;
import FactoryMethod.AnimalFactory;

public class DogConcreteFactory extends AbstractFactory {
	
	static DogConcreteFactory p=null;
	
	//private constructor
	private DogConcreteFactory(){
		
	}
	
	//Singleton design pattern to ensure that object is created only when it not already created
	public static synchronized AbstractFactory getDogfactory() {
			if (p == null) {
				p = new DogConcreteFactory();
				return p;
			}
			return p;
	}
		
	//Singleton design pattern to ensure that clone is disabled
	public Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException();
	}
	@Override
	public Animal Animal1() {
		return Poodle.getAnimal();

	}

	@Override
	public Animal Animal2() {
		return new Dalmatian("");
	}

}
