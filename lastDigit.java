package project_alpha;
import java.util.*;
public class lastDigit {
	static boolean lastDigit(int a,int b){
		boolean c=false;
		if(a%10==b%10)
			c=true;;
		return c;
	}
	public static void main(String args[]) {
		System.out.println("Enter value of a and b");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean c=lastDigit(a,b);
		System.out.println("lastDigit("+a+","+b+")->"+c);
		sc.close();
	}

}
