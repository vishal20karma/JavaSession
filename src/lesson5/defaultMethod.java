package lesson5;

public class defaultMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Example of default methods and it use		
		
	MyClass obj = new MyClass();
	obj.display(); // Output: Display method
	obj.greet(); // Output: Hello from interface!
	}
    }

    interface MyInterface {
	public void display();

	default void greet() {
	System.out.println("Hello from interface!");
	}
    }

    class MyClass implements MyInterface {
	public void display() {
	System.out.println("Display method");
	}
}
	
