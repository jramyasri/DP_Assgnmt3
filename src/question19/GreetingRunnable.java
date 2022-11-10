package question19;

import java.util.Date;

public class GreetingRunnable implements Runnable {
	private String wishes;
	final int REPETITIONS=5;
	final int  DELAY=1000;
	

	public GreetingRunnable(String aGreet) {
		// TODO Auto-generated constructor stub
		wishes= aGreet;
	}
  public void run() {
	for(int i = 1; i <= REPETITIONS; i++) {
		try {
		  Date n = new Date();
		  System.out.println(n + " " + wishes);
		  Thread.sleep(DELAY);
		} catch (InterruptedException ex){
		  System.out.println(" ");
		  return;
		}
		 
	}
  }
}
