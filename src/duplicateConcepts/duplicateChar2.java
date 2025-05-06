package duplicateConcepts;

public class duplicateChar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find a character count in a string	
/*	String str = "My Great Responsibility";
	str=str.toLowerCase();
	char c = 'i';
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char ch = str.charAt(i);	//Character Array has not been used here, its only used when nested loop is needed to compare character positions/indexes
	if (ch==c)   {
	count++;	
	}
	}
	System.out.println(count);   */
		
//  For Practice
	String str = "My Great Responsibility";
	str=str.toLowerCase();
	char c = 'i';
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char ch = str.charAt(i);
	if (ch==c)   {
	count++;	
	}
	}
	System.out.println(count);
	
	}

}
