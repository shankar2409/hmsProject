package StringPrograms;
//
//import java.util.Scanner;
//
//public class oddorEven {
//	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.println("enter the number :");
//		int num=s.nextInt();
//		
//		while (num>0) {
//			if(num%2==0)
//			{
//				System.out.println(num+"is a Even Number");
//				break;
//			}
//			else {
//				System.out.println(num+"is a Odd Number");
//				break;
//			}
//		}
//	}
//}
 abstract class Bank{
	abstract public void deposit();
}
 class SbiBank extends Bank{
	 @Override
	 public void deposit()
	 {
		 System.out.println(" sbiBank peoples, you can deposit for your money");
	 }
 }
 class canaraBank extends Bank{
	 @Override
	 public void deposit()
	 {
		 System.out.println("canara Bank, you can do deposit");
	 }
 }