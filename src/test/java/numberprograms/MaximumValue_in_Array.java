package numberprograms;

import java.util.*;
public class MaximumValue_in_Array {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size  : ");
		int size=sc.nextInt();
		System.out.println("enter the values for array  :");
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("print the array  a  "+Arrays.toString(a));
		System.out.println("maximum value of the array  >>>>  "+max);
		
	}

}
