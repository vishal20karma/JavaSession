package lesson4;

public class ifStringIsInt1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Checking if string has integer values	
/*	String s = "1234k";
	boolean b = strOrInt(s);
	System.out.println(b);
	
	}

	public static boolean strOrInt(String s)   {
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (!Character.isDigit(c))   {
	return false;	
	}
	}
	return true;   */
		
//  For Practice
	String s = "1234k";
	boolean b = strOrInt(s);
	System.out.println(b);
	
	}

    public static boolean strOrInt(String s)   {
    for (int i=0;i<s.length();i++)   {
    char c = s.charAt(i);	
    if (!Character.isDigit(c))   {
    return false;	
    }
    }
    return true;
    }

}
