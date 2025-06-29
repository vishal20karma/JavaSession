package lesson4;

public class nameWithSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to get your name correctly and remove the space	
/*  String s = "l ahs iV";
    String name="";
	for (int i=s.length()-1;i>=0;i--)   {
	char c = s.charAt(i);	
	if (c!=' ')   {
	name=name+c;	
	}
	}
	System.out.println(name);   */
		
//  For Practice
	String s = "l ahs iV";
	String name = "";
	for (int i=s.length()-1;i>=0;i--)   {
	char c = s.charAt(i);	
	if (c!=' ')   {
	name=name+c;	
	}
	}
	System.out.println(name);
	
	}

}
