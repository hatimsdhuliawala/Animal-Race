package Decorator;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JScrollPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.print.PrinterException;
import java.util.*;

import javax.swing.JOptionPane;
import javax.swing.event.TableModelEvent;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

import AbstractFactory.*;
import FactoryMethod.AnimalFactory;
import Observer.*;
import Strategy.*;
import sun.audio.*;



public class HumanSocietyCenter {
	
	
		public static void main(String[] args) {

		JFrame frame = new JFrame();
		JLabel welcome = new JLabel("Welcome to Human Society Center Race", SwingConstants.CENTER);
		welcome.setFont(welcome.getFont ().deriveFont (34.0f));
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JPanel jPanel = new JPanel(new GridLayout(4,4,0, 10));
	    jPanel.add(welcome);
	    jPanel.setOpaque(true);

		//Oberserver Pattern
		ObserverSubject sub = new ObserverSubject();
		new DalmationObserver(sub);
		new FoxSparrowObserver(sub);
		new PersianObserver(sub);
		new PoodleObserver(sub);
		new RosecombObserver(sub);

	    //Factory method implementation
	    AnimalFactory abstractfactory = AnimalFactory.getfactory();
	    
	    //implementation of Abstract Factory 
	    AbstractFactory dogAbstractFactory = DogConcreteFactory.getDogfactory();
	    AbstractFactory SparrowAbstractFactory=FoxSparrowConcreteFactory.getCatfactory();
	    
	    //Abstract Factory Used
	    jPanel.add((Component) drawAnimal(dogAbstractFactory.Animal1()));//abstract factory implementations animal1 in abstractfactory gets dalmation object
	    jPanel.add((Component) drawAnimal(SparrowAbstractFactory.Animal1()));//abstract factory implementation	aniaml1 in abstracfactor gets FoxSparrow object
	   
	    //Decorator design pattern implementation
	    jPanel.add((Component) drawAnimal(new AnimalExtended(new Dalmatian("Dalmation"))));//decorator design pattern implementation    
	    frame.add(jPanel);
	    frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		frame.setVisible(true);
		
		//Implementation to find the winner of the race
		int i =1;
		while(true){

			Animal FoxSparrow=	abstractfactory.getAnimal("FoxSparrow");
			int temp = FoxSparrow.axis();
			
			Animal Dalmation =	abstractfactory.getAnimal("Dalmation");
			int temp1 = Dalmation.axis();
			
			Animal Dalmation2 =	new AnimalExtended(new Dalmatian("Dalmation"));
			int temp2 = Dalmation2.axis();
			int size = frame.getContentPane().getWidth();
			
			if (temp>size)
			{
				if(i==1)
				{
				JOptionPane.showMessageDialog(null,"FoxSparrow  Won The Race!");
				sub.setState("FoxSparrow Won");
				i = 2;
				}
			}
			else if(temp1 > size)
			{
				if(i==1)
				{
				JOptionPane.showMessageDialog(null,"Dalmation 1 Won The Race!");
				sub.setState("Dalmation 1 Won");
				i = 2;
				}
			}
			else if(temp2 > size)
			{
				if(i==1)
				{
				JOptionPane.showMessageDialog(null,"Dalmation 2 Won The Race!");
				sub.setState("Dalmation 2 Won");
				i = 2;
				}
			}

		}

		
		}
		
		public static Animal drawAnimal(Animal animal) {
			animal.draw();
			return animal;
	}
}

