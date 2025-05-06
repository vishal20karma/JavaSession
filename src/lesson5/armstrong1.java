package lesson5;

public class armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*	int arm = 153;   //Any number whose cube sum is exactly as the same number is called Armstrong number
	armStrong(arm);
	
	}

	public static void armStrong(int arm)   {
	int temp=arm;
	int sum=0;
	while (temp!=0)   {
	int r = temp%10;
	sum=sum+r*r*r;
	temp=temp/10;
	}
	if (sum==arm)   {
	System.out.println(arm+" -  is an Armstrong number");	
	}
	else   {
	System.out.println(arm+" - is NOT an Armstrong number");	
	}   */
		
//  For Practice
	int arm=153;
	armStrong(arm);
	
	}

    public static void armStrong(int arm)   {
    int temp=arm;
    int sum=0;
    while (temp!=0)   {
    int r = temp%10;	
    sum=sum+r*r*r;
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
