package reverseConcepts;

public class reverseAlternate2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse the alternate words in a String
/*	String output = "The taerG Indian ymonocE With elbalacS Reports derapmoC To dlroW";	
	String str = "The Great Indian Economy With Scalable Reports Compared To World";
	String [] spls = str.split(" ");
	String result="";
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];
	if (i%2==1)   {   //i%2==0 will be for Even occurrences, 'i%3=2 will be for 3rd index', 'i%4=3 will be for 4th index', 'i%5=4 will be for 5th index' and so on
	String rev="";   //This has been used under if condition under first for loop, this is because each time we need fresh 'rev' of alternate word. Else, declaring it outside will keep appending to the previous reversed words, leading to wrong results.
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
	System.out.println(result.toString().trim());   */
		
//  For Practice
	String output = "The taerG Indian ymonocE With elbalacS Reports derapmoC To dlroW";	
	String str = "The Great Indian Economy With Scalable Reports Compared To World";
	String result="";
	String [] spls = str.split(" ");
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];	
	if (i%2==1)   {
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
