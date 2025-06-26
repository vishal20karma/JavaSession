package duplicateConcepts;

public class duplicateIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to 
/*	int [] arr = {4,6,7,4,8,9,10,9,8,8};
	for (int i=0;i<arr.length;i++)   {
	int count=1;	
	for (int j=i+1;j<arr.length;j++)   {
	if (arr[i]==arr[j])   {
	count++;
	arr[j]='A';
	}
	}
	if (arr[i]!='A' && count>1)   {
	System.out.println(arr[i]+" : "+count);	
	}
	}   */
	
//  For Practice
	int [] arr = {4,6,7,4,8,9,10,9,8,8};
	for (int i=0;i<arr.length;i++)   {
	int count=1;	
	for (int j=i+1;j<arr.length;j++)   {
	if (arr[i]==arr[j])   {
	count++;
	arr[j]='A';
	}
	}
	if (arr[i]!='A' && count>1)   {
	System.out.println(arr[i]+" : "+count);	
	}
	} 	
	
	}

}
