package Decorator;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Rosecomb extends JPanel implements Animal,Chicken {
	
	public static int Identifier = 4;
	public char[] Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	static Rosecomb f=null;
	
	
	public Rosecomb(String Name){
		this.Name= Name.toCharArray();
	}
	
	
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
