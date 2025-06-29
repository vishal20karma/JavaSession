package lesson3;

public class stringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse string	
/*	String s = "Selenium";
	String rev = "";
	for (int i=s.length()-1;i>=0;i--)   {
	char c = s.charAt(i);	
	rev=rev+c;
	}
	System.out.println(rev);   */
		
//  For Practice
	String s = "Selenium";
	String rev="";
	for (int i=s.length()-1;i>=0;i--)   {
	char c = s.charAt(i);	
	rev=rev+c;
	}
	System.out.println(rev);
	
	System.out.println("*******************************");
	
//  Reversing the string by StringBuffer  (StringBuffer is mutable and String is Immutable, string cannot be reversed because its immutable, that can only reversed by StringBuffer)	
/*	StringBuffer sb = new StringBuffer(s);
	System.out.println(sb.reverse());   */
	
//  For Practice
	StringBuffer sb = new StringBuffer(s);
//	StringBuilder sb = new StringBuilder(s);
	System.out.println(sb.reverse());
	
	}

}
