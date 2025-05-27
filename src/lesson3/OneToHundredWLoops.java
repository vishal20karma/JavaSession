package lesson3;

public class OneToHundredWLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to print One to Hundred without using any loop
/*	printNum(1);	
	
	}

	public static void printNum(int num)   {
	if (num<=100)   {
	System.out.println(num);
	num++;
	printNum(num);
	}   */
		
//  For Practice
	printNum(1);
	
	}

    public static void printNum(int num)   {
    if (num<=100)   {
    System.out.println(num);
    num++;
    printNum(num);
    }
    }

}
