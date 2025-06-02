package reverseConcepts;

public class reverseAlternate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse exactly the middle word in a string
	String output = "ehT Great Indian ymonocE";	
	String str = "The Great Indian Economy Rocks";
	String result="";
	String [] spls = str.split(" ");
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];	
	if (i==(spls.length)/2)   {   //Total length divide by 2 will give exactly map to middle index if total number of words are Odd, in this case modulus operator should not be used
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
	System.out.println(result.toString().trim());
	
	}

}
