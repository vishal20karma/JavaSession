package lesson5;

public class armstrong2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	int arm = 15;
	int dg = Integer.toString(arm).length();
	System.out.println("Inter digit - "+dg);
	armStr(arm, dg);
	
	}

    public static void armStr(int arm, int dg)   {
    int temp=arm;
    int sum=0;
    while (temp!=0)   {
    int r = temp%10;	
    sum = (int) (sum + Math.pow(r, dg));
    temp=temp/10;
    }
    if (sum==arm)   {
    System.out.println(arm+" - is an Armstrong number");	
    }
    else   {
    System.out.println(arm+" - is NOT an Armstrong number");	
    }   */
		
//  For Practice
	int arm=153;
	int dgt = Integer.toString(arm).length();
	armStr(arm, dgt);
	
	}

    public static void armStr(int arm, int dgt)   {
    int temp=arm;
    int sum=0;
    while (temp!=0)   {
    int r = temp%10;	
    sum=(int) (sum+Math.pow(r, dgt));
    temp=temp/10;
    }
    if (sum==arm)   {
    System.out.println(arm+" - is an Armstrong number");	
    }
    else {
    System.out.println(arm+" - is NOT an Armstrong number");	
    }
    }
    
}

