package replaceConcepts;

public class replaceIntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to covert num arrayLis to a String		
/*	int [] num = {75, 101, 115, 104, 117};
	String name = "";
	for (int i=0;i<num.length;i++)   {
	int n = num[i];	
	char c = (char)n;
	name=name+c;
	}
	System.out.println(name);   */
	
//  For Practice
	int [] num = {75, 101, 115, 104, 117};
	String name = "";
	for (int i=0;i<num.length;i++)   {
	int n = num[i];	
	char c = (char)n;
	name=name+c;
	}
	System.out.println(name);
	
	System.out.println("********************************");
	
//  How to convert this number to Characters and String
/*	String number = "7569837285";   //Directly Integer/Long not used, because its very long number and giving out of range   
	String result="";
	for (int i=0;i<number.length();i++)   {   //In the end 'i++' used additionally, so any value in the end incremented, then it will add one more value in the next iteration as main loop also has 'i++'
	String s = number.substring(i, i+2);
	System.out.println(s);
	int newNum = Integer.parseInt(s);
	result=result+(char)newNum;
	i++;
	}
	System.out.println(result);
	String naming="";
	for (int j=0;j<result.length();j++)   {
	String first = result.substring(0, 1);	
	String remaining = result.substring(1).toLowerCase();
	naming=first+remaining;
	}
	System.out.println(naming);   */
	
//  For Practice
	String number = "7569837285";
	String result="";
	for (int i=0;i<number.length();i++)   {
	String s = number.substring(i, i+2);	
	System.out.println(s);
	int newNum = Integer.parseInt(s);
	result=result+(char)newNum;
	i++;
	}
	System.out.println(result);
	String naming="";
	for (int j=0;j<result.length();j++)   {
	String first = result.substring(0, 1);	
	String remaining = result.substring(1).toLowerCase();
	naming=first+remaining;
	}
	System.out.println(naming);
	
	}
	
}
