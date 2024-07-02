package numberprograms;

import java.util.Scanner;
public class SumOfTwoElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Array Size  :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values for array  :");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		boolean flag=false;
		System.err.print("enter the target  :");
		int target=sc.nextInt();//70
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if((a[i]+a[j])==target)
				{
					flag=true;
					System.out.println("( " +j+" - "+a[j]+"  &  "+i+" - "+a[i]+" ) ");
				}
			}
			}
		if (flag==false) {
			System.out.println("no elements not fount for adding two elements");
		}
	}

}
