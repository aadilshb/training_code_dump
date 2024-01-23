package project_alpha;
import java.util.Scanner;
public class sumDouble {
	static int sumDouble(int a,int b) {
		int d=0;
		if(a==b)
			d=2*(a+b);
		else
			d=a+b;
		return d;
	}
	public static void main(String args[]) {
		System.out.println("Enter values of a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int s=sumDouble(a,b);
		System.out.println("sumDouble("+a+","+b+")->"+s);
		sc.close();
	}
}
