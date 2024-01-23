package project_alpha;
import java.util.*;
public class Even {
	static boolean Even(int a){
		boolean c=false;
		if(a%2==0)
			c=true;
		return c;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value for n");
		int n=sc.nextInt();
		boolean s=Even(n);
		System.out.println("Even("+n+")->"+s);
		sc.close();
		
	}
}
