package lesson4;

public class vowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	String str = "Test Automation Central";	
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' 
			|| c=='A' || c=='E' || c=='I' || c=='O' || c=='U')   {
	count++;	
	}
	}
	System.out.println(count);   */
		
//  For Practice
	String str = "Test Automation Central";
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || 
			c=='A' || c=='E' || c=='I' || c=='O' || c=='U')   {
	count++;	
	}
	}
	System.out.println(count);
	
	}

}
