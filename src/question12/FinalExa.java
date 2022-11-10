package question12;

import question7.Main;

public class FinalExa {
	
	//we will get error because it will not allow final
	final Main(){
	System.out.println("Final Constructor");
	}
	public static final void main(String[] args) {
	Main obj1 = new Main();
	}
	}
