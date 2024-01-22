package project_unknown;
import java.util.*;
public class password
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter new password");
		String pwd=sc.nextLine();
		boolean sp_char=false,up_let=false,low_let=false,digit=false,space=false;
		for(int i=0;i<pwd.length();i++) {	
			if(!Character.isDigit(pwd.charAt(i))&&!Character.isWhitespace(pwd.charAt(i))&&!Character.isLetter(pwd.charAt(i))) {
				sp_char=true;
			}
			if(Character.isLowerCase(pwd.charAt(i)))
					low_let=true;
			if(Character.isUpperCase(pwd.charAt(i)))
					up_let=true;
			if(Character.isDigit(pwd.charAt(i)))
				digit=true;
			if(Character.isWhitespace(pwd.charAt(i)))
				space=true;
			
		}
		if(pwd.length()<8||sp_char==false||low_let==false||up_let==false||digit==false||space==true) {
			System.out.println("0");
		}
		else
			System.out.println("1");
	}
}

