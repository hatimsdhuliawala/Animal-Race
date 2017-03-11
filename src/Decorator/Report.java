package Decorator;
public class Report {
	private String Animal;
	private String Breed;
	private int Count;
	
	public String getAnimal() {
		return Animal;
	}

	public void setAnimal(String animal) {
		Animal = animal;
	}

	public String getBreed() {
		return Breed;
	}

	public void setBreed(String breed) {
		Breed = breed;
	}

	public int getCount() {
		return Count;
	}

	public void setCount(int count) {
		Count = count;
	}
	
	public Report(String Animal, String Breed, int Count)
	{
		this.Animal=Animal;
		this.Breed=Breed;
		this.Count=Count;
	}
	
	
	

}
