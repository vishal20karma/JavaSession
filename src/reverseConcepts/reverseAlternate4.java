package reverseConcepts;

public class reverseAlternate4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse exactly the middle word in a string
/*	String output = "The Great naidnI ymonocE Policy Rocks"; // or "The Great Indian ymonocE Policy Rocks Always";	
	String str = "The Great Indian Economy Policy Rocks Always";
//	String str = "The Great Indian Economy Policy Rocks";
	String [] spls = str.split(" ");
	StringBuilder sb = new StringBuilder();
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];
	int mid1 = spls.length/2;   //Returns exactly mid word if string length is Odd, or returns second mid if string length is Even
	int mid2 = spls.length/2-1;   //Returns first mid word if string length is Even
	if ((spls.length%2==1 && (i==mid1)
	|| (spls.length%2==0 && (i==mid1 || i==mid2))))   {
	sb.append(new StringBuilder(s).reverse()+" ");	
	}
	else {
	sb.append(s+" ");	
	}
	}
	System.out.println(sb.toString().trim());   */
	
//  For Practice
	String output = "The Great naidnI ymonocE Policy Rocks"; // or "The Great Indian ymonocE Policy Rocks Always";	
	String str = "The Great Indian Economy Policy Rocks Always";
//	String str = "The Great Indian Economy Policy Rocks";
	String [] spls = str.split(" ");
	StringBuilder sb = new StringBuilder();
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];
	int mid1 = spls.length/2;
	int mid2 = spls.length/2-1;
	if ((spls.length%2==1 && (i==mid1)
	|| (spls.length%2==0 && (i==mid1 || i==mid2))))   {
	sb.append(new StringBuilder(s).reverse()+" ");	
	}
	else {
	sb.append(s+" ");	
	}
	}
	System.out.println(sb.toString().trim());
	
	}

}
