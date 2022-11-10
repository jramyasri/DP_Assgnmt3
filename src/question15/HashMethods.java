package question15;

import java.util.Hashtable;
import java.util.*;
import java.lang.*;
import java.io.*;
 
public class HashMethods {

	public static void main(String args[])
    {
        //*********hashtable******
        Hashtable<Integer,String> hta=new Hashtable<Integer,String>();
        hta.put(10,"Ramya");
        hta.put(20,"Swathi");
        hta.put(30,"Sneha");
        hta.put(40,"Nihal");
        System.out.println("-------------Hash table--------------");
        for (Map.Entry m:hta.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
 
        //*********hashmap**************//
        HashMap<Integer,String> hmr=new HashMap<Integer,String>();
        hmr.put(200,"MaheshBabu");
        hmr.put(304,"NTR"); 
        hmr.put(401,"Rajanikanth");
        hmr.put(500,"ViratKohli");
        System.out.println("-----------Hash map-----------");
        for (Map.Entry m:hmr.entrySet()) {
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}