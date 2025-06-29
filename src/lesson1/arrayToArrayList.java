package lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayToArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	String [] names = {"Ravi","Kavi","Savi","Lavi","Pavi"};
	List<String> arrLstNm = Arrays.asList(names);
	for (String s:arrLstNm)   {
	System.out.println(s);	
	}
	
	System.out.println("**********************************");
	
	System.out.println(arrLstNm.contains("Savi"));
	System.out.println(arrLstNm.contains("Navi"));   */   //After converting Array to ArrayList, then only contains was used
	
//  For Practice
	String [] names = {"Ravi","Kavi","Savi","Lavi","Pavi"};
	List<String> arrLstNm = Arrays.asList(names);
	for (String s:arrLstNm)   {
	System.out.println(s);	
	}
	
	System.out.println("**********************************");
	
	System.out.println(arrLstNm.contains("Savi"));
	System.out.println(arrLstNm.contains("Navi"));
	
	System.out.println("**********************************");
	
//  How to convert 'int' Array to ArrayList	
//  Imp- 'int' Array cannot be directly converted to ArrayList because 'int' is a primitive type — and ArrayList holds objects (Integer, not int)	
//  Therefore it cannot directly converted to ArrayList like converting String Array to ArrayList like shown above
/*	int [] num = {10, -8, -90, 123, 56, 0, -19, 100, 555};
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (Integer i:num)   {
	arl.add(i);
	}
	System.out.println(arl);   */
	
//  For Practice
	int [] num = {10, -8, -90, 123, 56, 0, -19, 100, 555};
	ArrayList<Integer> arl = new ArrayList<Integer>();
	for (Integer i:num)   {
	arl.add(i);
	}
	System.out.println(arl);
	
	}

}
