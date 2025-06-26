package lesson3;

import java.util.ArrayList;

public class integerSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  How to sort the integers without using Arrays.sort();
/*	int [] num = {8,3,1,10,4,5,2,6,9,7};
	for (int i=0;i<num.length-1;i++)   {
	for (int j=0;j<num.length-1-i;j++)   {
	if (num[j]>num[j+1])   {
	int temp=num[j];
	num[j]=num[j+1];
	num[j+1]=temp;
	}
	}
	}
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (int number:num)   {
	arl.add(number);
	}
	System.out.println(arl);   */
		
//  For Practice
	int [] num = {8,3,1,10,4,5,2,6,9,7};
	for (int i=0;i<num.length-1;i++)   {
	for (int j=0;j<num.length-1-i;j++)   {
	if (num[j]>num[j+1])   {
	int temp=num[i];
	num[j]=num[j+1];
	num[j+1]=temp;
	}
	}
	}
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (int number:num)   {
	arl.add(number);	
	}
	System.out.println(arl);
	
	}

}
