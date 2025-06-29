package lesson5;

public class displyaASCII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to print ASCII value of a string and add all - Output-2186
/*	String str = "Test Automation Central";
	calcASCII(str);
	
	}

	public static void calcASCII(String str)   {
	int sum=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c!=' ')   {
	int k = (int)c;
    sum=sum+k;
	System.out.println("ASCII Value of "+c+" : "+k);
	}
	}
	System.out.println(sum);   */
		
//  For Practice - Output-2186
	String str = "Test Automation Central";
	calcASCII(str);
	
	}

    public static void calcASCII(String str)   {
    int sum=0;
    for (int i=0;i<str.length();i++)   {
    char c = str.charAt(i);	
    if (c!=' ')   {
    int k = (int)c;	
    sum=sum+c;
    System.out.println("ASCII Value of "+c+" : "+k);
    }
    }
    System.out.println(sum);
    }

}
