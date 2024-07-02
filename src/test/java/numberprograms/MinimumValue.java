package numberprograms;

import java.util.*;
public class MinimumValue {
//finf the minimum value of an array
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size  :");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values for array  >>> ");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("value for the Array  :  "+Arrays.toString(a));
		int min=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<min) {
				min=a[i];
			}
		}
		System.out.println("minimum value the array  :"+min);
	}

}
