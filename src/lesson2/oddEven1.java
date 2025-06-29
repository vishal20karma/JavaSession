package lesson2;

public class oddEven1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to check any number is Odd or Even	
	
/*	int [] num = {1,2,3,4,5,6,7,8,9,10};
	for (int i=0;i<num.length;i++)   {
	if (num[i]%2==0)  {
	System.out.println(num[i]+" - is an Even number");	
	}
	else   {
	System.out.println(num[i]+" - is an Odd number");	
	}
	}   */
		
//  For Practice
	int [] num = {1,2,3,4,5,6,7,8,9,10};
	for (int i=0;i<num.length;i++)   {
	if (num[i]%2==0)   {
	System.out.println(num[i]+" - is an Even number");	
	}
	else {
	System.out.println(num[i]+" - is NOT an Even number");	
	}
	}
	
	}

}
