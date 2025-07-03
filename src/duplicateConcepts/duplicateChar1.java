package duplicateConcepts;

public class duplicateChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to identify repeating characters
/*	String s = "My Great Responsibility";
	s=s.toLowerCase().replaceAll("\\s", "");
	System.out.println(s);
	char [] c = s.toCharArray();
	for (int i=0;i<c.length;i++)   {   //c.length or s.length() - both will work
	int count=1;	
	for (int j=i+1;j<c.length;j++)   {
	if (c[i]==c[j])   {
	count++;
	c[j]='0';
	}
	}
	if (c[i]!='0' && count>1)   {
	System.out.println(c[i]+"-"+count+"-"+s.indexOf(c[i]));	
	}
	}   */
	
//  For Practice	
	String s = "My Great Responsibility";
	s=s.toLowerCase().replaceAll("\\s", "");
	System.out.println(s);
	char [] c = s.toCharArray();
	for (int i=0;i<c.length;i++)   {
	int count=1;
	for (int j=i+1;j<c.length;j++)   {
	if (c[i]==c[j])   {
	count++;
	c[j]='0';
	}
	}
	if (c[i]!='0' && count>1)   {
	System.out.println(c[i]+"-"+count+"-"+s.indexOf(c[i]));
	}
	}
	
	
    System.out.println("*****************************");
	
//  How to get the frequency of every character
/*	String str = "My Great Responsibilities";
    str=str.toLowerCase().replaceAll("\\s", "");
    System.out.println(str);
	char [] chr = str.toCharArray();
	for (int i=0;i<chr.length;i++)   {
	int count=1;
	if (chr[i]=='0')   {   // Skip the inner loop below if already character visited and marked '0'
	continue;	//continue keyword means it will not skip the remaining code below which is inner loop, and it will continue iterating outer loop which it belongs to
	}
	for (int j=i+1;j<chr.length;j++)   {
	if (chr[i]==chr[j])   {
	count++;
	chr[j]='0';   // Mark as counted
	}
	}
	System.out.println(chr[i]+" : "+count);
	}   */
    
//  For Practice
    String str = "My Great Responsibilities";
    str=str.toLowerCase().replaceAll("\\s", "");
    System.out.println(str);
	char [] chr = str.toCharArray();
	for (int i=0;i<chr.length;i++)   {
	int count=1;
	if (chr[i]=='0')   {
	continue;	
	}
	for (int j=i+1;j<chr.length;j++)   {
	if (chr[i]==chr[j])   {
	count++;
	chr[j]='0';
	}
	}
	System.out.println(chr[i]+" : "+count);
	}
	
	}
	
}
