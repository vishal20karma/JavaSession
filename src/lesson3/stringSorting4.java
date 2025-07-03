package lesson3;

public class stringSorting4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	String s = "programming";
	char [] c = s.toCharArray();
	int mCount=0;
	for (int i=0;i<c.length;i++)   {
	if (c[i]!='m')   {
//	if (c[i]=='m')   {   //Use '==' to move the character to front
	char temp=c[i];	
	c[i]=c[mCount];
	c[mCount]=temp;
	mCount++;
	}
	}
	String str = new String(c);
	System.out.println(str);   */
		
//  For Practice
	String s = "programming";
	char [] c = s.toCharArray();
	int mCount=0;
	for (int i=0;i<c.length;i++)   {
	if (c[i]!='m')   {
//  if (c[i]=='m')   {   //Use '==' to move the character to front
	char temp=c[i];
	c[i]=c[mCount];
	c[mCount]=temp;
	mCount++;
	}
	}
	String str = new String(c);
	System.out.println(str);
	
	}
}
