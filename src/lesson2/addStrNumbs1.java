package lesson2;

public class addStrNumbs1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to add all the integers present in the String - Output-20
/*	String s = "@abc1hgnh12jhh07";   //Here '12' is twelve not 1 and 2
	String num="";
	int sum=0;
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (Character.isDigit(c))   {
	num=num+c;	                    //String and Characters can be added straight forward
	}                          //Loop ends here in the last character, therefore it will not go into 'else' condition to add the last digit. That is why addition sum has been done in the end.
	else if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	num="";
	}
	}
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	}
	System.out.println(sum);   */
	
//  For Practice - Output-20	
	String s = "@abc1hgnh12jhh07";
	String num="";
	int sum=0;
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);
	if (Character.isDigit(c))   {
	num=num+c;	
	}
	else if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	num="";
	}
	}
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	}
	System.out.println(sum);
	
	System.out.println("********************************");
	
//  How to add all the Integers separately present in the String - Output-12
/*	String str = "@abc1hgnh12jhh17";
	int tSum=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (Character.isDigit(c))   {
	String dgt = String.valueOf(c);	
	tSum=tSum+Integer.parseInt(dgt);
	}
	}
	System.out.println(tSum);   */
	
//  For Practice - Output-12
	String str = "@abc1hgnh12jhh17";
	int tSum=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (Character.isDigit(c))   {
	String dgt = String.valueOf(c);	
	tSum=tSum+Integer.parseInt(dgt);
	}
	}
	System.out.println(tSum);
	
	System.out.println("********************************");
	
//  How to add all the Integers separately, using enhanced for loop - Output-13
/*	String strg = "@abc1hgnh12jhh27";
	int totalSum=0;
	char [] c = strg.toCharArray();   //Its mandate to put into charArray because then only enhanced for loop will be used with Character
	for (Character chr:c)   {
	if (Character.isDigit(chr))   {
	int digit = Character.getNumericValue(chr);	
	totalSum=totalSum+digit;
	}
	}
	System.out.println(totalSum);   */
	
//  For Practice - Output-13
	String strg = "@abc1hgnh12jhh27";
	int totalSum=0;
	char [] c = strg.toCharArray();
	for (Character chr:c)   {
	if (Character.isDigit(chr))   {
	int digit = Character.getNumericValue(chr);	
	totalSum=totalSum+digit;
	}
	}
	System.out.println(totalSum);
	
	}
}
