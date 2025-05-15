package duplicateConcepts;

public class duplicateStrings1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  'the' and 'most' will print 2 and 4 times respectively	
/*	String s = "Google is the most popular search engine in the most world. Bing most comes at number two most";
	String ls = s.toLowerCase();
	String [] spls = ls.split(" ");
	System.out.println(spls[6]);   //It will print 'engine', split has been used to remove the space and then it goes to String array and every word has its index and then it can be counted
    System.out.println(spls.length);
	for (int i=0;i<spls.length;i++)   {
	int count=1;
	for (int j=i+1;j<spls.length;j++)   {
	if (spls[i].equals(spls[j]))   {
	count++;
	spls[j]="0";   //This is used to avoid visited words
	}
	}
	if (spls[i]!="0" && count>1)   {
	System.out.println(spls[i]+" : "+count);	
	}
	}   */
		
//  For Practice
	String s = "Google is the most popular search engine in the most world. Bing most comes at number two most";
	String ls = s.toLowerCase();
	String [] spls = ls.split(" ");
	for (int i=0;i<spls.length;i++)   {
	int count=1;
	for (int j=i+1;j<spls.length;j++)   {
	if (spls[i].equals(spls[j]))   {
	count++;
	spls[j]="0";
	}
	}
	if (spls[i]!="0" && count>1)   {
	System.out.println(spls[i]+" : "+count);
	}	
	}
	}

}
