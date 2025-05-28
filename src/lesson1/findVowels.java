package lesson1;

import java.util.Scanner;

public class findVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	Scanner s = new Scanner(System.in);
//  Input from user
    System.out.print("Enter a string: ");
    String input = s.nextLine();
//  Define vowels
    String vowels = "AEIOUaeiou";
    System.out.println("Vowels in the String are: ");
    for (int i = 0; i < input.length(); i++) {
    char c = input.charAt(i);
    if (vowels.indexOf(c)!=-1) {
    System.out.print(c+" ");
    }
    }
    s.close();   */
		
//  For Practice
    Scanner s = new Scanner(System.in);
	System.out.println("Enter a String: ");
	String input = s.nextLine();
	String vowels = "AEIOUaeiou";
	System.out.println("Vowels in the String are: ");
	for (int i=0;i<input.length();i++)   {
	char c = input.charAt(i);	
	if (vowels.indexOf(c)!=-1)   {
	System.out.print(c+" ");	
	}
	}
	s.close();
	
	}
}