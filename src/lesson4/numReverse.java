package lesson4;

public class numReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse any number	
/*	int num = 123456;
	int rev=0;
	while (num!=0)   {
	int rem = num%10;	
	rev = rev*10+rem;
	num=num/10;   //Any single digit divide by 10 will give 0 remainder that is why it has been used in the while loop
	System.out.println(num);
	}
	System.out.println(rev);   */
		
//  For Practice
	int num = 123456;
	int rev=0;
	while (num!=0)   {
	int rem = num%10;	
	rev=rev*10+rem;
	num=num/10;
	}
	System.out.println(rev);
	}

}
