package lesson2;

public class primeNum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	int [] pNum = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};   //Note - 1 is not a prime number
	for (int i=0;i<pNum.length;i++)   {
	int count=0;
	for (int j=1;j<=pNum[i];j++)   {
	if (pNum[i]%j==0)   {
	count++;	
	}
	}
	if (count==2)   {
	System.out.println(pNum[i]+" - is a Prime numbr");
	}
	else   {
	System.out.println(pNum[i]+" - is NOT a Prime number");	
	}
	}   */
		
//  For Practice
	int [] pNum = {0,1,2,3,4,5,6,7,8,9,10,11,12,13};
	for (int i=0;i<pNum.length;i++)   {
	int count=0;	
	for (int j=1;j<=pNum[i];j++)   {
	if (pNum[i]%j==0)   {
	count++;	
	}
	}
	if (count==2)   {
	System.out.println(pNum[i]+" - is a Prime number");	
	}
	else {
	System.out.println(pNum[i]+" - is NOT a Prime number");	
	}
	}
	
	}

}
