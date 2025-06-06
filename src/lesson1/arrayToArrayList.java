package lesson1;

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
	
	}

}
