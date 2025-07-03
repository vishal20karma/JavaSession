package dataStructures;

import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String s = "programming";
	char [] c = s.toCharArray();
	for (int i=0;i<c.length-1;i++)   {
	for (int j=0;j<c.length-1-i;j++)   {
	if (c[j]>c[j+1])   {
	char temp=c[j];
	c[j]=c[j+1];
	c[j+1]=temp;
	}
	}
	}
	String sorted = new String(c);
	System.out.println(sorted);
	
	}

}
