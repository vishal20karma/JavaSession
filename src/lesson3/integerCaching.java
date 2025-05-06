package lesson3;

public class integerCaching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Wrapper classes in Java provide a way to wrap or represent the value of primitive data types as an object.		
//	In Java, int is a primitive data type while Integer is a Wrapper class. int, being a primitive data type has got less flexibility.
//	We can only store the binary value of an integer in it. Since Integer is a wrapper class for int data type, 
//	it gives us more flexibility in storing, converting and manipulating an int data.	
	Integer sum1 = 100;
	Integer sum2 = 100;
	if (sum1==sum2)   {
	System.out.println("Both numbers are equal");	
	}
	else    {
	System.out.println("Both numbers are NOT equal");	
	}
	
//  In java, object==object will always give negative result, but in case of integer --	
//  Integer caching has range (-128 to 127), any number falling in this range it will give positive result, beyond range it will give negative	
	Integer sum3 = 153;
	Integer sum4 = 153;
	if (sum3==sum4)   {
	System.out.println("Both numbers are equal");	
	}
	else   {
	System.out.println("Both numbers are NOT equal");	
	}
	
	}

}
