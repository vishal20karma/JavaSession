package lesson5;

import java.util.ArrayList;

public class maxNumString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to fin min/max number if having 2 digits whole number in a string		
/*	String s = "@abc1hgnh12jhh07joat13lk8lah41";
	ArrayList<Integer> arl = new ArrayList<Integer>();
	String num="";
	for (int i=0;i<s.length();i++)   {
	char c  = s.charAt(i);	
	if (Character.isDigit(c))   {
	num=num+c;	
	}
	else {
	if (!num.equals(""))   {
	arl.add(Integer.parseInt(num));
	num="";
	}
	}
	}
	if (!num.equals(""))   {
	arl.add(Integer.parseInt(num));
	}
	System.out.println(arl);
	int min = arl.get(0);
	int max = arl.get(0);
	for (int j=1;j<arl.size();j++)   {
	if (arl.get(j)<min)   {
	min=arl.get(j);	
	}
	else if (arl.get(j)>max)   {
	max=arl.get(j);	
	}
	}
	System.out.println("Minimum number: "+min);
	System.out.println("Maximum number: "+max);   */
		
//  For Practice
	String s = "@abc1hgnh12jhh07joat13lk8lah41";
	ArrayList<Integer> arl = new ArrayList<Integer>();
	String num="";
	for (int i=0;i<s.length();i++)   {
	char c = s.charAt(i);	
	if (Character.isDigit(c))   {
	num=num+c;	
	}
	else if (!num.equals(""))   {
	arl.add(Integer.parseInt(num));
	num="";
	}
	}
	if (!num.equals(""))   {
	arl.add(Integer.parseInt(num));
	}
	System.out.println(arl);
	int min = arl.get(0);
	int max = arl.get(0);
	for (int j=1;j<arl.size();j++)   {
	if (arl.get(j)<min)   {
	min=arl.get(j);	
	}
	else if (arl.get(j)>max)   {
	max=arl.get(j);	
	}
	}
	System.out.println("Min number: "+min);
	System.out.println("Max number: "+max);
	
	}

}
