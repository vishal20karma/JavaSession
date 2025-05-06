package lesson5;

public class displyaASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to print ASCII value of a string and add all - Total Sum - 2186
/*	String str = "Test Automation Central";
	calcASCII(str);
	
	}

	public static void calcASCII(String str)   {
	int sum=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c!=' ')   {
	int k = (char)c;
    sum=sum+k;
	System.out.println("ASCII Value of "+c+" : "+(int)c);
	}
	}
	System.out.println(sum);   */
		
//  For Practice
	String str = "Test Automation Central";
	calcASCII(str);
    
	}

    public static void calcASCII(String str)   {
    int sum=0;
    for (int i=0;i<str.length();i++)   {
    char c = str.charAt(i);	
    if (c!=' ')   {
    int k = (char)c;	
    sum=sum+k;
    System.out.println("ASCII Value of "+c+" : "+(int)c);
    }
    }
    System.out.println(sum);
    
    }

}
