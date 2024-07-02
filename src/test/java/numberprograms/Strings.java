package numberprograms;

import java.security.DrbgParameters.NextBytes;
import java.util.Arrays;
import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
//		String s="hiiieveryoneguys";
		/*
		String s="madam";
		String s1="hiiibuddy";
		String res="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			res+=s1.charAt(i);
		}
		System.out.println(res);
		if(res.equals(s1)) {
			System.out.println("it is a palindrome String");
		}
		else {
			System.out.println("it is not a palindrome number");
		}*/
		
		/*String s="hiii buddy";
		String res="";
		char[] c=s.toCharArray();
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			int count=1;
			if(res.indexOf(ch)==-1) {
				for(int j=i+1;j<s.length();j++)
				{
					 char ch1=s.charAt(j);
					 if(ch==ch1) {
						 count++;
					 }
				}
				if(count>=2) {
					System.out.println(ch);
				}
				}
		}*/
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the String  :");
//		String s=sc.next().toLowerCase(),s1=sc.next().toLowerCase();
		String s="heart".toLowerCase(),s1="earth".toLowerCase();
		boolean flag=true;
		if(s.length()==s1.length()) {
			char[] ch=s.toCharArray();
			char[] ch1=s1.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
//			System.out.println(ch  + "     "+ch1);
			for(int i=0;i<ch.length;i++) {
				if(ch[i]!=ch1[i]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				System.out.println("it is a anagram number");
				
			}
			else {
				System.out.println("it is not a anagram");
			}
			
		}
		else {
			System.out.println("it is not a anagram");
		}
	}
}
