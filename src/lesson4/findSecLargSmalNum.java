package lesson4;

public class findSecLargSmalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to find second largest and second smallest number
/*	int [] num = {10, -8, -90, 123, 56, 0, -19, 100, 555};
	int largest = num[0];
	int scndLargest = num[0];
	int smallest = num[0];
	int scndSmallest = num[0];
	for (int i=1;i<num.length;i++)   {
	if (num[i]>largest)   {
	scndLargest=largest;   //keeping track of the second highest just before the largest gets updated to new num[i]
	largest=num[i];
	}
	else if (num[i]>scndLargest && num[i]<largest)   {
	scndLargest=num[i];	
	}
	if (num[i]<smallest)   {
	scndSmallest=smallest;   //keeping track of the second smallest just before the smallest gets updated to new num[i]
	smallest=num[i];
	}
	else if (num[i]<scndSmallest && num[i]>smallest)   {
	scndSmallest=num[i];	
	}
	}
    System.out.println("Second largest: "+scndLargest);
    System.out.println("Second smallest: "+scndSmallest);   */
		
//  For Practice
	int [] num = {10, -8, -90, 123, 56, 0, -19, 100, 555};
	int largest = num[0];
	int scndLargest = num[0];
	int smallest = num[0];
	int scndSmallest = num[0];
	for (int i=1;i<num.length;i++)   {
	if (num[i]>largest)   {
	scndLargest=largest;
	largest=num[i];
	}
	else if (num[i]>scndLargest && num[i]<largest)   {
	scndLargest=num[i];	
	}
	if (num[i]<smallest)   {
	scndSmallest=smallest;
	smallest=num[i];
	}
	else if (num[i]<scndSmallest && num[i]>smallest)   {
	scndSmallest=num[i];	
	}
	}
	System.out.println("Second largest: "+scndLargest);
	System.out.println("Second smallest: "+scndSmallest);
	}

}
