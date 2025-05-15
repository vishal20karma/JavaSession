package lesson2;

public class addStrNumbs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to add Integers from ArrayList String	
/*	String [] str = {"2ab", "KK1", "hg22u", "rr2"};
	String num="";
	int sum=0;
    for (int i=0;i<str.length;i++)   {
    String s = str[i];	
    for (int j=0;j<str[i].length();j++)   {
    char c = s.charAt(j);
    if (Character.isDigit(c))   {
    num=num+c;	
    }
    else   {
    if (!num.equals(""))   {
    sum=sum+Integer.parseInt(num);
    num="";
    }
    }
    }
    }
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);	
	}
	System.out.println(sum);   */
		
//  For Practice
	String [] str = {"2ab", "KK1", "hg22u", "rr2"};
	String num="";
	int sum=0;
	for (int i=0;i<str.length;i++)   {
	String s = str[i];	
	for (int k=0;k<s.length();k++)   {
	char c = s.charAt(k);	
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
	if (!num.equals(""))   {
	sum=sum+Integer.parseInt(num);
	}
	System.out.println(sum);
	
	}

}
