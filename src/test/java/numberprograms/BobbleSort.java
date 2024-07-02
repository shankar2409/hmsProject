package numberprograms;

import java.util.*;
public class BobbleSort {
	 static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.print("enter the array size  :");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values for array  ");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println(" value of the array  >>>> "+Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length-1; j++) {
				
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
			}
		}
		TreeSet<Integer> ts=new TreeSet<Integer>() ;
		ts.addAll(ts);
		System.out.println("final result of an array >>>"+Arrays.toString(a));
	}

}
