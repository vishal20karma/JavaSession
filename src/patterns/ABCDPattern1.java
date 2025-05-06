package patterns;

public class ABCDPattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//  ASCII value of A=65, a=97	
//  How to print ABCDEF pattern
/*  int alpha = 65;
    String s="";
	for (int i=0;i<=25;i++)   {
	s = s+(char)alpha+" ";
	System.out.println(s);
	alpha++;   //If want to print only one alphabet in whole pattern then 'comment' this line
	}   */
	
//  For Practice
	int alpha=65;
	String s="";
	for (int i=0;i<=25;i++)   {
	s = s+(char)alpha+" ";	
	System.out.println(s);
	alpha++;
	}
	
	System.out.println("********************************");
	
//  Nested loop way
/*	int alphb = 65;
	for (int i=0;i<=25;i++)   {
	for (int j=0;j<=i;j++)   {
	System.out.print((char)alphb+" ");	
	}
	alphb++;
	System.out.println();
	}   */
	
//  For Practice
	int alphb=65;
	for (int i=0;i<=25;i++)   {
	for (int j=0;j<=i;j++)   {
	System.out.print((char)alphb+" ");	
	}
	alphb++;
	System.out.println();
	}
	
	}

}
