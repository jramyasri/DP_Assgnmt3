package question24;

public class GarbageCollection {
		   public static void main(String args[]) {
		      System.out.println(Runtime.getRuntime().freeMemory());
		      for (int i=0; i<= 100000; i++) {
		         Double dl = new Double(300);
		      }
		      System.out.println(Runtime.getRuntime().freeMemory());
		      System.gc();
		      System.out.println(Runtime.getRuntime().freeMemory());
		   }
		}