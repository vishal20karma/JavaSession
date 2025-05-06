package duplicateConcepts;

public class duplicateElements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find duplicate elements in an array	
/*	String [] s = {"c","java","python","ruby","c++","cobol","c","java"};
	for (int i=0;i<s.length;i++)   {
	int count=1;   //if 1 then it will give total duplicate, if 0 then it will give repeating duplicate only
	for (int j=i+1;j<s.length;j++)   {
	if (s[i].equals(s[j]))   {
	count++;
	System.out.println(s[i]+" : "+count);
	}
	}
	}   */
		
//  For Practice
	String [] s = {"c","java","python","ruby","c++","cobol","c","java"};
	for (int i=0;i<s.length;i++)   {
	int count=1;
	for (int j=i+1;j<s.length;j++)   {
	if (s[i].equals(s[j]))   {
	count++;
	System.out.println(s[i]+" : "+count);
	}
	}
	}
	
	}

}
