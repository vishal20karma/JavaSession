package duplicateConcepts;

public class duplicateChar1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to identify repeating characters
/*	String s = "My Great Responsibility";
	s=s.toLowerCase();
	char [] c = s.toCharArray();
	for (int i=0;i<s.length();i++)   {
	int count=0;
	for (int j=i+1;j<s.length();j++)   {
	if (c[i]==c[j] && c[i]!=' ')   {
	count++;
	c[j]='0';
	}
	}
	if (c[i]!='0' && count>0)   {
	System.out.println(c[i]+"-"+count+"-"+s.indexOf(c[i]));
	System.out.println(count);
	}
	}   */
	
//  For Practice	
	String s = "My Great Responsibiltiy";
	s=s.toLowerCase();
	char [] c = s.toCharArray();
	for (int i=0;i<s.length();i++)   {
	int count=0;
	for (int j=i+1;j<s.length();j++)   {
	if (c[i]==c[j] && c[i]!=' ')   {
	count++;	
	c[j]='0';
	}
	}
	if (c[i]!='0' && count>0)   {
	System.out.println(c[i]+" : "+count+" : "+s.indexOf(c[i]));	
	}
	}
	
	}
}
