package StringPrograms;

import java.util.Scanner;
//Occurance of the char palindrome String
public class ReverseString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the String name  :");
		String str=s.nextLine();//shankar
//		String temp="";
//		for (int i = str.length()-1;i>=0;i--) {
//			char ch=str.charAt(i);
//			temp+=ch;
//		}
//		if(temp.equals(str))
//		{
//			System.out.println(str+"  >>>>> is palindrome String");
//		}
//		else {
//			System.out.println(str+"  >>>>> is not palindrome String");
//		}
		int temp=0,temp1=str.length()-1;
		boolean flag=true;
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(temp)==(str.charAt(temp1)))
			{
				temp++;
				temp1--;
			}
			else {
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println(str+"  is  a palindrome String");
		}
		else {
			System.out.println(str+"  is  not a palindrome String");
		}
		
	}

}
