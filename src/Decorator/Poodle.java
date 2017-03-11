package Decorator;
import java.awt.Graphics;

import javax.swing.ImageIcon;

import java.awt.Color;

import javax.swing.JPanel;

import Strategy.*;

import java.util.Random;


public class Poodle extends JPanel implements Animal,Dog,Runnable {

	public static int Identifier=0;
	public double height,width;
	public String Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	static Poodle p=null;
	public int result =0;
	public int axis =0;
	Thread thread;
	
	private Poodle() {
	}

	public static synchronized Animal getAnimal() {
		if (p == null) {
			p = new Poodle();
			return p;
		}
		return p;
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
	
	 protected void paintComponent(Graphics g) {
		 if(result ==1){
		    this.setBackground(new Color(255, 228, 181));
		 }
		 	char [] rgc = { 'P', 'O', 'O' ,'D', 'L', 'E' };
			
		    super.paintComponent(g); 
		    g.drawChars(rgc, 0, 6, 40, 10); 
		    // Poodles Face
		    g.setColor(Color.blue);
			g.fillRect(100, 20, 50, 50);
			
			// Poodles Body
			g.setColor(Color.green);
			g.fillOval(10,10, 100, 60);
			
			//Poodles Leg
			g.setColor(Color.orange);
			g.fillRect(20,30, 10, 60);
			g.fillRect(40,30, 10, 60);
			g.fillRect(60,30, 10, 60);
			g.fillRect(80,30, 10, 60);
			
						
			
			thread = new Thread(this, "Poodle");
			thread.start();
			try {
				thread.sleep(100);
			} catch (Exception e) {
			}
		  }

	@Override
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