package Decorator;
import javax.swing.ImageIcon;

//Abstract Class Mammal which implements animal
public interface Mammal extends Animal{
	public abstract void draw();
	public abstract String toString();
	public abstract int getIdentifier();
}
