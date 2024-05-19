package project_alpha;
import java.util.*;
public class count_special {
	public static boolean Special(char a) {
		if(!Character.isDigit(a)&&!Character.isLetter(a)&&!Character.isWhitespace(a)) {
			return true;
		}
		return false;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Enter a string");
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char a=str.charAt(i);
			if(Special(a))
				count+=1;
		}
		System.out.println("Special characters: "+count);
		sc.close();
	}
}
