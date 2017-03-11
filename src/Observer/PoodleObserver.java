package Observer;

public class PoodleObserver extends Observer{

	   public PoodleObserver(ObserverSubject subject){
	      this.subject = subject;
	      this.subject.attach(this);
	   }

	 



	@Override
	   public void update() {
	      System.out.println( "Poodle Observer : " + subject.getState()  ); 
	   }
	}
