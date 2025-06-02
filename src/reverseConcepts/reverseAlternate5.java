package reverseConcepts;

public class reverseAlternate5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse exactly the middle word/words in a string, because words count can be odd/even
	String output = "The Great naidnI ymonocE Policy Rocks"; // or "The Great Indian ymonocE Policy Rocks Always"; Or "The Great naidnI ymonocE yciloP Rocks Always"
	String str = "The Great Indian Economy Policy Rocks Always";
//	String str = "The Great Indian Economy Policy Rocks";
	midReverse(str);
		
	}
	
	public static void midReverse(String str)   {
	String result="";
	String [] spls = str.split(" ");
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];
	int mid1 = spls.length/2;
	int mid2=spls.length/2-1;
	int mid3=spls.length/2+1;
	if (spls.length%2==1 && (i==mid1)   //If words are Odd, it will chose middle exactly middle word
	|| spls.length%2==0 && (i==mid1 || i==mid2)   //If words are Even, it will chose two middle words
	|| spls.length%2==1 && (i==mid1 || i==mid2 || i==mid3))   {    //If words are Odd, it will chose three middle words
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
