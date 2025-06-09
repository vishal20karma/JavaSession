package replaceConcepts;

public class replaceAllExceptAlternate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Extract all the alternate alphabets without using Character.isDigit/Character.isAlphabet
//  Or same question can be asked extract alternate characters without using Character.isDigit/Character.isAlphabet
/*	String str = "K9e5s2h1u";
	String result="";
	for (int i=0;i<str.length();i++)   {
	String s = str.substring(i, i+1);
	result=result+s;
	i++;
	}
	System.out.println(result);   */
		
//  For Practice
	String str = "K9e5s2h1u";
	String result="";
	for (int i=0;i<str.length();i++)   {
	String s = str.substring(i, i+1);	
	result=result+s;
	i++;
	}
	System.out.println(result);
	
	}

}
