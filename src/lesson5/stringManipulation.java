package lesson5;

public class stringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String str = "I will crack automation interview very quickly";
	String str2 = "I will crack automation interview very quickly";
	String str3 = "I will Crack Automation Interview Very Quickly";
	String str4 = "01-01-2024";
	String a = "Hello";
	String b = "World";
	int x = 100;
	int y = 200;
//	System.out.println(str.length());   //How to get string size	
    System.out.println(str.length());		
//	System.out.println(str.charAt(7));   //Value present at 7th position, spaces are also string
    System.out.println(str.charAt(7));
//  System.out.println(str.indexOf('c'));   //Index of character c
	System.out.println(str.indexOf('c'));
//	System.out.println(str.indexOf('c', str.indexOf('c')+1));   //Index of second character c
	System.out.println(str.indexOf('c', str.indexOf('c')+1));
//	System.out.println(str.indexOf('c', str.indexOf('c', str.indexOf('c')+1)+1));   //Index of third character c
	System.out.println(str.indexOf('c', str.indexOf('c', str.indexOf('c')+1)+1));
//	System.out.println(str.indexOf("very"));
	System.out.println(str.indexOf("very"));
//	System.out.println(str.indexOf("hello"));   //Any string not available returns '-1', in string it do not returns null
	System.out.println(str.indexOf("hello"));
//	System.out.println(str.equals(str2));   //Equal comparison returns boolean value
    System.out.println(str.equals(str2)); 
//	System.out.println(str2.equals(str3));
	System.out.println(str2.equals(str3));
//	System.out.println(str2.equalsIgnoreCase(str3));   //It returns true because IgnoreCase function has been used
	System.out.println(str2.equalsIgnoreCase(str3));
//	System.out.println(str.substring(13, 23));
	System.out.println(str.substring(13, 23));
//	System.out.println(str4.replace('-', '/'));
	System.out.println(str4.replace('-', '/'));
//  System.out.println(a+b);	
	System.out.println(a+b);
//	System.out.println(x+y);
	System.out.println(x+y);
//  System.out.println(a+b+x+y);   //HelloWorld100200	
	System.out.println(a+b+x+y);
//	System.out.println(x+y+a+b);   //300HelloWorld
	System.out.println(x+y+a+b);
//	System.out.println(a+b+(x+y));
	System.out.println(a+b+(x+y));
//	System.out.println(str.lastIndexOf(""));   //How to find the size of string/sentence without .lenght()
	System.out.println(str.lastIndexOf(""));
	a.concat(b);
	System.out.println(a);   //It will not return a+b, it will only give the value of a only because we not assigned any object to it
	String c = a.concat(b);
	System.out.println(c);   //It will return a+b because a new string object 'c' has been assigned
	
	}

}
