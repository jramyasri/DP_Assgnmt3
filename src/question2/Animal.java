package question2;

public class Animal{
    protected void method()
    {
        System.out.println("Happy");
    }
}
 
public class Dog extends Animal {
 
    protected // Compile Time Error
    void method()
    {
        System.out.println("Happy");
    }
 
    public static void main(String args[])
    {
        Dog d = new Dog();
        d.method();
    }
}