package Observer;



public class DalmationObserver extends Observer {

	   public DalmationObserver(ObserverSubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }


	@Override
	   public void update() {
	     System.out.println( "Dalmation Observer: " + subject.getState() ); 
	   }
	}