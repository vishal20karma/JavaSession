package lesson3;

public class stringSorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to sort a string without using Arrays.sort()/Collections.sort(), below programming is called Bubble Sort logic
/*  String s = "programming";	
	char [] chr = s.toCharArray();   //Converting String to Array
	for (int i=0;i<chr.length-1;i++)   {   //length-1 has been used as no need of sorting the last character, because its already sorted and pushed in the last, and anything in the last after sorting, no need to sort it again.
	for (int j=0;j<chr.length-1-i;j++)   {   //length-1-i has been used, if we remove -i, then also it will give the correct result. But when before it already sorted therefore no need to do last iteration.
	if (chr[j]>chr[j+1])   {
//  if (chr[j]<chr[j+1])   {   //Use '<' to sort in reverse order	
	char temp=chr[j];	
	chr[j]=chr[j+1];
	chr[j+1]=temp;
	}
	}
	}
	String sorted = new String(chr);   //Putting the char array into string again.
	System.out.println("Original: "+s);
	System.out.println("Sorted: "+sorted);   */
		
//  For Practice
	String s = "programming";
	char [] chr = s.toCharArray();
	for (int i=0;i<chr.length-1;i++)   {
	for (int j=0;j<chr.length-1-i;j++)   {
	if (chr[j]>chr[j+1])   {
//  if (chr[j]<chr[j+1])   {   //Use '<' to sort in reverse order		
	char temp=chr[j];
	chr[j]=chr[j+1];
	chr[j+1]=temp;
	}
	}
	}
	String sorted = new String(chr);
	System.out.println("Original: "+s);
	System.out.println("Sorted: "+sorted);
	
	}
}