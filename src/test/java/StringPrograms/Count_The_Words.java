package StringPrograms;

//import java.util.Scanner;

public class Count_The_Words {

	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("enter the string to count words  :");
//		String str=sc.nextLine().toLowerCase();
//		str+=" ";
//		String s1="";
//		int count=0;
//		for(int i=0;i<=str.length()-1;i++)
//		{
//			char ch=str.charAt(i);
//			if (ch!=' ') {
//				s1+=ch;
//			} else  if(s1!=""){
//				count++;
//				s1="";
//			}
//			
//		}
//		System.out.println(count);

		
		
		
		
		
		String s="tomorrow our programming session will be end";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if((i==0&&ch!=' ')||ch!=' '&&s.charAt(i-1)==' ')
			{
				count++;
			}
		}
		System.out.println("total number of the words present in a String  : "+count);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
		
}
