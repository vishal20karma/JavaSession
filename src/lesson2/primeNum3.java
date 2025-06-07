package lesson2;

public class primeNum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find prime numbers in a range	
/*  for (int i=1;i<=100;i++)   {
    int count=0;
    for (int j=1;j<=i;j++)   {
    if (i%j==0)   {
    count++;	
    }
    }
    if (count==2)   {
    System.out.println(i+" - is a Prime number");	
    }
    else   {
    System.out.println(i+" - is NOT a Prime number");	
    }
    }   */
	
//  For Practice
	for (int i=1;i<=100;i++)   {
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
	
	}

}
