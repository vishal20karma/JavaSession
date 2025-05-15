package replaceConcepts;

public class replaceAllExceptAlternate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Extract all the alphabets without using Character.isDigit/Character.isAlphabet
/*	String str = "56K93e5545s2h1u76";
	String result="";
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	if (!(c>='0' && c<='9'))   {
//	if ((c>='A' && c<='Z') || (c>='a' && c<='z'))   {   //This is alternate to upper code
	result=result+c;	
	}
	}
	System.out.println(result);   */
		
//  For Practice
	String str = "56K93e5545s2h1u76";
	String result="";
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	if (!(c>='0' && c<='9'))   {
//	if ((c>='A' && c<='Z') || (c>='a' && c<='z'))   {   //This is alternate to upper code
	result=result+c;	
	}
	}
	System.out.println(result);
	}

}
