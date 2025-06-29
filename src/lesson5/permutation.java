package lesson5;

public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String input = "act";
    System.out.println("All permutations of "+input+": ");
    generatePermutations("", input);
    
	}

// Recursive method to generate permutations
    public static void generatePermutations(String prefix, String remaining) {
    int n = remaining.length();
    if (n == 0) {
    System.out.println(prefix);  // Base case: print the permutation
    }
    else {
    for (int i = 0; i < n; i++) {
//  Fix the ith character and find permutations of the remaining string
    generatePermutations(prefix + remaining.charAt(i),
        remaining.substring(0, i) + remaining.substring(i + 1));
//  System.out.println("Pr-"+prefix + remaining.charAt(i));
//  System.out.println("Rm-"+remaining.substring(0, i) + remaining.substring(i + 1));
    }
    }
			
	}

}
