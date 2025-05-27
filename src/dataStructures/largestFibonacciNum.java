package dataStructures;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class largestFibonacciNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Problem Description - Given a number N, you have to find the largest Fibonacci number which is less than N.
//	Input Format:
//	First line contains an integer T - Number of test cases.
//	Next T lines each have a given number N
//	Output Format:
//	Print the answer for each test case in a separate line.
//	Constraints:
//  T <= 10^4
//	0 < N <= 10^9	
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number for Test Case(T):");
    int T = sc.nextInt();
    List<Integer> fib = new ArrayList<>();
    fib.add(0);
    fib.add(1);
        
    while (true) {
    int next = fib.get(fib.size() - 1) + fib.get(fib.size() - 2);
    if (next >= 1000000000)
    break;
    fib.add(next);
    }
    
    for (int i = 1; i <= T; i++) {
    System.out.print("Enter number N for test case " + i + ": ");
    int N = sc.nextInt();
    int ans = 0;
            
    for (int j = 0; j < fib.size(); j++) {
    if (fib.get(j) < N) {
    ans = fib.get(j);
    }
    else {
    break;
    }
    }
    System.out.println(ans);
    }
    sc.close();
	
	}

}
