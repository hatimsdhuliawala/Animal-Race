package Decorator;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Strategy.StrategyCon;
import Strategy.DogSpeak;


public class Dalmatian extends JPanel implements Animal,Dog,Runnable {
	
	public static int Identifier = 1;
	public char[] Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	static Dalmatian d=null;
	public int axis =0;
	Thread thread;
	
	public Dalmatian(String Name){
		this.Name= Name.toCharArray();
	}
	
	private Dalmatian() {
	}
	
	static synchronized Animal getAnimal() {
		if (d == null) {
			d = new Dalmatian();
			return d;
		}
		return d;
	}
	
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
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
	
	public char[] getAnimalName(){		
		return this.Name;
	}

	 protected void paintComponent(Graphics g) {		 
		 	super.paintComponent(g); 
		 	char [] rgc = { 'D', 'A', 'L' ,'M', 'A', 'T','I', 'O','N' };
		 	 g.drawChars(rgc, 0, 9, 40, 10); 
		    g.setColor(Color.red);
		    g.fillArc(100, 20, 50, 50,0, 180);
			g.setColor(Color.white);
			g.fillOval(112, 30, 10, 10);
			g.setColor(Color.BLACK);
			g.fillOval(132, 30, 10, 10);
			g.setColor(Color.RED);
			g.fillOval(122,50, 10, 10); 
			g.setColor(Color.red);
			g.fillOval(10,10, 100, 60);
			
		  
			thread = new Thread(this, "Poodle");
			thread.start();
			try {
				thread.sleep(100);
			} catch (Exception e) {
			}
			
			
		  }

		public void run() {
			//Strategy pattern implementation
			//Context is called to execute the strategy, based on the object that is passed to the context class respective strategy is executed.
			StrategyCon c = new StrategyCon(new DogSpeak());
			//below code make the dog to bark
			c.ExecuteStrategy();
			
			int random = new Random().nextInt(50) + 1;
			axis =this.getX() + random;
			this.setLocation(this.getX() + random, this.getY());
			repaint();
					
		}

		public int axis(){
			return axis;
		}
		 
}
