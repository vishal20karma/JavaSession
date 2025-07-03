package lesson5;

public class sqrFilterAvg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Square, then do filter greater than 100, then average it - Output-537.5
/*  int [] num = {1,2,3,7,10,15,20,25,30};
	int count=0;
	int sum=0;
	for (int i=0;i<num.length;i++)   {
	int sqr = num[i]*num[i];	
	if (sqr>100)   {
	sum=sum+sqr;
	count++;	
	}
	}
	System.out.println("Total: "+sum);
	System.out.println("Count: "+count);
	System.out.println("Average: "+sum/(float)count)   */   //This is the only way to get the average in decimal points, else java only give the whole number in result

//  For Practice - Output-537.5
	int [] num = {1,2,3,7,10,15,20,25,30};
	int count=0;
	int sum=0;
	for (int i=0;i<num.length;i++)   {
	int sqr = num[i]*num[i];	
	if (sqr>100)   {
	sum=sum+sqr;
	count++;	
	}
	}
	System.out.println("Total: "+sum);
	System.out.println("Count: "+count);
	System.out.println("Average: "+sum/(float)count);
	
	}

}
