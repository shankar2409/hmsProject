package numberprograms;


import java.util.*;
public class SecondMinValue {
	
	public static void main(String[] args) {
//		Scanner s=new Scanner(System.in);
//		System.out.print("enter the Array size :");
//		int size=s.nextInt();
//		int[] a=new int[size];
//		System.out.println("enter  the values of an array :");
//		for (int i = 0; i < a.length; i++) {
//			a[i]=s.nextInt();
//		}
		int[] a= {1,2,5,7,9,10,7,0,0,1,-1};
//		System.out.println("value of the array  "+Arrays.toString(a));
		int max=a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i]>max) {
				max=a[i];
			}
		}
		
		System.out.println("max value  :"+max);
		
		int min=max;
		int secondMin=min;
		for (int i = 0; i < a.length; i++) {
			if(a[i]<min){
				secondMin=min;
				min=a[i];
			} else if(a[i]<secondMin&&a[i]!=min){
				secondMin=a[i];
			}
		}
		System.out.println(min+"min value");
		System.out.println(secondMin+"Second min");
		
	}

}
