package question13;

import java.util.ArrayList;

/**
 *
 * @author S546555
 */
public class ArrayListDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    ArrayList<String>myCities = new ArrayList<String>();
    myCities.add("Maryville");
    myCities.add("KC");
    myCities.add("Boston");
    myCities.add("Saint Louis");
    //myCities.add();
   
    for(String city:myCities){//enhanced for loop
        System.out.println(city);
    }
    System.out.println("***********");
    
    for(int i=0;i<myCities.size();i++){  //traditional forloop
        System.out.println(myCities.get(i));
    }
    System.out.println("********");
    System.out.println(myCities);
    
    myCities.add(2, "Chicago");
    //size is 5;index is from 0 to 4//add cheyamani
    myCities.add(4, "St. Jo");
    //size is 6;index 0 to 5
    myCities.add(6, "Memphis");
   // myCities.add(8, "Memphis");  
    
    
   // System.out.println("********");
    //System.out.println("swathi" + myCities + "size" +myCities.size());
    
    for(int i=0;i<myCities.size();i++){
        //      System.out.println("cities for remove" + myCities.get(i));
        myCities.remove(i);
        //here i is 0//
    }
    System.out.println("***********");
    System.out.println(myCities);
    System.out.println("The list contains Chicago? "+myCities.contains("Chicago"));
        
    //below are wrapper classes
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(2);
    //boxing or unboxing
    numbers.add(new Integer(4));//numbers.add(4)
    numbers.add(6);
    numbers.add(8);
    numbers.remove(new Integer(2));
//dont know where to remove condition
     
    System.out.println("***********");
    System.out.println(numbers);
    
    }
        
        }
    

