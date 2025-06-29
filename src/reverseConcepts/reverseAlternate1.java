package reverseConcepts;

public class reverseAlternate1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to reverse the alternate words in a String
/*	String output = "The taerG Indian ymonocE";
	String str = "The Great Indian Economy";
	StringBuilder sb = new StringBuilder();
	String [] spls = str.split(" ");
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];
	if (i%2==1)   {
	sb.append(new StringBuilder(s).reverse()+" ");	
	}
	else {
	sb.append(s+" ");	
	}
	}
	System.out.println(sb.toString().trim());   */
		
//  For Practice
	String output = "The taerG Indian ymonocE";
	String str = "The Great Indian Economy";
	StringBuilder sb = new StringBuilder();
	String [] spls = str.split(" ");
	for (int i=0;i<spls.length;i++)   {
	String s = spls[i];	
	if (i%2==1)   {
	sb.append(new StringBuilder(s).reverse()+" ");
	}
	else {
	sb.append(s+" ");	
	}
	}
	System.out.println(sb.toString().trim());
	
	}

}
