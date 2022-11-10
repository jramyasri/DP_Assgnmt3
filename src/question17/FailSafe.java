package question17;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class FailSafe {

        
	    public static void main(String[] args) {
	        ConcurrentMap dI = new ConcurrentHashMap();
	        dI.put("1", "Monday");
	        dI.put("2", "Tuesday");
	        dI.put("3","Wednesday");
	         
	        Iterator iterator = dI.keySet().iterator();
	         
	        while (iterator.hasNext()) {
	            System.out.println(dI.get(iterator.next()));
	            dI.put("4", "Thursday");
	        }       
	    }    
	}