package Decorator;
import javax.swing.ImageIcon;

//Abstract class Dog which implements Mammal
public interface Dog extends Mammal{

	
	public abstract void draw();
	public abstract String toString();
	public abstract int getIdentifier();
}
