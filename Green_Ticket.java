package project_unknown;
import java.util.*;
public class Green_Ticket {
	static void greenTicket(int a,int b, int c) {
		int[] ar=new int[] {a,b,c};
		int d=0;
		for(int i=0;i<3;i++) {
			if(ar[0]==ar[1]&&ar[1]==ar[2]) {
				d=20;
				break;
			}
			else if(ar[0]==ar[1]||ar[1]==ar[2]||ar[0]==ar[2]) {
				d=10;
				break;
			}
			else
				d=0;
		}
		System.out.println("greenTicket("+a+","+b+","+c+")="+d);
	}
	public static void main(String args[]) {
		System.out.println("Enter the values of a,b and c");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		greenTicket(a,b,c);
	}
}
