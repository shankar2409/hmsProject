package pattern;

import java.util.Scanner;

public class pattern3 {
	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		System.out.println("enter the number");
		int n = s.nextInt();
		for (int i = 0; i <= n; i++) {
			int p = n + 1;
			for (int j = 0; j <= 2 * n - 1; j++) {
				if ((i + j >= n + 1) && (j - i <= n - 1) && (i + j == p)) {
					System.out.print("* ");
					p += 2;
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}