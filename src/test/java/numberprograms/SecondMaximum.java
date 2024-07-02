package numberprograms;

import java.util.Arrays;
import java.util.Scanner;
public class SecondMaximum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size  : ");
		int size=sc.nextInt();
		System.out.println("enter the values for array  :");
		int[] a=new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		int max=a[0];//34//345
		int secondMax=0;//32//34//65
		int thirdMax=0;
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				thirdMax=secondMax;
				secondMax=max;
				max=a[i];
			}
			else if(a[i]>secondMax&&a[i]<max)
			{
				thirdMax=secondMax;
				secondMax=a[i];
			}
			else if(a[i]>thirdMax&&a[i]<secondMax) {
				thirdMax=a[i];
			}
			
		}
		System.out.println("enter the array  a  "+Arrays.toString(a));
		System.err.println("second maximum value of the array  >>>>  "+secondMax);
		System.out.println(thirdMax);
		
	}

}
