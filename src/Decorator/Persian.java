package Decorator;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class Persian  extends JPanel implements Animal, Cat {
	
	
	public static int Identifier = 3;
	public String Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	static Persian f=null;
	
	private Persian() {
	}

	public static synchronized Animal getAnimal() {
		if (f == null) {
			f = new Persian();
			return f;
		}
		return f;
	}
	
	
	@Override
	public void draw(){
		 repaint();
	}

	@Override
	public String toString() {
		String temp="";
		return temp;
	}



	@Override
	public int getIdentifier() {
		// TODO Auto-generated method stub
		return Identifier;
	}

	@Override
	public int axis() {
		// TODO Auto-generated method stub
		return 0;
	}
}
