package pattern;

import java.util.Scanner;

public class pattern5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number :");
		int n=s.nextInt();
		for(int i=0;i<=n;i++)
		{
			int num=1;
			for(int j=0;j<=2*n-1;j++)
			{
				if(i+j>=n+1&&j-i<=n-1)
				{
					System.out.print(num +" ");
					if(j<n)
					{
						num++;
					}
					else {
						num--;
					}
				}
				else {
					System.out.print("  ");
				} 
				
			}
			System.out.println();
		}
	}
}
