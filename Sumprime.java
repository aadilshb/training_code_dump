package project_alpha;
import java.util.*;
public class Sumprime {
	static boolean Prime(int a) {
		boolean s=true;
		for(int i=2;i<=a/2;i++)
			if(a%i==0)
				s=false;
		return s;
	}
	static boolean SumPrime(int a, int b) {
		boolean c=false;
		if(Prime(a)==true&&Prime(b)==true) {
			int sum=a+b;
			c=Prime(sum);
		}
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean c=SumPrime(a,b);
		System.out.println(c);
		sc.close();
	}
}
