package lesson4;

public class longNumberWWSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  Result of long number Without suffix L
	long l1 = 1000*60*60*24*365;
	System.out.println(l1);    //Calculation result should be '31,536,000,000' but its giving '1471228928'
//  long number without suffix L has limit of 32 bit length only therefore not returning correct result
		
//  Result of long number With suffix L
	long l2 = 1000*60*60*24*365L;   //Suffix L has been used 
	System.out.println(l2);   // It gives correct calculation - '31,536,000,000', because long number with suffix L has 36 bit length	
	
	}

}
