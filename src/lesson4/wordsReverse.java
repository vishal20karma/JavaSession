package lesson4;

public class wordsReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse the words
/*	String str = "Test Automation Central";
	String rev = "";
	String [] spls = str.split(" ");
	for (int i=spls.length-1;i>=0;i--)   {
	rev=rev+spls[i]+" ";	
	}
	System.out.println(rev.trim());   */
		
//  For Practice
	String str = "Test Automation Central";
	String rev="";
	String [] s = str.split(" ");
	for (int i=s.length-1;i>=0;i--)   {
	rev=rev+s[i]+" ";	
	}
	System.out.println(rev.trim());
	
	}

}
