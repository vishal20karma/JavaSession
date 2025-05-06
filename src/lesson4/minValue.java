package lesson4;

public class minValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  What is the double/long/Integer min value ?	
	System.out.println(Double.MIN_VALUE);   //Positive : 4.9E-324
	System.out.println(Long.MIN_VALUE);   //Negative : -9223372036854775808
	System.out.println(Integer.MIN_VALUE);   //Negative : -2147483648
	System.out.println(Float.MIN_VALUE);   //Positive : 1.4E-45
	
//  Which one is lowest/greater number ?
	System.out.println(Math.min(Double.MIN_VALUE, 0.0d));   //0.0d is minimum value
	System.out.println(Math.min(Long.MIN_VALUE, 0));   //Long is minimum value
	System.out.println(Math.min(Integer.MIN_VALUE, 0));     //Integer is minimum value 
	System.out.println(Math.min(Float.MIN_VALUE, 0.0f));   //0.0d is minimum value
	System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));   //Infinity is minimum value
	
//  Imp - Only Double and Float has positive outcomes, therefore these two will have always max than 0	
	
	}

}
