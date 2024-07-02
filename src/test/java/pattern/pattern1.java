package pattern;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ente the pattern size");
		int num=s.nextInt();
		for(int i=0;i<=num;i++)
		{
			for(int j=0;j<=2*num-1;j++)
			{
				if((i+j>=num+1)&&(j-i<=num-1))
				{
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
