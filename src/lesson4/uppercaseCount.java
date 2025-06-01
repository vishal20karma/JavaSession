package lesson4;

public class uppercaseCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to count all Upper cases in a String
/*	String str = "Test Automation Central";	
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (Character.isUpperCase(c))   {   // "Character.isLowerCase(c)" - This give lower case count
	count++;	
	}
	}
	System.out.println(count);   */
		
//  For Practice
	String str = "Test Automation Central";
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char c  = str.charAt(i);	
	if (Character.isUpperCase(c))   {   // "Character.isLowerCase(c)" - This give lower case count
	count++;	
	}
	}
	System.out.println(count);
	
	}
}
