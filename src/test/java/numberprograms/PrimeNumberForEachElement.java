package numberprograms;

import java.util.*;
public class PrimeNumberForEachElement {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the Array size  :");
		int size=s.nextInt();
		int[] a=new int[size];
		System.out.println("enter the values for array 1  :");
		for (int i = 0; i < a.length; i++) {
			a[i]=s.nextInt();
		}
		System.out.println("values of array 1  :"+Arrays.toString(a));
		for (int i = 0; i < a.length; i++) {
			int value=a[i];
			int count=0;
//			boolean flag=false;
			for(int j=1;j<=value;j++)
			{
				if (value%j==0) {
					count++;
				}
			}
			//System.out.println(count);
			if(count==2)
			{
				System.out.println(a[i]+"is a prime number ");
			}
			else
			{
				System.out.println(a[i]+"is not prime number");
			}
		}
	}

}
