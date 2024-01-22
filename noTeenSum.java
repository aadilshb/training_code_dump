package project_unknown;
import java.util.*;
public class noTeenSum {
	static int a,b,c;
	static int fixTeen(int n) {
		int m=0;
		if(13<=n&&n<=19) {
			if(n==15||n==16){
				m=n;
			}
			else
				m=0;
		}
		else
			m=n;
		return m;
	}
	static void noTeenSum(int x,int y,int z) {
		x=fixTeen(x);
		y=fixTeen(y);
		z=fixTeen(z);
		int sum=x+y+z;
		System.out.println("noTeenSum("+a+","+b+","+c+")="+sum);
	}
	public static void main(String args[]) {
		System.out.println("Enter the values of a,b and c");
		Scanner sc=new Scanner (System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		noTeenSum(a,b,c);
	}
}
