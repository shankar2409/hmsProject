package StringPrograms;

import java.util.Scanner;
//FIND THE SEPARATE ELSEMENTS COUNTS LIKE HOW MANY VOWELS
//HOW MANY CONSONENTS
//HOW MANY NUMBERS
public class VowelString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter  the string :");
		String str=s.nextLine().toLowerCase();
		int vowel=0,consonents=0,numbers=0,special_characters=0,space_characters=0;
		for (int i = 0; i < str.length(); i++) {
			char ch=str.charAt(i);
			
//			if(ch>='a'&&ch<='z')
//			{
//				switch(ch)
////				{
////				case 'a','e','i','o','u','A','E','I','O','U':
//					vowel++;
//				default:
//					consonents++;
//				}
//			}
//			else if(ch>='0'&ch<='9')
//			{
//				numbers++;
//			}
//			else if(ch==' ')
//			{
//				space_characters++;
//			}
//			else
//			{
//				special_characters++;
//			}
		}
		System.out.println("vowel is present these many times"+vowel);
		System.out.println("consonent is present these many times"+consonents);
		System.out.println("special characters is present these many times"+special_characters);
		System.out.println("space characters is present these many times"+space_characters);
		System.out.println("numbers is present these many times"+numbers);
		
	}

}
