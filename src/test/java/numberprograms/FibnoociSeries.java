package numberprograms;

import java.util.*;
public class FibnoociSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the array size  :");
		int size=s.nextInt();
		int[] array=new int[size];
		int a=0,b=1,c=0;
		for (int i = 0; i < array.length; i++) {
			c=a+b;
			a=b;
			b=c;
			array[i]=a;
		}
		System.out.println(Arrays.toString(array));
	}

}
