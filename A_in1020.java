package project_alpha;
import java.util.*;
public class A_in1020 {
	static boolean in1020(int a,int b) {
		boolean c=false;
		if((10<=a&&a<=20)|(10<=b&&b<=20))
			c=true;
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean s=in1020(a,b);
		System.out.println("in1020("+a+","+b+")->"+s);
		sc.close();
	}
}
