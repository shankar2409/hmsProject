package numberprograms;

import java.util.*;
public class DistinctElements {
// remove all the duplicated values
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size  :");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values for array  :");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("values of the array  :"+Arrays.toString(a));
		//int count1=0;
		//int temp=0;
		for (int i = 0; i < a.length; i++) {
			int count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]) {
					count++;
				}
			}
			if (count==1) {
				//count1++;
				System.out.println(a[i]);
			}
		}
//		int[] b=new int[count1]; 
//		for (int i = 0; i < a.length; i++) {
//			int count=0;
//			for (int j = 0; j < a.length; j++) {
//				if (a[i]==a[j]) {
//					count++;
//				}
//			}
//			if (count==1) {
//				b[temp++]=a[i];
//				
//			}
//		}
//
//		System.out.println(Arrays.toString(b));
//		System.out.println(Arrays.toString(a));
		}
}