package StringPrograms;

import java.util.Scanner;

public class SplitRevese {

	/*public static void main(String[] args) {
		String str="hello world";
		str=str.toLowerCase()+" ";
		String[] s=str.split(" ");
		System.out.println(s[0]);
		System.out.println(s[1]);
	
		for (int i = 0; i < s.length; i++) {
			String str1=s[i];
			String reverse="";
			for (int j =str1.length()-1;j>=0 ;j--) {
				char ch=str1.charAt(j); 
				reverse+=ch;
			}
			System.out.print(reverse+" ");
			
		}*/
		
		
		
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.print("enter the String  :");
			String s=sc.nextLine().toLowerCase().trim();
			s+=" ";
			String rev="";
			String s1="";
			for(int i=0;i<=s.length()-1;i++)
			{
				char ch=s.charAt(i);
				if(ch!=' ') {
					s1+=ch;
				}
				else
				{
					for(int j=s1.length()-1;j>=0;j--)
					{
						rev=rev+s1.charAt(j);
					}
					rev=rev+ch;
					s1="";
				}
					
			}
			System.out.print(rev.trim());
		}
		
		
		
		
		
		
	}

