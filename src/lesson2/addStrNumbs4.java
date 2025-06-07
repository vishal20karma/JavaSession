package lesson2;

public class addStrNumbs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to add Integer from a string without using 'isDigit()' - Output-11
/*	String s = "@abc1hgnh12jhh07";
	int sum=0;
	for (int i=0;i<s.length();i++)   {
	if (s.charAt(i)>='0' && s.charAt(i)<='9')   {
	char c = s.charAt(i);	
	int value = Character.getNumericValue(c);
	sum=sum+Integer.parseInt(value);
	}
	}
	System.out.println(sum);   */
		
//  For Practice - Output-11
	String s = "@abc1hgnh12jhh07";
	int sum=0;
	for (int i=0;i<s.length();i++)   {
	if (s.charAt(i)>='0' && s.charAt(i)<='9')   {
	char c = s.charAt(i);	
	int value = Character.getNumericValue(c);
	sum=sum+value;
	}
	}
	System.out.println(sum);
	
	}

}
