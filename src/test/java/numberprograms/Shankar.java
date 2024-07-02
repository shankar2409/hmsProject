package numberprograms;

import java.util.Scanner;
public class Shankar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print(" enter the Size  :");
		int size=sc.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		System.out.print("enter the target value  :");
		int target=sc.nextInt();
		for (int i = 0; i < a.length; i++) {
			if (target==a[i]) {
				flag=true;
				System.out.println("target is found in "+i+" index");
				break;
			}
			
		}
		if (flag==false) {
			System.out.println("target is not  found ");
		}
	}
}
