package lesson4;

public class ifStringIsInt2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Checking if a string has all the values of integer (Simple Code)
/*  String s = "456";	
    boolean b = stringOrInt(s);
	System.out.println(b);
	
	}

	public static boolean stringOrInt(String s)   {
	try {
	Integer.parseInt(s);
	return true;
	}
	catch (Exception e)   {
	return false;	
	}   */
		
//  For Practice
	String s = "456";
	boolean b =stringOrInt(s);
	System.out.println(b);
	
	}
	
	public static boolean stringOrInt(String s)   {
	try   {
	Integer.parseInt(s);
	return true;
	}
	catch (Exception e)   {
	return false;	
	}
	}
}
