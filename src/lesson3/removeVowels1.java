package lesson3;

public class removeVowels1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to remove vowels from any String
//  Replace Method
/*	String str = "Test Automation Central";	
	str=str.replaceAll("[aeiouAEIOU]", "");   //Putting String vowels here will not work, have to give "[aeiouAEIOU]"
	System.out.println(str);   */
	
//	For Practice
	String str = "Test Automation Central";
	str=str.replaceAll("[AEIOUaeiou]", "");
	System.out.println(str);
	
	System.out.println("*********************************");

/*	String str2 = "Test Automation Central New";
    String vowels = "aeiouAEIOU";
    String result="";
	for (int i=0;i<str2.length();i++)   {
	char c = str2.charAt(i);	
	if (vowels.indexOf(c)==-1)   {   //This line of code means it will remove the vowels to not exist, because given value is -1
	result=result+c;	
	}
	}
	System.out.println(result);   */
	
//  For Practice
	String str2 = "Test Automation Central New";
	String vowels = "AEIOUaeiou";
	String result="";
	for (int i=0;i<str2.length();i++)   {
	char c = str2.charAt(i);
	if (vowels.indexOf(c)==-1)   {
	result=result+c;	
	}
	}
	System.out.println(result);
	
	}

}
