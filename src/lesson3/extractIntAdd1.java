package lesson3;

public class extractIntAdd1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Extract the digits as a single from alternate words and sum it - Output-19
/*	String str = "js12l 91hj kjs7 ks72";
	String [] spls = str.split(" ");
	int sum=0;
	for (int i=0;i<spls.length;i++)   {
	String s  = spls[i];	
	if (i%2==1)   {
	for (int j=0;j<s.length();j++)   {
	char c = s.charAt(j);	
	if (Character.isDigit(c))   {
	String dgt = String.valueOf(c);
	sum=sum+Integer.parseInt(dgt);
	}
	}
	}
	}
	System.out.println(sum);   */
		
//  For Practice - Output-19
	String str = "js12l 91hj kjs7 ks72";
	String [] spls = str.split(" ");
	int sum=0;
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];
	if (i%2==1)   {
	for (int j=0;j<s.length();j++)   {
	char c = s.charAt(j);
	if (Character.isDigit(c))   {
	String dgt = String.valueOf(c);	
	sum=sum+Integer.parseInt(dgt);
	}
	}
	}
	}
	System.out.println(sum);
	
	}

}
