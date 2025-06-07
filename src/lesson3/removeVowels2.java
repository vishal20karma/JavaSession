package lesson3;

public class removeVowels2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to remove vowels from any String
/*	String str = "Test Automation Central";	
	String result = "";
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u' 
			&& c!='A' && c!='E' && c!='I' && c!='O' && c!='U')  {
	result=result+c;	
	}
	}
	System.out.println(result);   */
	
//  For Practice
	String str = "Test Automation Central";
	String result="";
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u' && 
			c!='A' && c!='E' && c!='I' && c!='O' && c!='U')   {
	result=result+c;	
	}
	}
	System.out.println(result);
	
	}

}
