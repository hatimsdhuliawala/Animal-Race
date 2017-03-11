package Observer;


public class PersianObserver extends Observer{

	   public PersianObserver(ObserverSubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	 



	@Override
	   public void update() {
	      System.out.println( "Persian Observer : " + subject.getState()  ); 
	   }
	}
