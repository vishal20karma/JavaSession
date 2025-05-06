package lesson1;

public class stringOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  String literal (Mostly used)
	String s = "Vishal Vishwakarma";
	String s1 = "Vishal Vishwakarma";   //Java will not create a new object memory allocation as values are same. s1 will each time point to s only
	
	String s2 = "Vishal Kumar Vishwakarma";   //Now this time it will create a new object because values are different

//  String new memory allocations	
    String s3 = new String ("Welcome");	
	String s4 = new String ("Welcome");   // Here in object s3 and s4 both values are same, but here java will create new objects as 'new' keyword has been explicitly used
	
	}

}
