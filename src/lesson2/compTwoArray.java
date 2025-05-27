package lesson2;

import java.util.Arrays;
import java.util.List;

public class compTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Best way to compare array is to convert this into ArrayList and do functions	
/*	String [] batsman1 = {"Rohit","Shubman","Virat","Shreyas","Jadeja","Rishab"};
	String [] batsman2 = {"Rohit","Shubman","Virat","Shreyas","Jadeja","Ashwin"};
	String [] batsman3 = {"Rohit","Shubman","Virat","Shreyas","Jadeja","Rishab"};   */
		
//  For Practice
	String [] batsman1 = {"Rohit","Shubman","Virat","Shreyas","Jadeja","Rishab"};
	String [] batsman2 = {"Rohit","Shubman","Virat","Shreyas","Jadeja","Ashwin"};
	String [] batsman3 = {"Rohit","Shubman","Virat","Shreyas","Jadeja","Rishab"};
	
/*	List<String> sb1 = Arrays.asList(batsman1);
	List<String> sb2 = Arrays.asList(batsman2);
	List<String> sb3 = Arrays.asList(batsman3);
//	ArrayList<String> sb1 = new ArrayList<String>(Arrays.asList(batsman1));   //Another way to convert array to array list
//	ArrayList<String> sb2 = new ArrayList<String>(Arrays.asList(batsman2));
	System.out.println(sb1.equals(sb2));   //Returns false
	System.out.println(sb1.equals(sb3));   //Returns true    */
	
//  For Practice
	List<String> sb1 = Arrays.asList(batsman1);
	List<String> sb2 = Arrays.asList(batsman2);
	List<String> sb3 = Arrays.asList(batsman3);
//	ArrayList<String> sb1 = new ArrayList<String>(Arrays.asList(batsman1));
//	ArrayList<String> sb2 = new ArrayList<String>(Arrays.asList(batsman2));
	System.out.println(sb1.equals(sb2));
	System.out.println(sb1.equals(sb3));
	}

}
