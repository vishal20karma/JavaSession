package highestFreq;

public class hightestFrequency10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Finding nth occurrence of a character in a string 
/*	String str = "my responsibility";
	char ch = 'i';
	int nth=3;
	int nthOccurence = getNthOcc(str, ch, nth);		
	System.out.println(ch+"-nth occurence: "+nthOccurence);
	
	}

	public static int getNthOcc(String str, char ch, int nth)   {
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c==ch)   {
	count++;	
	}
	if (count==nth)   {
	return i;	
	}
	}
	return -1;   */
		
//  For Practice		
    String str = "my responsibility";
	char ch = 'i';
	int nth=3;
	int nthOccurence = getNthOcc(str, ch, nth);		
	System.out.println(ch+"-nth occurence: "+nthOccurence);
	
	}

	public static int getNthOcc(String str, char ch, int nth)   {
	int count=0;
	for (int i=0;i<str.length();i++)   {
	char c = str.charAt(i);	
	if (c==ch)   {
	count++;	
	}
	if (count==nth)   {
	return i;	
	}
	}
	return -1;
	}
}
