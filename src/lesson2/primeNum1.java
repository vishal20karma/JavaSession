package lesson2;

public class primeNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find prime number
/*  int pNum = 13;
    int count=0;
    for (int i=1;i<=pNum;i++)   {
    if (pNum%i==0)   {
    count++;	
    }
    }
	if (count==2)   {
	System.out.println(pNum+" - is a Prime number");	
	}
	else   {
	System.out.println(pNum+" - is NOT a Prime number");	
	}   */
		
//  For Practice
	int pNum=13;
	int count=0;
	for (int i=1;i<=pNum;i++)   {
	if (pNum%i==0)   {
	count++;	
	}
	}
	if (count==2)   {
	System.out.println(pNum+" - is a Prime number");
	}
	else {
	System.out.println(pNum+" - is NOT a Prime number");	
	}
	
	}

}
