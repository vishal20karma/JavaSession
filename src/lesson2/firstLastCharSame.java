package lesson2;

import java.util.Scanner;

public class firstLastCharSame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to identify the Strings having first and last character same
/*	String [] str = {"Automation","Noon","Integer","Radar","Wiper","Madam"};
	for (String s:str)   {
	s=s.toLowerCase();	
	char first = s.charAt(0);
	char last = s.charAt(s.length()-1);
	if (first==last)   {
	System.out.println(s);	
	}
	}   */
		
//  For Practice
	String [] str = {"Automation","Noon","Integer","Radar","Wiper","Madam"};
	for (String s:str)   {
	s=s.toLowerCase();
	char first = s.charAt(0);	
	char last = s.charAt(s.length()-1);
	if (first==last)   {
	System.out.println(s);	
	}
	}
	
	
	System.out.println("***************************");
	
//  Same logic as user input	
/*	Scanner s = new Scanner(System.in);
	System.out.println("Enter the String:");
	String strg = s.nextLine();
	String result = charSame(strg);
	System.out.println(result);
	
	}

	public static String charSame(String strg)   {
	strg=strg.toLowerCase().trim();
	if (strg.length()>0)   {
	char ft = strg.charAt(0);	
	char lt = strg.charAt(strg.length()-1);
	if (ft==lt)   {
	return "First and Last characters are same";	
	}
	else if (ft!=lt)   {
	return "First and Last characters are NOT same";	
	}
	}
	return "Entered string have spaces or having Invalid Input";  */
	
//  For Practice
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the string:");
	String strg = s.nextLine();
	String result = charSame(strg);
	System.out.println(result);
	
	}

    public static String charSame(String strg)   {
    strg=strg.toLowerCase().trim();
    if (strg.length()>0)   {
    char ft = strg.charAt(0);
    char lt = strg.charAt(strg.length()-1);
    if (ft==lt)   {
    return "First and Last characters are same";	
    }
    else if (ft!=lt)   {
    return "First and Last characters are NOT same";
    }
    }
    return "Entered string have spaces or having Invalid Input";
    }


}
