package lesson2;

public class addStrNumbs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to add all Integers present in the String as whole digit
/*	String str1 = "10 45 02 9 65";
	int sum=0;
	String [] spls = str1.split(" ");
	for (int i=0;i<spls.length;i++)   {
	sum=sum+Integer.parseInt(spls[i]);	
	}
	System.out.println(sum);   */
	
//  For Practice
	String str1 = "10 45 02 9 65";
	int sum=0;
	String [] spls = str1.split(" ");
	for (int i=0;i<spls.length;i++)   {
	sum=sum+Integer.parseInt(spls[i]);
	}
	System.out.println(sum);
	
	System.out.println("*********************************");
	
//  How to add all the Integers separately given in a String
/*	String str2 = "10 5 02 9 65";
	int tSum=0;
	for (int i=0;i<str2.length();i++)   {
	char c = str2.charAt(i);	
	if (c!=' ')   {
	String add = String.valueOf(c);   //Character cannot be added like ParseInt, that is why it has been converted to String first
	tSum=tSum+Integer.parseInt(add);
	}
	}
	System.out.println(tSum);   */
	
//  For Practice
	String str2 = "10 45 02 9 65";
	int tSum=0;
	for (int i=0;i<str2.length();i++)   {
	char c = str2.charAt(i);	
	if (c!=' ')   {
	String s = String.valueOf(c);	
	tSum=tSum+Integer.parseInt(s);
	}
	}
	System.out.println(tSum);
	
	}

}
