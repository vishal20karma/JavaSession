package lesson5;

public class multiplicationTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//  How to print multiplication table	
/*	for (int i=1;i<=10;i++)   {
	for (int j=1;j<=5;j++)   {	
	System.out.printf("%-2d * %-2d = %-3d |", j,i,(j*i));   //It only works with Printf (print format)
	}
	System.out.println();
	}   */
//  '%d' is common and represent one digit space, '%-2d' represents 2 digit space and so on.
//  This is standard format and all space involved in the 'printf' results same way	
	
//  For Practice
	for (int i=1;i<=10;i++)   {
	for (int j=1;j<=10;j++)   {
	System.out.printf("%-2d * %-2d = %-3d |", j,i,(j*i));	
	}
	System.out.println();
	}
	
	}

}
