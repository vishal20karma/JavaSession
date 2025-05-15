package lesson5;

import java.util.ArrayList;
import java.util.List;

public class startsWithOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  Find the number starts with 1
/*	int [] number = {67, 1, 12, 23, 21, 10};
	List<Integer> startsWithOne =  getNumberList(number);
	System.out.println(startsWithOne);
	
	}

	public static int getFirstDigit(int num)   {
	while (num>=10)   {
	num=num/10;	
	}
	return num;
	}

	public static ArrayList<Integer> getNumberList(int [] number)   {
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (int num:number )   {
	int n = getFirstDigit(num);
	if (n==1)   {
	arl.add(num);
	}
	}
	return arl;   */
		
//  For Practice
	int [] number = {67, 1, 12, 23, 21, 10};
	List<Integer> startWithOne = getNumberList(number);
	System.out.println(startWithOne);
	
	}
	
	public static int getFirstDigit(int num)   {
	while (num>=10)   {
	num=num/10;	
	}
	return num;
	}
	
	public static ArrayList<Integer> getNumberList(int [] number)   {
	ArrayList<Integer> arl = new ArrayList<Integer>();	
	for (int num:number)   {
	int n = getFirstDigit(num);	
	if (n==1)   {
	arl.add(num);	
	}
	}
    return arl;
	}
}