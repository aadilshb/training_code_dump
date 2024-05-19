package project_alpha;
import java.util.*;
public class prime_check_sum_prime {
	public static boolean Prime(int n) {
		if (n <= 1)
            return false;
        for (int i = 2; i < n; i++)
            if (n % i == 0)
                return false;
 
        return true;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		if(Prime(n)) {
			while (n != 0) {
				sum += n % 10;
				n /= 10;
		        }
			if(Prime(sum)) {
				System.out.println(sum);
				System.out.println("1");
			}
			else
				System.out.println("0");
		}
		else
			System.out.println("0");
	}
}
