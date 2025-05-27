package lesson2;

public class oddEven3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to check any number is Odd or Even without loop and if/els	
/*	int n = 18;
    String [] result = {"Even", "Odd"};
    System.out.println(result[n%2]);   */
		
//  For Practice
    int n = 18;
    String [] result = {"Even", "Odd"};
    System.out.println(result[n%2]);
	
	System.out.println("**************************************");
	
//  Alternate Ways (Ternary operator use)
/*	int i = 15;
	String evOrOdd = (i%2==0) ? "Even" : "Odd";
	System.out.println(evOrOdd);   */
	
//  For Practice
	int i = 15;
	String evOrOdd = (i%2==0) ? "Even" : "Odd";
    System.out.println(evOrOdd);
	
	}

}
