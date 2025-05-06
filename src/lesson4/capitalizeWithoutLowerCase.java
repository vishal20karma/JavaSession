package lesson4;

public class capitalizeWithoutLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//  How to leave first character as Capital and do the lower case remaining characters
//  Note - Challenge is not to use 'toLowerCase()' in the start		
/*	String str = "INDIA IS A GREAT COUNTRY";   
	String fResult = capitalize(str);
	System.out.println(fResult);
	
	}

	public static String capitalize(String str)   {
	String result="";
	str=str.trim();
	if (str.length()==1)   {
	result = str;	
	return result;
	}
	else if (str.length()>1)   {
	String [] spls = str.split("\\s");
	for (String s:spls)   {
	String first = s.substring(0,1);	
	String rem = s.substring(1).toLowerCase();
	result=result+first+rem+" ";
	}
	return result;
	}
	return "String do not have any character or just have spaces";   */
		
//  For Practice
	String str = "INDIA IS A GREAT COUNTRY";
	String fResult = capitalize(str);
	System.out.println(fResult);
	
	}
    
	public static String capitalize(String str)   {
	String result="";
	str=str.trim();	
	if (str.length()==1)   {
	result=str.toUpperCase();
	return result;
	}
	else if (str.length()>1)   {
	String [] spls = str.split("\\s");
	for (String s:spls)   {
	String first = s.substring(0, 1);	
	String rem = s.substring(1).toLowerCase();
	result=result+first+rem+" ";
	}
	return result;
	}
    return "String do not have any character or just have spaces";
	}

}