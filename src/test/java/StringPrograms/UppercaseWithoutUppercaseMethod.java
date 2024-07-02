package StringPrograms;
import java.util.*;

public class UppercaseWithoutUppercaseMethod {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.nextLine();
		String temp="";
		for (int i = 0; i < str.length();i++) {
			int a=str.charAt(i);
			char a1=str.charAt(i);
			char ch=' '; 
			if(a>='A'&&a<='Z')
			{
				ch=(char)(a+32);
				temp+=ch;
			}
			else {
				temp+=str.charAt(i);
			}
		}
		System.out.println(temp);
	}

}
