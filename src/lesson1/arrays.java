package lesson1;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*  int [] arr1 = new int[5];   //Here 5 means it can go from (0 to 4), if added onwards then it will hit indexes out of bound in execution
    arr1[0]=1;
    arr1[1]=2;
    arr1[2]=3;
    arr1[3]=4;
    arr1[4]=5;
	System.out.println(arr1[3]);   */
	
	
//  For Practice
	int [] arr1 = new int [5];
	arr1[0]=1;
	arr1[1]=2;
	arr1[2]=3;
	arr1[3]=4;
	arr1[4]=5;
	System.out.println(arr1[3]);
	
	System.out.println("********************************");	
	
//  Another and smarter way to write arrays
/*	int [] arr2 = {6,7,8,9,10};
	System.out.println(arr2[1]);
	for (int i=0;i<arr2.length;i++)   {
	System.out.println(arr2[i]);	
	}   */
	
//  For Practice
	int [] arr2 = {6,7,8,9,10};
	for (int i=0;i<arr2.length;i++)   {
	System.out.println(arr2[i]);	
	}
	
	}

}
