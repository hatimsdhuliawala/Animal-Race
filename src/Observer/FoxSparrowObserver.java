package Observer;



public class FoxSparrowObserver extends Observer.Observer {

	   public FoxSparrowObserver(Observer.ObserverSubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	 



	@Override
	   public void update() {
	      System.out.println( "FoxSparrow Observer : " + subject.getState()  ); 
	   }
	}