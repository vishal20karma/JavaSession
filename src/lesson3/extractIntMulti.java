package lesson3;

public class extractIntMulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Extract the single digits from odd and even words, sum them separately and in the last multiply - Even-10, Odd-19, Output-190
/*	String str = "js12l 91hj kjs7 ks72";
    String [] spls = str.split(" ");
    int evenSum=0;
    int oddSum=0;
    for (int i=0;i<spls.length;i++)   {
    String s = spls[i];
    for (int j=0;j<s.length();j++)   {
    char c = s.charAt(j);
    if (Character.isDigit(c))   {
    int dgt = Character.getNumericValue(c);
    if (i%2==0)   {
    evenSum=evenSum+dgt;
    }
    else {
    oddSum=oddSum+dgt;	
    }
    }
    }
    }
    System.out.println("Even words sum: "+evenSum);
	System.out.println("Odd words sum: "+oddSum);
	System.out.println("Multiply result:"+evenSum*oddSum);   */
		
//  For Practice - Even-10, Odd-19, Output-190
	String str = "js12l 91hj kjs7 ks72";
	int evenSum=0;
	int oddSum=0;
	String [] spls = str.split(" ");
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];
	for (int j=0;j<s.length();j++)   {
	char c = s.charAt(j);
	if (Character.isDigit(c))   {
	int dgt = Character.getNumericValue(c);
	if (i%2==0)   {
	evenSum=evenSum+dgt;	
	}
	else {
	oddSum=oddSum+dgt;	
	}
	}
	}
	}
	System.out.println("Even words sum: "+evenSum);
	System.out.println("Odd words sum: "+oddSum);
	System.out.println("Multiply result:"+evenSum*oddSum);
	
	}
}
