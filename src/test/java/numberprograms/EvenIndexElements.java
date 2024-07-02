package numberprograms;


import java.util.Scanner;
public class EvenIndexElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the array size :");
		int arr_size=sc.nextInt();
		int[] a=new int[arr_size];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				System.out.print(a[i]+"  ");	
			}
		}

	}

}
