package question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListMethods {

	public static void main (String[] args)
    {
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
 
        list.add("Designs");
        list.add("Pattern");
        list.add("exam");
 
        synchronized(list)
        {
            // must be in synchronized block
            Iterator iter = list.iterator();
 
            while (iter.hasNext())
                System.out.println(iter.next());
        }
    }
}