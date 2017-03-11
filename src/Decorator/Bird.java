package Decorator;
import javax.swing.ImageIcon;

//Abstract class Bird which implements animal
public interface Bird extends Animal{
	
		public abstract String toString();
		public abstract void draw();
		public abstract int getIdentifier();
			

	}
