package Decorator;
import javax.swing.ImageIcon;


public interface Sparrow extends Bird {
	
	public abstract String toString();
	public abstract void draw();
	public abstract int getIdentifier();
	int axis();

}