package lesson1;

public class splitTrim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to split and trim
/*	String s = "Vishal Kumar Vishwakarma";
	String [] slpStrings1 = s.split(" ");   //If space used to split, then it will remove the spaces also
	System.out.println(slpStrings1[0]);
	System.out.println(slpStrings1[1]);
	System.out.println(slpStrings1[2]);   */
	
//  For Practice
	String s = "Vishal Kumar Vishwakarma";
	String [] slpStrings1 = s.split(" ");
	System.out.println(slpStrings1[0]);
	System.out.println(slpStrings1[1]);
	System.out.println(slpStrings1[2]);
	
	System.out.println("************************");
	
/*	String [] slpStrings2 = s.split("Kumar");   //If any character/string used to split, then it will always have spaces for 0th and 1st indexes
	System.out.println(slpStrings2[0]);
	System.out.println(slpStrings2[1]);   */
	
//  For Practice
	String [] slpStrings2 = s.split("Kumar");
	System.out.println(slpStrings2[0]);
	System.out.println(slpStrings2[1]);
	
	System.out.println("************************");
	
/*	String snm1 = slpStrings2[0].trim();   //How to remove the extra spaces
	String snm2 = slpStrings2[1].trim();   //After trim, values are thrown into String not Arrays
	System.out.println(snm1);
	System.out.println(snm2);   */
	
//  For Practice
	String snm1 = slpStrings2[0].trim();
	String snm2 = slpStrings2[1].trim();
	System.out.println(snm1);
	System.out.println(snm2);
	
	}

}
