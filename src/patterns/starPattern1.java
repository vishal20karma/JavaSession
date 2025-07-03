package patterns;

public class starPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to print star pattern	
/*	String s = "*****";
	String str="";
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	str=str+c+" ";
	System.out.println(str);
	}   */
		
//  For Practice
	String s = "*****";
	String str="";
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);
	str=str+c+" ";
	System.out.println(str);
	}
	
	System.out.println("************************");
	
//  Another method
/*	for (int i=0;i<=4;i++)   {
	for (int j=0;j<=i;j++)   {
	System.out.print("*"+" ");	
	}
	System.out.println();
	}   */
	
//  For Practice
	for (int i=0;i<5;i++)   {
	for (int j=0;j<=i;j++)   {
	System.out.print("* ");	
	}
	System.out.println();
	}
	
	System.out.println("************************");
	
//  Reverse Pattern
/*	for (int i=0;i<5;i++)   {
	for (int j=4;j>=i;j--)   {   //In reverse always use -1 because it ends with 0th index
	System.out.print("* ");	
	}
    System.out.println();
	}   */
	
//  For Practice
	for (int i=0;i<5;i++)   {
	for (int j=4;j>=i;j--)   {
	System.out.print("* ");	
	}
	System.out.println();
	}
	
	System.out.println("************************");
	
//  Square/Rectangle Star Pattern (Easy Method)	
/*	for (int i=0;i<5;i++)   {
	System.out.println("* * * * *");	
	}   */
	
//  For Practice
	for (int i=0;i<5;i++)   {
	System.out.println("* * * * *");	
	}
	
	System.out.println("************************");
	
//  Square/Rectangle Star Pattern (Nested Loop Method)	
/*	for (int i=0;i<5;i++)   {
	for (int j=0;j<5;j++)   {
	System.out.print("* ");	
	}
	System.out.println();
	}   */
	
//  For Practice
	for (int i=0;i<5;i++)   {
	for (int j=0;j<5;j++)   {
	System.out.print("* ");	
	}
	System.out.println();
	}
	
	}

}
