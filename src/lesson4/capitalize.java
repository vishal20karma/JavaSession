package lesson4;

public class capitalize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to Capitalize first letter in a given string/sentence	
/*  String str = "india is a great country";   //Use blank, single space, double or more spaces to test
    String fResult = capitalize(str);
	System.out.println(fResult.trim());
	
	}

	public static String capitalize(String str)   {
	str=str.trim();
	String result = "";
	if (str.length()==1)   {   //To check if only one character and do not have 'space' character
	result=str.toUpperCase();	
	return result;
	}
	else if (str.length()>1)   {   //To check if string greater than one character and do not have single/double/tripple 'spaces' as a character (because already split by space has been used)
	String [] spls = str.split("\\s");
	for (String s:spls)   {
	String first = s.substring(0, 1).toUpperCase();   //Use of index in Substring range means it will count one less, that means here it is 0th index
	String rem = s.substring(1);
	result=result+first+rem+" ";
	}
	return result;
	}
	return "String do not have any character or just have spaces";   */
//  if return method created then it expects return third time also 'else if' used
		
//  For Practice
	String str = "india is a great country";
	String fResult = capitalize(str);
	System.out.println(fResult.trim());
	
	}

	public static String capitalize(String str)   {
	str=str.trim();
	String result="";
	if (str.length()==1)   {
	result = str.toUpperCase();	
	return result;
	}
	if (str.length()>1)   {
	String [] spls = str.split(" ");	
	for (String s:spls)   {
	String first = s.substring(0, 1).toUpperCase();	
	String rem = s.substring(1);
	result=result+first+rem+" ";
	}
	return result;
	}
	return "String do not have any character or just have spaces";
	}
}