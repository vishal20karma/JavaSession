package lesson3;

public class extractIntAdd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Extract the whole digits from alternate words and sum it
/*  String str = "js12l 91hj kjs7 ks72";
   	String [] spls = str.split(" ");
   	String num="";
	int sum=0;
	for (int i=0;i<spls.length;i++)   {
	String s  = spls[i];	
	if (i%2==1)   {
	for (int j=0;j<s.length();j++)   {
	char c = s.charAt(j);	
	if (Character.isDigit(c))   {
	num=num+c;
	}
	else {
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	num="";
	}
	}
	}
	}
	}
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	}
	System.out.println(sum);   */
		
//  For Practice
	String str = "js12l 91hj kjs7 ks72";
	String [] spls = str.split(" ");
	String num="";
	int sum=0;
	for (int i=0;i<spls.length;i++)   {
	String s  = spls[i];	
	if (i%2==1)   {
	for (int j=0;j<s.length();j++)   {
	char c = s.charAt(j);	
	if (Character.isDigit(c))   {
	num=num+c;
	}
	else {
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	num="";
	}
	}
	}
	}
	}
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	}
	System.out.println(sum);
	
	}

}
