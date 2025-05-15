package lesson3;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to create calculator
/*	Scanner s = new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int a = s.nextInt();
	int b = s.nextInt();
	System.out.println("Enter an operator for calculation-(+,-,*,/,%)");   //Modulus always return remainder
    char op = s.next().charAt(0);
	switch (op) {
	case '+' : System.out.println(a+b);
	break;
	case '-' : System.out.println(a-b);
	break;
	case '*' : System.out.println(a*b);
	break;
	case '/' : System.out.println(a/b);
	break;
	case '%' : System.out.println(a%b);
	break;
	default : System.out.println("Invalid Input");
	}   */
		
//  For Practice
	Scanner s = new Scanner(System.in);
	System.out.println("Enter two numbers:");
	int a = s.nextInt();
	int b = s.nextInt();
	System.out.println("Enter an operator for calculation-(+,-,*,/,%)");
	char op = s.next().charAt(0);
	switch (op)   {
	case '+' : System.out.println(a+b);
	break;
	case '-' : System.out.println(a-b);
	break;
	case '*' : System.out.println(a*b);
	break;
	case '/' : System.out.println(a/b);
	break;
	case '%' : System.out.println(a%b);
	default : System.out.println("Invalid Input");
	}
	
	}

}
