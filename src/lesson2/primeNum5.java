package lesson2;

import java.util.Scanner;

public class primeNum5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to 
/*	Scanner s = new Scanner(System.in);
	System.out.println("Enter the two numbers:");
	int low = s.nextInt();
	int high = s.nextInt();
	for (int i=low;i<=high;i++)   {
	int count=0;
	for (int j=1;j<=i;j++)   {
	if (i%j==0)   {
	count++;	
	}
	}
	if (count==2)   {
	System.out.println(i+" - is a Prime number");	
	}
	else {
	System.out.println(i+" - is NOT a Prime number");	
	}
	}   */
		
//  For Practice
	Scanner s = new Scanner(System.in);	
	System.out.println("Enter the two numbers:");
	int low = s.nextInt();	
	int high = s.nextInt();
	for (int i=low;i<=high;i++)   {
	int count=0;	
	for (int j=1;j<=i;j++)   {
	if (i%j==0)   {
	count++;	
	}
	}
	if (count==2)   {
	System.out.println(i+" - is a Prime number");	
	}
	else {
	System.out.println(i+" - is NOT a Prime number");	
	}
	}
	s.close();

	}

}
