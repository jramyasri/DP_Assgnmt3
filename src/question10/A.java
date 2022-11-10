package question10;

public class A {

    Void testMethod() throws ArrayIndexOutOfBoundsException
    {
        //Super class method is throwing Unchecked exception
    }
}

public Class B extends class A{
    Void testMethod() throws ArrayIndexOutOfBoundsException
    {
        //A class method is throwing Unchecked exception. Hence it cannot be overridden
    }
}



Possible:
public class A
{
    Void testMethod() throws 
    {
        //Super class method is not throwing
    }
}

public Class B extends class A{
    Void testMethod() throws ArrayIndexOutOfBoundsException
    {
        // It cannot be overridden
    }
}



