package question7;

public class Main
{
	//we will get error because it will not allow final
final Main(){
System.out.println("Final Constructor");
}
public static final void main(String[] args) {
Main obj1 = new Main();
}
}
