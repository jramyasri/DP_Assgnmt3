package question17;

	import java.util.HashMap;
	import java.util.Iterator;
	import java.util.Map;
	public class FailFast {

	 
	public static void main(String[] args) {
	Map dayIndex = new HashMap();
	dayIndex.put("1", "Monday");
	dayIndex.put("2", "Tuesday");
	dayIndex.put("3","Wednesday");
	 
	Iterator iterator = dayIndex.keySet().iterator();
	 
	while (iterator.hasNext()) {
	System.out.println(dayIndex.get(iterator.next()));
	//add an element to Map
	//exception message will be thrown on next call
	//of next() method.
	dayIndex.put("4", "Thursday");
	}
	}
	}