package numberprograms;


import java.util.*;
//import java.util.Arrays;
public class CopyArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size :");
		int arr_size=sc.nextInt();
		int[] a=new int[arr_size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("array values of a  :"+Arrays.toString(a));
		int[] b=new int[arr_size];
		System.out.println("default values of b "+ Arrays.toString(b));
		for (int i = 0; i < a.length; i++) {
				b[i]=a[i];
			}
		System.out.println("copy values of updated values for b   >>>  "+Arrays.toString(b));
		}
	

	}
