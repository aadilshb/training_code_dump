package project_alpha;
import java.util.Scanner;
public class prime_array_1st {
	public static boolean Prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }

	public static void main(String args[]) {
		int n,j=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		n=sc.nextInt();
		int[] a=new int[n];
		int[] b=new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(int i=0;i<n;i++)
			if(Prime(a[i])) {
				b[j]=a[i];
				j=j+1;
			}
		for(int i=0;i<n;i++)
			if(!Prime(a[i])) {
				b[j]=a[i];
				j=j+1;
			}
		for(int i=0;i<n;i++)
			System.out.print(b[i]+"\t");
		sc.close();
		}
}