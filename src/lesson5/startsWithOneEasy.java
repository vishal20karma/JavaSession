package lesson5;

public class startsWithOneEasy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Find the number starts with 1
/*	int [] number = {67, 1, 12, 23, 21, 10};
	for (int i=0;i<number.length;i++)   {
	String numString = Integer.toString(number[i]);	//Converted int to String
	if (numString.startsWith("1"))   {
	System.out.println(numString);	
	}
	}   */
		
//  For Practice
	int [] number = {67, 1, 12, 23, 21, 10};
	for (int i=0;i<number.length;i++)   {
	String numString = Integer.toString(number[i]);	
	if (numString.startsWith("1"))   {
	System.out.println(numString);	
	}
	}
	
	}

}
