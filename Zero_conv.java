package project_alpha;
import java.util.*;
public class Zero_conv {
	static void pos(float n) {
		for(int i=(int)n;i>=0;i--) {
			System.out.print(i+"\t");
		}
	}
	static void neg(float n) {
		float x=Math.abs(n);
		for(int i=(int)x;i>0;i--)
			System.out.print("-"+i+"\t");
			System.out.println("0");
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of n");
		float n=sc.nextFloat();
		if(n<0) 
			neg(n);
			
		else if(n>0) 
			pos(n);
			
		else
			System.out.println("already Zero");
		sc.close();
	}
}
