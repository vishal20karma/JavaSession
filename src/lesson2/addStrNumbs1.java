package lesson2;

public class addStrNumbs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to add all the integers present in the String	
/*	String s = "@abc1hgnh12jhh07";   //Here '12' is twelve not 1 and 2
	String num="";
	int sum=0;
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (Character.isDigit(c))   {
	num=num+c;	                    //String and Characters can be added straight forward
	}                          //Loop ends here in the last character, therefore it will not go into 'else' condition to add the last digit. That is why addition sum has been done in the end.
	else   {
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	num="";
	}
	}
	}
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	}
	System.out.println(sum);   */
	
//  For Practice		
	String s = "@abc1hgnh12jhh07";
	int sum=0;
	String num="";
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
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
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);	
	}
	System.out.println(sum);
	
	System.out.println("********************************");
	
//  How to add all the Integers separately present in the String	
/*	String str = "@abc1hgnh12jhh07";
	int tSum=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (Character.isDigit(c))   {
	String dgt = String.valueOf(c);	
	tSum=tSum+Integer.parseInt(dgt);
	}
	}
	System.out.println(tSum);   */
	
//  For Practice
	String str = "@abc1hgnh12jhh07";
	int tSum=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (Character.isDigit(c))   {
	String dgt = String.valueOf(c);	
	tSum=tSum+Integer.parseInt(dgt);
	}
	}
	System.out.println(tSum);
	
	}
}
