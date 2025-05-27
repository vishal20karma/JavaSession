package lesson5;

import java.util.ArrayList;
import java.util.Arrays;

public class sideBySide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to print two list side by side
/*	ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
	System.out.println(list1);
	ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
	System.out.println(list2);
	for (int i=0;i<list1.size();i++)   {
	System.out.printf("%d : %d\n", list1.get(i), list2.get(i));	
	}   */
		
//  For Practice
    ArrayList<Integer> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
    System.out.println(list1);
    ArrayList<Integer> list2 = new ArrayList<Integer>(Arrays.asList(5,4,3,2,1));
    System.out.println(list2);
    for (int i=0;i<list1.size();i++)   {
    System.out.printf("%d : %d\n", list1.get(i), list2.get(i));	
    }
	
	}

}
