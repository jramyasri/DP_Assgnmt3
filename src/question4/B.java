package question4;

public class B {


		private static void display() {

		System.out.println("Static methods from Base");

		}

		public void print() {

		System.out.println("Non-static methods from Base");

		}

		class Derived extends B {

		private static void display() {

		System.out.println("Static or class method from Derived");

		}

		public void print() {

		System.out.println("Non-static or instance method from Derived");

		}

		public class test {

		public static void main(String args[])

		{

		B obj1 = null;
		obj1.display();

		obj1.print();

		}
		}
		}
}
		
