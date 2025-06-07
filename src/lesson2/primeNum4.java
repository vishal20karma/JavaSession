package lesson2;

import java.util.Scanner;

public class primeNum4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to 
/*	Scanner s = new Scanner(System.in);	
	System.out.println("Enter the number:");
	int num = s.nextInt();
	int count=0;
	for (int i=1;i<=num;i++)   {
	if (num%i==0)   {
	count++;	
	}
	}
	if (count==2)   {
	System.out.println(num+" - is a Prime number");	
	}
	else {
	System.out.println(num+" - is NOT a Prime number");	
	}
	s.close();   */
		
//  For Practice
	Scanner s = new Scanner(System.in);	
	System.out.println("Enter the number:");
	int num = s.nextInt();
	int count=0;
	for (int i=1;i<=num;i++)   {
	if (num%i==0)   {
	count++;	
	}
	}
	if (count==2)   {
	System.out.println(num+" - is a Prime number");	
	}
	else {
	System.out.println(num+" - is NOT a Prime number");	
	}
	s.close();
	
	}

}
