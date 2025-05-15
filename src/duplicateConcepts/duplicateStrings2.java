package duplicateConcepts;

public class duplicateStrings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Finding s1 string and count from s string	
/*	String s = "Google is the most popular search engine in the most world. Bing most comes at number two most";
	String s1 = "most";
	String ls = s.toLowerCase();
	String [] spls = ls.split(" ");
	System.out.println("Total Words - "+spls.length);
	int count=0;
	for (int i=0;i<spls.length;i++)   {
	if (spls[i].equals(s1))   {
	count++;	
	}
	}
	System.out.println(count);   */
		
//  For Practice
	String s = "Google is the most popular search engine in the most world. Bing most comes at number two most";
	String s1 = "most";
	String ls = s.toLowerCase();
	String [] spls = ls.split(" ");
	System.out.println("Total Words - "+spls.length);
	int count=0;
	for (int i=0;i<spls.length;i++)   {
	if (spls[i].equals(s1))   {
	count++;	
	}
	}
	System.out.println(count);
	}

}
