package Decorator;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

import Strategy.StrategyCon;
import Strategy.DogSpeak;
import Strategy.FoxSparrowSpeak;
import Strategy.Speak;


public class FoxSparrow  extends JPanel implements Animal, Sparrow,Runnable {
	
	public static int Identifier=5;
	public double height,width;
	public String Name;
	public int Id;
	public int Age;
	public String Type;
	public String Breed;
	public String ReadyForAdoption;
	public String Notes;
	public String MedicalCondition;
	public int result =0;
	public int axis =0;
	Thread thread;
	static FoxSparrow f=null;
	
	
	private FoxSparrow() {
	}

	public static synchronized Animal getAnimal() {
		if (f == null) {
			f = new FoxSparrow();
			return f;
		}
		return f;
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
		 	char [] rgc = { 'F', 'O', 'X' ,'S', 'P', 'A', 'R', 'R','O','W' };
			
		    super.paintComponent(g); 
		    g.drawChars(rgc, 0, 10, 40, 10); 
		    // FoxSparrow Face
		    g.setColor(Color.blue);
			g.fillRect(100, 20, 50, 50);
			
			// FoxSparrow Eyes
			g.setColor(Color.BLACK);
			g.fillOval(112, 30, 10, 10);
			g.fillOval(132, 30, 10, 10);
			
			// FoxSparrow Lips
			g.setColor(Color.RED);
			g.fillRect(122,50, 10, 10);
			
			// FoxSparrow Body
			g.setColor(Color.green);
			g.fillOval(10,10, 100, 60);
			
			//FoxSparrow Leg
			g.setColor(Color.orange);
			g.fillRect(20,30, 10, 60);
			g.fillRect(40,30, 10, 60);
			g.fillRect(60,30, 10, 60);
			g.fillRect(80,30, 10, 60);
			
			// FoxSparrow shoes
			g.setColor(Color.yellow);
			g.fillOval(15,80, 20, 10);
			g.fillOval(35,80, 20, 10);
			g.fillOval(55,80, 20, 10);
			g.fillOval(75,80, 20, 10);
			
			
			
			thread = new Thread(this, "FoxSparrow");
			thread.start();
			try {
				thread.sleep(100);
			} catch (Exception e) {
			}
		  }

	@Override
	public int axis() {
		// TODO Auto-generated method stub
		return axis;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//Strategy pattern implementation
		//Context is called to execute the strategy, based on the object that is passed to the context class respective strategy is executed.
		StrategyCon c = new StrategyCon(new FoxSparrowSpeak());
		//below code make the dog to bark
		c.ExecuteStrategy();
		int random = new Random().nextInt(50) + 1;
		axis =this.getX() + random;
		this.setLocation(this.getX() + random, this.getY());
		repaint();
	}

}
