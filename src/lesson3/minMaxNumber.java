package lesson3;

public class minMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//  How to find minimum and maximum number from three positive numbers
/*	int a=10,b=20,c=30;
	int mx = maxNum(a, b, c);	
	System.out.println(mx);
	int mn = minNum(10, 20, 30);
	System.out.println(mn);
	
	}

	public static int maxNum(int a, int b, int c)   {
	int max=0;
	while (a>0 || b>0 || c>0)   {
	a--;
	b--;
	c--;
	max++;
	}
	return max;
	}
	
	public static int minNum(int a, int b, int c)   {
	int min=0;
	while (a>0 && b>0 && c>0)   {
	a--;
	b--;
	c--;
	min++;
	}
	return min;   */
		
//  For Practice
	int a=10;int b=20;int c=30;
	int mxNum = maxNum(a, b, c);
	System.out.println(mxNum);
	int mnNum = minNum(a, b, c);
	System.out.println(mnNum);
	
	}

	public static int maxNum(int a, int b, int c)   {
	int max=0;
	while (a>0 || b>0 || c>0)   {
	a--;
	b--;
	c--;
	max++;
	}
	return max;
	}

    public static int minNum(int a, int b, int c)   {
    int min=0;	
    while (a>0 && b>0 && c>0)   {
    a--;
    b--;
    c--;
    min++;
    }
    return min;
    }

}
    