package numberprograms;

import java.util.*;
public class DuplcatedValuesPrint {
//WAJP TO PRINT DUPLICATED IN AN ARRAY IN SINGLE TIME
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size  :");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values of array  :");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			if (count==2) {
				System.out.println(a[i]);
			}
		}
	}

}
