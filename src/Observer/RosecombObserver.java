package Observer;

public class RosecombObserver 
	 extends Observer{

		   public RosecombObserver(ObserverSubject subject){
		      this.subject = subject;
		      this.subject.attach(this);
		   }


		@Override
		   public void update() {
		     System.out.println( "Rosecomb oberver: " + subject.getState() ); 
		   }
		}

