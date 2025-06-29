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
	String result = "";
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c!='a' && c!='e' && c!='i' && c!='o' && c!='u' &&
			c!='A' && c!='E' && c!='I' && c!='O' && c!='U')   {
	result=result+c;	
	}
	}
	System.out.println(result);
	
//  How to extract all the vowels and put into a string - Output-eAuoaioeae
/*	String str2 = "Test Automation Central New";
	String result2 = "";
	for (int i=0;i<str2.length();i++)   {
	char c = str2.charAt(i);	
	if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
			c=='A' || c=='E' || c=='I' || c=='O' || c=='U')   {
	result2=result2+c;	
	}
	}
	System.out.println(result2);   */
	
//  For Practice - Output-eAuoaioeae
	String str2 = "Test Automation Central New";
	String result2 = "";
	for (int i=0;i<str2.length();i++)   {
	char c = str2.charAt(i);	
	if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
			c=='A' || c=='E' || c=='I' || c=='O' || c=='U')   {
	result2=result2+c;	
	}
	}
	System.out.println(result2);
	
	}

}
