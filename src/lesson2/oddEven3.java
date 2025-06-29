package lesson2;

import java.util.Scanner;

public class oddEven3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to check any number is Odd or Even without loop and if/els	
/*	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number:");
    int n = s.nextInt();
    String [] result = {"Even", "Odd"};
    System.out.println(result[n%2]);
    s.close();   */
		
//  For Practice
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number:");
	int n = s.nextInt();
	String [] result = {"Even", "Odd"};
	System.out.println(result[n%2]);
	s.close();
	
	System.out.println("**************************************");
	
//  Alternate Ways (Ternary operator use)
/*	int i = 15;
	String evOrOdd = (i%2==0) ? "Even" : "Odd";   //This checks what is the return value, for example in this case its String
	System.out.println(evOrOdd);   */
	
//  For Practice
	int i = 15;
	String evOrOdd = (i%2==0) ? "Event" : "Odd";
	System.out.println(evOrOdd);
	}

}
