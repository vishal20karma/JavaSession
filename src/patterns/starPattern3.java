package patterns;

public class starPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Pyramid Pattern
/*	for (int i=0;i<5;i++)   {
	for (int j=4;j>i;j--)   {
	System.out.print(" ");	
	}
	for (int k=0;k<=i;k++)   {
	System.out.print("* ");	
	}
	System.out.println();
	}   */
	
//  For Practice
	for (int i=0;i<5;i++)   {
	for (int j=4;j>i;j--)   {
	System.out.print(" ");	
	}
	for (int k=0;k<=i;k++)   {
	System.out.print("* ");	
	}
	System.out.println();
	}
	
    System.out.println("*****************************");
    
//  Reverse Pyramid	
/*	for (int i=0;i<5;i++)   {
	for (int j=0;j<i;j++)   {
	System.out.print("  ");
	}
	for (int k=4;k>=i;k--)   {
	System.out.print("* ");
	}
	System.out.println();
	}   */
    
//  For Practice
    for (int i=0;i<5;i++)   {
    for (int j=0;j<i;j++)   {
    System.out.print(" ");	
    }
    for (int k=4;k>=i;k--)   {
    System.out.print("* ");	
    }
    System.out.println();
    }
	
    }
}
