package lesson3;

public class removeSplChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to remove special characters
/*	String s = "/.,mac$#@*)book(%^)pro@14";
	s=s.replaceAll("[^0-9;A-Z;a-z]", "");
	System.out.println(s);   */
		
//  always use rectangular bracket else it will not work. Anything in rectangular bracket will not be replaced (like ';') if same is in the string
//  space can be used instead of ';' in the rectangular bracket, it works		
	
//  For Practice
	String s = "/.,mac$#@*)book(%^)pro@14";
	s=s.replaceAll("[^0-9;A-Z;a-z]", "");
	System.out.println(s);
	
	}

}
