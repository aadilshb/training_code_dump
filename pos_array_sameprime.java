package alpha;
import java.util.Scanner;
public class pos_array_sameprime {
	public static boolean Prime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
    }
	public static int digit(int a) {
		int n=0;
		while (a != 0) {
			a /= 10;
			n+=1;
	        }
		return n;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		int[] ar=new int[n];
		
		for(int i=0;i<n;i++) {
			ar[i]=sc.nextInt();
		}
		int cnt=0;
		
		int k=0;
		for(int i=0;i<n;i++)
			if(Prime(ar[i])) {
				cnt+=1;
			}
		int[] kk=new int[cnt];
		for(int i=0;i<n;i++)
			if(Prime(ar[i])) {
				kk[k]=ar[i];
				k+=1;
			}
		for(int i=0;i<cnt;i++)
			kk[i]=digit(kk[i]);
		boolean equalprime=false;
		for(int i=1;i<cnt;i++) {
			equalprime=true;
			if(kk[i]!=kk[i-1]) {
				equalprime=false;
			}
			
		}
		System.out.println(equalprime);
		sc.close();
	}
}
