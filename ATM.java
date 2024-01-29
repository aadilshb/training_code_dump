package project_alpha;
import java.util.*;
public class ATM {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int pin=1234;
		float balance=0;
		System.out.println("Enter your PIN");
		int n=sc.nextInt();
		if(String.valueOf(n).length()>4||String.valueOf(n).length()<4)
			System.out.println("Invalid PIN\nMust be 4 digit");
		else {
			int ch=0;
			if(n==pin) {
				do {
					System.out.println("Welcome User!");
					System.out.println("1. Deposit\n2. Withdraw\n3. Balance Enquiry\n4. PIN Change\n5. Exit\nEnter your Choice");
					ch=sc.nextInt();
					switch(ch) {
						case 1:System.out.println("Enter the amount to be deposited");
						float amt=sc.nextFloat();
						balance+=amt;
						System.out.println("Your current available balance is :"+balance);
						break;
						case 3:System.out.println("Your current available balance is :"+balance);
						break;
						case 2:System.out.println("Enter the amount to withdraw");
						float am=sc.nextFloat();
						balance-=am;
						System.out.println("Your current available balance is :"+balance);
						break;
						case 4:System.out.println("Enter your current PIN");
						int p=sc.nextInt();
						if(p==pin) {
							System.out.println("Enter new PIN");
							int i=sc.nextInt();
							if(String.valueOf(i).length()>4||String.valueOf(i).length()<4)
								System.out.println("Invalid PIN\nMust be 4 digit");
							else {
								pin=i;
								System.out.println("PIN Changed!");
							}		
						}
						else
							System.out.println("Wrong PIN Entered");
						break;
						case 5:System.out.println("Thank You for Banking With Us!");
					}
				}while(ch!=5);
			}
			else {
				System.out.println("Entered PIN is wrong");
			}
		}
		sc.close();
	}
}
