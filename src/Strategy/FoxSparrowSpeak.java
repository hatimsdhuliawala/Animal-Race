package Strategy;

import java.io.*;
import java.net.URL;
import javax.sound.sampled.*;
import javax.swing.*;
//concrete implementation f different strategy
public class FoxSparrowSpeak extends Speak {

	@Override
	public void speak() {
		try{
		    	  File audioFile = new File("audio\\foxsparrow.wav");
		         AudioInputStream audioIn = AudioSystem.getAudioInputStream(audioFile);
		         Clip clip = AudioSystem.getClip();
		         clip.open(audioIn);
		         clip.start();
		}catch (UnsupportedAudioFileException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (LineUnavailableException e) {
	         e.printStackTrace();
	      }
	}

}
