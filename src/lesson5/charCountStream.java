package lesson5;

public class charCountStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find single/multiple duplicate character count with Streams
/*	String str = "Testing Solutions";
	charCount1(str, 's');
	charCount2(str, 't', 'i');
	
	}

	public static void charCount1(String str, char c)   {
	str = str.toLowerCase();
	long count1 = str.chars().filter(s->(char)s==c).count();
	System.out.println(count1);
	}

    public static void charCount2(String str, char c1, char c2)   {
    str = str.toLowerCase();
    long count2 = str.chars().filter(s->(char)s==c1 || (char)s==c2).count();   //Multiple characters, it gives total of multiple characters
    System.out.println(count2);   */
   
//  For Practice
	String str  = "Testing Solutions";
	charCount1(str, 's');
	charCount2(str, 't', 'i');
	}

	public static void charCount1(String str, char c)   {
	str=str.toLowerCase();	
	long count1 = str.chars().filter(s->(char)s==c).count();
	System.out.println(count1);
	}
	
	public static void charCount2(String str, char c1, char c2)   {
	str=str.toLowerCase();	
	long count2 = str.chars().filter(s->(char)s==c1 || (char)s==c2).count();
	System.out.println(count2);
	}

}
