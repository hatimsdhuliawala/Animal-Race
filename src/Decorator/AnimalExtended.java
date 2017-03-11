package Decorator;
//Decorator design pattern implementation
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JPanel;

import Strategy.FoxSparrowSpeak;
import Strategy.Speak;

public class AnimalExtended extends JPanel implements AnimalDecorator, Runnable {

	Dalmatian dalmation =null;
	Thread thread;
	int axis;
	//constructor gets the Dalmatian object and uses its functions and add functionality on top of it
	public AnimalExtended(Dalmatian d){
		dalmation =d;
	}
	
	//override draw method when some additional functionality
	public void draw(){
		repaint();
	}

	@Override
	public int getIdentifier() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	//Adds new functionality along with the dalmatian object
	public void paintComponent(Graphics graphics){
		//gets animal name from Dalmatian object
		char[] animalName =dalmation.getAnimalName();
		
	    super.paintComponent(graphics); 
	    graphics.drawChars(animalName, 0, animalName.length, 40, 10); 
	    graphics.setColor(Color.GRAY);
		graphics.fillOval(100, 20, 50, 50);
		graphics.setColor(Color.BLACK);
		graphics.fillOval(112, 30, 10, 10);
		graphics.setColor(Color.BLACK);
		graphics.fillOval(132, 30, 10, 10);
		graphics.setColor(Color.CYAN);
		graphics.fillOval(122,50, 10, 10);
		graphics.setColor(Color.ORANGE);
		graphics.fillOval(115,3, 10, 20);
		graphics.setColor(Color.ORANGE);
		graphics.fillOval(130,3, 10, 20);
		graphics.setColor(Color.ORANGE);
		graphics.fillOval(25,60, 10, 80);
		graphics.setColor(Color.ORANGE);
		graphics.fillOval(70,60, 10, 80); 
		graphics.setColor(Color.GRAY);
		graphics.fillOval(10,10, 100, 60);
		graphics.setColor(Color.BLACK);
		graphics.fillOval(25,138, 20, 5);
		graphics.setColor(Color.BLACK);
		graphics.fillOval(70,138, 20, 5);
		graphics.setColor(Color.BLACK);
		//graphics.drawLine(1250, 150, 1250, 10);
		graphics.setColor(Color.GREEN);
		//graphics.fill3DRect(1300, 50, 40, 60, false);
		thread = new Thread(this, "Dalmation");
		thread.start();
		try {
			thread.sleep(100);
		} catch (Exception e) {
		}
		
	}

	@Override
	public void run() {
		int random = new Random().nextInt(40) + 1;
		axis =this.getX() + random;
		this.setLocation(this.getX() + random, this.getY());
		repaint();
		
	}

	@Override
	public int axis() {
		return axis;
	}
	
	
}
