package lesson2;

import org.testng.Assert;

public class palindromeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to check if any number is Palindrome or not
/*	int num = 3456543;	
	int pNum = palindrome(num);
	if (pNum==num)   {
	System.out.println(num+" - a Palindrome number");	
	}
	else   {
	System.out.println(num+" - is NOT a Palindrome number");
	}
	}

	public static int palindrome(int num)   {
	int rev=0;
	while (num!=0)   {
	int r = num%10;	
	rev=rev*10+r;
	num=num/10;
	}
	return rev;   */
		
//  For Practice
	int num = 3456543;	
	int pNum = palindrome(num);
	if (pNum==num)   {
	System.out.println(num+" - is a Palindrome number");	
	}
	else {
	System.out.println(num+" - is NOT a Palindrome number");
	}
	}

    public static int palindrome(int num)   {
    int rev=0;
    while (num!=0)   {
    int r = num%10;	
    rev=rev*10+r;
    num=num/10;
    }
    return rev;
    }
}
