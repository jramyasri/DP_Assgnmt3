package question5;


	public class Main {
	    public static void main(String[] args) {

	        StringBuffer sb
	            = new StringBuffer("Hi Ramya");
	  
	        // Converting from StringBuffer
	        String str = sb.toString();
	  
	        // Creating a new StringBuilder
	        StringBuilder sbuild
	            = new StringBuilder(str);
	  
	        System.out.println(sbuild);
	    }
	}