package lesson3;

public class printRangeWLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to print within a range	
/*	printNumb(5, 50);
	
	}

	public static void printNumb(int stNum, int endNum)   {
	if (stNum<=endNum)   {
	System.out.println(stNum);
	stNum++;
	printNumb(stNum, endNum);
	}   */
		
//  For Practice
	printNumb(5, 50);
	
	}

    public static void printNumb(int stNum, int endNum)   {
    if (stNum<=endNum)   {
    System.out.println(stNum);
    stNum++;
    printNumb(stNum, endNum);
    }
    
    }

}
