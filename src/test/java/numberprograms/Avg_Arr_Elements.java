package numberprograms;

import java.util.Scanner;
public class Avg_Arr_Elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size  :");
		int size=sc.nextInt();
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		System.out.println(sum/a.length);

	}

}
