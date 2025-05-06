package lesson2;

import java.util.Arrays;
import java.util.stream.Stream;

public class addTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to add two Arrays, first convert into streams then add, direct addition not possible
/*	String [] batsman = {"Rohit","Shubman","Virat","Shreyas","Jadeja","Rishab"};
	String [] bowler = {"KL Rahul","Shami","Bumrah","Shiraj","Ashwin"};
	Stream<String> sBat = Arrays.stream(batsman);
	Stream<String> sBow = Arrays.stream(bowler);
	String [] fullTeam = Stream.concat(sBat, sBow).toArray(size->new String [size]);
	for (String s:fullTeam)   {
	System.out.println(s);	
	}   */
		
//  For Practice
	String [] batsman = {"Rohit","Shubman","Virat","Shreyas","Jadeja","Rishab"};
	String [] bowler = {"KL Rahul","Shami","Bumrah","Shiraj","Ashwin"};
	Stream<String> sBat = Arrays.stream(batsman);
	Stream<String> sBow = Arrays.stream(bowler);
	String [] fullTeam = Stream.concat(sBat, sBow).toArray(size->new String [size]);
	for (String s:fullTeam)   {
	System.out.println(s);	
	}
	
	}

}
