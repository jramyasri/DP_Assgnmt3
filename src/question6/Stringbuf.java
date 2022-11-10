package question6;

public class Stringbuf {

	public static void concat1(String s1)
    {
        s1 = s1 + "Jasthi";
    }
 
    
 
   //method 2
    // Concatenates to StringBuffer
    public static void concat3(StringBuffer s2)
    {
        s2.append("Jasthi");
    }
 
    // Method 4
    // Main driver method
    public static void main(String[] args)
    {
        // Custom input string
        // String 1
        String s1 = "RamyaSri";
 
        // Calling above defined method
        concat1(s1);
 
        // s1 is not changed
        System.out.println("String: " + s1);
 
 
 
        // String 3
        StringBuffer s2 = new StringBuffer("Ramya");
 
        // Calling above defined method
        concat3(s2);
 
        // s3 is changed
        System.out.println("StringBuffer: " + s2);
    }
}