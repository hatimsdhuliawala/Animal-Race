package Strategy;

public class StrategyCon {
	
	//context class contain the strategy object
	private Speak strategy;

	   public StrategyCon(Speak x){
	      this.strategy = x;
	   }
	   // execute strategy will execute the respective strategy based on the strategy object that is passed to the constructor
	   public void ExecuteStrategy(){
	      strategy.speak();
	   }

}
