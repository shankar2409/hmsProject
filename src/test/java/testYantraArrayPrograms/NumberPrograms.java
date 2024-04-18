package testYantraArrayPrograms;

import java.util.Arrays;

import org.testng.annotations.Test;

public class NumberPrograms {
	@Test
	public void factorial() {
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact *= i;
		}
		System.out.println(fact);
	}

	@Test
	public void fibnoociSeries() {
		int range = 10;
		int a = 0, b = 1;
		for (int i = 1; i <= range; i++) {
			System.out.println(a);
			int c = a + b;
			a = b;
			b = c;
		}
	}

	@Test
	public void primeNumber() {
		int range = 30;
		for (int i = 1; i <= range; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					count++;
				}
			}
			if (count == 2) {
				System.out.println(i + " ");
			}
		}
	}

	@Test
	public void primeNumbersInArray() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9,13 };
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 1; j <= a[i]; j++) {
				if (a[i] % j == 0) {   
					count++;
				}
			}
			if (count == 2) {
				System.out.println(a[i] + " ");
			}
		}
	}

	@Test
	public void missingNumbersinarray() {
		int[] a = { 1, 3, 4, 6, 8, 9 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		for (int i = 0; i < max; i++) {
			boolean flag = true;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					flag = false;
					break;
				}

			}
			if (flag) {
				System.out.print(i + " ");
			}
		}
	}

	@Test
	private void primeParticularNum() {
		int num = 7;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println("it is a prime");
		} else {
			System.out.println("it is not a prime");
		}
	}

	@Test
	public void anagram() {
		String s = "car";
		String s1 = "arc";
		char[] s2 = s.toCharArray();
		char[] s3 = s1.toCharArray();
		Arrays.sort(s3);
		Arrays.sort(s2);
		System.out.println(Arrays.toString(s2));
		System.out.println(Arrays.toString(s3));
		boolean flag = true;
		if (s2.length == s3.length) {
			for (int i = 0; i < s3.length; i++) {
				if (s2[i] != s3[i]) {
					flag = false;
					break;
				}
			}
		} else {
			flag = false;
		}
		if (flag) {
			System.out.println("it is a anangram");
		} else {
			System.out.println("it is not a anagram");
		}
	}

	@Test
	public void IntegerPalindrome() {
		int s=1212;
		int s1 = s;
		int sum=0;
		while (s1!=0) {
			int d=s1%10;
			sum=(sum*10)+d;
			s1/=10;
		}
		if (s==sum) {
			System.out.println("it is a number palindrome");
		} else {
			System.out.println("it is not a number palindrome");
		}
	}
}
