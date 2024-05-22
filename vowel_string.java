package alpha;
import java.util.*;
public class vowel_string {
	public static boolean vowel(char a) {
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
			return true;
		return false;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n=sc.nextInt();
		sc.nextLine();
		String[] s=new String[n];
		int[] count=new int[n];
		System.out.println("Enter "+n+" Strings");
		for(int i=0;i<n;i++) {
			s[i]=sc.nextLine();
		}
		for(int i=0;i<n;i++) {
			int cnt=0;
			for(int j=0;j<s[i].length();j++) {
				char a=s[i].charAt(j);
				if(vowel(a))
					cnt++;
			}
			count[i]=cnt;
		}
		int max=0;
		for(int i=0;i<n;i++)
			if(count[i]>max)
				max=count[i];
		System.out.println("The String with max vowel is: ");
		for(int i=0;i<n;i++)
			if(max==count[i])
				System.out.println(s[i]);
		
		sc.close();
	}
}
