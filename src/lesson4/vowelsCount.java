package lesson4;

public class vowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	String str = "Test Automation Central";
	String outcome = "";
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
			c=='A' || c=='E' || c=='I' || c=='O' || c=='U')   {
	count++;
	outcome=outcome+c;
	}
	}
	System.out.println(count);
	System.out.println(outcome);   */
		
//  For Practice
	String str = "Test Automation Central";
	String outcome = "";
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);
	if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' ||
			c=='A' || c=='E' || c=='I' || c=='O' || c=='U')   {
	count++;
	outcome=outcome+c;
	}
	}
	System.out.println(count);
	System.out.println(outcome);
	
    System.out.println("*******************************");
    
//  How to find the Vowels and store in a String without using '||' as shown above	
/*	String str2 = "Test Automation Central New";
	String vowels = "AEIOUaeiou";
	String result = "";
	int cnt=0;
	for (int i=0;i<str2.length();i++)   {
	char c = str2.charAt(i);	
	if (vowels.indexOf(c)!=-1)   {
	result=result+c;
	cnt++;	
	}
	}
	System.out.println(result);
	System.out.println(cnt);   */
    
//  For Practice
    String str2 = "Test Automation Central New";
	String vowels = "AEIOUaeiou";
	String result = "";
	int cnt=0;
	for (int i=0;i<str2.length();i++)   {
	char c = str2.charAt(i);	
	if (vowels.indexOf(c)!=-1)   {
	result=result+c;
	cnt++;	
	}
	}
	System.out.println(result);
	System.out.println(cnt);
	
	}

}
