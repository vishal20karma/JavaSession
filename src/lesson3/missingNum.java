package lesson3;

public class missingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	How to find missing number in an array  - formulae n(n+1)/2	
/*	int [] num = {1,2,3,4,5,6,8,9,10};
	int num2 = missingNum(num, 10);	
	System.out.println(num2);
	
	}

	public static int missingNum(int [] num, int totalCount)   {
	int totalSum = totalCount*(totalCount+1)/2;
	int actualSum = 0;	
	for (int i:num)   {
	actualSum=actualSum+i;	
	}
	return totalSum-actualSum;
	}   */
		
//  For Practice
	int [] num = {1,2,3,4,6,7,8,9,10};
	int num2 = missingNum(num, 10);
    System.out.println(num2);
	
	}

    public static int missingNum(int [] num, int totalCount)   {
    int totalSum=totalCount*(totalCount+1)/2;
    int actualSum=0;
    for (int i:num)   {
    actualSum=actualSum+i;	
    }
    return totalSum-actualSum;
    }

}
