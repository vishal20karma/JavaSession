package lesson2;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to check if any number is binary	
/*	int num = 1010110;
	isBinaryNum(num);
		
	}

	public static void isBinaryNum(int num)   {
	boolean isBinary=true;	
	int copyNum=num;   //num has been copied to another integer, as num is being operative multiple times	
	while (copyNum!=0)   {
	int rem = copyNum%10;	
	if (rem>1)   {
	isBinary=false;
	break;
	}
	else   {
	copyNum=copyNum/10;	
	}
	}
	if (isBinary)   {
	System.out.println(num+" - is a Binary number");	
	}
	else   {
	System.out.println(num+" - is NOT a Binary number");	
	}   */
	
//  For Practice
	int num = 10101101;
	isBinaryNum(num);
	
	}

    public static void isBinaryNum(int num)   {
    int copyNum=num;
    boolean isBinary=true;
    while (copyNum!=0)   {
    int rem = copyNum%10;	
    if (rem>1)   {
    isBinary=false;
    break;
    }
    else {
    copyNum=copyNum/10;	
    }
    }
    if (isBinary)   {
    System.out.println(num+" - is a Binary number");	
    }
    else {
    System.out.println(num+" - is NOT a Binary number");	
    }
    
    }

}
