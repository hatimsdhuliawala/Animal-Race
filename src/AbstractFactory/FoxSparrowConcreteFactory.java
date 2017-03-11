package AbstractFactory;

import Decorator.*;

public class FoxSparrowConcreteFactory extends AbstractFactory {
	static FoxSparrowConcreteFactory p=null;
	
	//private constructor
	private FoxSparrowConcreteFactory(){
		
	}
	
	//Singleton design pattern to ensure that object is created only when it not already created
	public static synchronized AbstractFactory getCatfactory() {
			if (p == null) {
				p = new FoxSparrowConcreteFactory();
				return p;
			}
			return p;
	}
		
	//Singleton design pattern to ensure that clone is disabled
	public Object clone() throws CloneNotSupportedException {
			throw new CloneNotSupportedException();
	}
	
	

	@Override
	public Animal Animal2() {
		return FoxSparrow.getAnimal();
	}

	@Override
	public Animal Animal1() {
		// TODO Auto-generated method stub
		return FoxSparrow.getAnimal();
	}

}
