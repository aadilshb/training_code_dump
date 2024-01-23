package project_alpha;
import java.util.Scanner;
public class makes10 {
	static boolean makes10(int a,int b) {
		boolean c=false;
		if(a==10|b==10|(a+b)==10)
			c=true;
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean c=makes10(a,b);
		System.out.println("makes10("+a+","+b+")->"+c);
		sc.close();
		
	}
}
