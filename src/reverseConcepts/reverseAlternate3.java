package reverseConcepts;

public class reverseAlternate3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse first and last words
/*	String output = "ehT Great Indian ymonocE";	
	String str = "The Great Indian Economy";
	String result="";
	String [] spls = str.split("\\s");
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];	
	if (i==0 || i==spls.length-1)   {   //If we calculate or print then total count will come 4 in this case, therefore -1 has been done to match the index as it starts with 0
	String rev="";
	for (int j=s.length()-1;j>=0;j--)   {
	char c = s.charAt(j);	
	rev=rev+c;
	}
	result=result+rev+" ";
	}
	else {
	result=result+spls[i]+" ";
	}
	}
	System.out.println(result.toString().trim());   */
		
//  For Practice
	String output = "ehT Great Indian ymonocE";
	String str = "The Great Indian Economy";
	String [] spls = str.split("\\s");
	String result="";
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];	
	if (i==0 || i==spls.length-1)   {
	String rev="";
	for (int j=s.length()-1;j>=0;j--)   {
	char c = s.charAt(j);	
	rev=rev+c;
	}
	result=result+rev+" ";
	}
	else {
	result=result+s+" ";	
	}
	}
	System.out.println(result.toString().trim());
	}

}
