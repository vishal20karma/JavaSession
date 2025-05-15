package lesson4;

public class findLargestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	int [] num = {10, -8, -90, 123, 56, 0, -19, 100, 555};
	int largest = num[0];   //In Array we use '[0]' for index, in ArrayList we use '.get(0);'
	int smallest = num[0];
	
	for (int i=1;i<num.length;i++)   {
	if (num[i]>largest)   {
	largest=num[i];	
	}
	else if (num[i]<smallest)  {
	smallest=num[i];	
	}
	}
	System.out.println("Largest number - "+largest);
	System.out.println("Smallest number - "+smallest);   */
		
//  For Practice
	int [] num = {10, -8, -90, 123, 56, 0, -19, 100, 555};
	int largest = num[0];
	int smallest = num[0];
	for (int i=1;i<num.length;i++)   {
	if (num[i]>largest)   {
	largest=num[i];	
	}
	else if (num[i]<smallest)   {
	smallest=num[i];	
	}
	}
	System.out.println("Largest number - "+largest);
	System.out.println("Smallest number - "+smallest);
	
	}

}
