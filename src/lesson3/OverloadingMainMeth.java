package lesson3;

public class OverloadingMainMeth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.out.println("Main Method-1");
/*  Below methods can be called like this, Overloading of main method can be done, 
	methods can have same name with different number of parameters or parameters type or both   */
	main("Vishal");
	main(10);
	}

	public static void main(String arg)   {
	System.out.println("Main Method-2");
	}

    public static void main (int a)   {
    System.out.println("Main Method-3");	
    }
}
