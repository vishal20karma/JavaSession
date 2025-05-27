package lesson1;

import java.util.ArrayList;

public class count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	ArrayList<String> a = new ArrayList<String>();
	a.add("Vishal");
	a.add("Vivek");
	a.add("Ranjan");
	a.add("Suman");
	a.add("Sushant");
	int k=0;
	for (int i=0;i<a.size();i++)   {
	String names = a.get(i);	
	if (names.startsWith("S"))   {
	System.out.println(names);	
	k++;
	}
	}
	System.out.println("Size of S prefix names - "+k);
	System.out.println("ArrayList size - "+a.size());   */ //Getting size of ArrayList
	
//  For Practice
	ArrayList<String> a = new ArrayList<String>();
    a.add("Vishal");
    a.add("Vivek");
    a.add("Ranjan");
    a.add("Suman");
    a.add("Sushant");
    int k=0;
    for (int i=0;i<a.size();i++)   {
    String names = a.get(i);	
    if (names.startsWith("S"))   {
    System.out.println(names);	
    k++;
    }
    }
    System.out.println("Size of S prefix names -"+k);
    System.out.println("ArrayList size -"+a.size());
	
	}

}