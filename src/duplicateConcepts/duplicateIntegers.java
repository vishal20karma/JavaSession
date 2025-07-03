package duplicateConcepts;

public class duplicateIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to 
/*	int [] num = {4,6,7,4,8,9,10,9,8,8};
	for (int i=0;i<num.length;i++)   {
	int count=1;
	for (int j=i+1;j<num.length;j++)   {
	if (num[i]==num[j])   {
	count++;
	num[j]='A';
	}
	}
	if (num[i]!='A' && count>1)   {
	System.out.println(num[i]+" : "+count);	
	}
	}   */
	
//  For Practice
	int [] num = {4,6,7,4,8,9,10,9,8,8};
	for (int i=0;i<num.length;i++)   {
	int count=1;
	for (int j=i+1;j<num.length;j++)   {
	if (num[i]==num[j])   {
	count++;
	num[j]='A';
	}
	}
	if (num[i]!='A' && count>1)   {
	System.out.println(num[i]+" : "+count);	
	}
	}

	}
}
