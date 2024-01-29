package project_alpha;
import java.util.*;
public class Stringtimes {
	static void stringTimes(String s,int a) {
		String st=new String();
		for(int i=0;i<a;i++)
			st+=s;
		System.out.println(st);
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.nextLine();
		System.out.println("Enter a non negative number");
		int n=sc.nextInt();
		stringTimes(s,n);
		sc.close();
	}
}
