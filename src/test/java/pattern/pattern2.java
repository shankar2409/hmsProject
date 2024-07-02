package pattern;

import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the number :");
		int n=s.nextInt();
		for(int i=0;i<=2*n-1;i++)
		{
			for(int j=0;j<=n;j++)
			{
				if ((i+j>=n+1)&&(i-j<=n-1)) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
