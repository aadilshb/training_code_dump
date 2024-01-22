package project_unknown;
import java.util.*;
public class lucky_sum {
	static void luckySum(int a,int b,int c){
		int sum=0;
		int[] arr=new int[] {a,b,c};
		for(int i=0;i<3;i++) {
			if(arr[i]==13)
				break;
			else
				sum+=arr[i];
		}
		System.out.println("luckySum("+a+","+b+","+c+")="+sum);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b and c");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		luckySum(a,b,c);
	}
}
