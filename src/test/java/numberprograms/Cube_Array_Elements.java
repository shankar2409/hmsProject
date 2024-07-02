package numberprograms;

import java.util.Arrays;
import java.util.Scanner;
public class Cube_Array_Elements {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the Size  :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.print("enter the values ");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		//	System.out.println(Arrays.toString(a);
		}
		int[] cube=new int[size];
		for(int j=0;j<a.length;j++)
		{
			 cube[j]=a[j]*a[j]*a[j];
			
		}
		System.out.println("   :"+Arrays.toString(cube));
	}

}
