package lesson4;

public class names1k {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Printing names 1000 times with Loop
/*	int count=0;	
	for (int i=0;i<1000;i++)   {
	System.out.println("Vishal");	
	count++;
	}
	System.out.println(count);   */
	
//  For Practice
	int count=0;
	for (int i=0;i<1000;i++)   {
	System.out.println("Vishal");
	count++;
	}
	System.out.println(count);
	
	System.out.println("********************************");
	
//  Printing names 1000 times without Loop and by replacing characters
/*	String name = "Vishal";
	String s = "i";
	s=s.replace("i", "iiiiiiiiii");
	s=s.replace("i", "iiiiiiiiii");
	s=s.replace("i", "iiiiiiiiii");
	s=s.replace("i", name + "\n");
	System.out.println(s);   */
	
//  For Practice
	String name = "Vishal";
	String s = "i";
	s=s.replace("i", "iiiiiiiiii");
	s=s.replace("i", "iiiiiiiiii");
	s=s.replace("i", "iiiiiiiiii");
	s=s.replace("i", name+ "\n");
	System.out.println(s);
	
	System.out.println("********************************");
	
//  Printing names 1000
/*	names(1, "Vishal");
	
	}

	public static void names(int num, String myName)   {
    if (num<=1000)   {
    System.out.println(myName);
    num++;
    names(num, myName);
    }   */
	
//  For Practice
	names(1, "Vishal");
	
	}
  
	public static void names(int num, String myName)   {
	if (num<=1000)   {
	System.out.println(myName);	
	num++;
	names(num, myName);
	}
	}
}
