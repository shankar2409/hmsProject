package javaPractice;

import java.util.Arrays;
import java.util.LinkedList;

public class reverseString {
	public static void main(String[] args) {
		String s = "Shangkar";
		String res = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			char ch = s.charAt(i);
			res += ch;
		}
		System.out.println(res);
		res = "";
		for (int i = 0; i < s.length(); i++) {
			res = s.charAt(i) + res;
		}

		System.out.println(res);
		res = "";
		for (char st : s.toCharArray()) {
			res = st + res;
		}

		System.out.println(res);
		res = "";
		LinkedList<Character> ch = new LinkedList<Character>();
		for (Character r : s.toCharArray()) {
			ch.add(r);
		}
		for (int i = ch.size() - 1; i >= 0; i--) {
			res += ch.get(i);
		}
		System.out.println(res);
		char[] charArray = s.toCharArray();
		int left = 0;
		int right = s.length() - 1;
		while (left < right) {
			// Swap characters
			char temp = charArray[left];
			charArray[left] = charArray[right];
			charArray[right] = temp;
			// Move pointers
			left++;
			right--;
		}
		System.out.println(Arrays.toString(charArray));
		int n = 5;
		for (int i = 1, j = 1; i <= n;) {
			if (i+j<=n+1) {
				System.out.print("* ");
			} else {
				System.out.print("  ");
				
			}
			if (j==n) {
				j=1;
				System.out.println();
				i++;
			}else {
				j++;	
			}
			

		}
	}

}
