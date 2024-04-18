package testYantraArrayPrograms;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import org.testng.annotations.Test;

public class StringPrograms {
	@Test
	public void ReverseString() {
		String s = "raknahs";
		char[] s1 = s.toCharArray();
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i]);
		}
		System.out.println();
		// 2Nd approach
		String a = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			a += s.charAt(i);
		}
		System.out.println(a);
		// 3rd approach
		StringBuilder se = new StringBuilder(s);
		System.out.println(se.reverse());
		System.out.println(new StringBuffer(se).reverse());

	}

	@SuppressWarnings("deprecation")
	@Test
	public void palindromeNumber() throws Throwable {
		String s = "dad";
		String s1 = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			s1 += s.charAt(i);
		}
		if (s.equals(s1)) {
			System.out.println(s1 + "   -->it is a palindrome");
		} else {
			System.out.println(s1 + "   -->it is not a palindrome");
		}
	}

	@Test
	public void noOfCharacters() {
		String s = "Bang a lore";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);
	}

	@Test
	public void occuranceOfCharacters() {
		String s = "Tester".toLowerCase();
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (i > j) {
						break;
					}
					count++;
				}

			}
			if (count > 0) {
				System.out.println(s.charAt(i) + "   present in times  >" + count);
			}
		}

	}

	@Test
	public void duplicatesOfCharacters() {
		String s = "Tester".toLowerCase();
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (i > j) {
						break;
					}
					count++;
				}

			}
			if (count > 1) {
				System.out.println(s.charAt(i) + "   present in times  >" + count);
			}
		}
	}

	@Test
	public void removeDuplicates() {
		String s = "Tester".toLowerCase();
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					if (i > j) {
						break;
					}
					count++;
				}

			}
			if (count == 1) {
				System.out.println(s.charAt(i) + "   present in times  >" + count);
			}
		}
	}

	@Test
	public void collectionDuplicates() {
		String s = "Tester".toLowerCase();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (hm.containsKey(s.charAt(i))) {
				hm.put(s.charAt(i), hm.get(s.charAt(i)) + 1);
			} else {
				hm.put(s.charAt(i), 1);
			}
		}
		System.out.println("distinct or unique characters");
		for (Entry<Character, Integer> re : hm.entrySet()) {
			if (re.getValue() == 1) {

				System.out.println(re.getKey() + "   " + re.getValue());
			}
		}
		System.out.println("duplicate values");
		for (Entry<Character, Integer> re : hm.entrySet()) {
			if (re.getValue() > 1) {

				System.out.println(re.getKey() + "   " + re.getValue());
			}
		}
		System.out.println("all values");
		for (Entry<Character, Integer> re : hm.entrySet()) {

			System.out.println(re.getKey() + "   " + re.getValue());
		}
	}

	@Test
	public void removeDuplicateICharinString() {
		String s = "Tester".toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character ch : set) {
			System.out.println(ch);
		}
	}

	@Test
	public void program() {
		String s = "Hi Hello to Welcome to";
//		result ot emocleW olleH iH
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
//to Welcome Hello Hi
		String[] arr = s.split(" ");
		for (int i = arr.length - 1; i >= 0; i--) {
			if (i == 0) {
				System.out.print(arr[i]);
			} else {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println(arr.length);
	}

	@Test
	public void occuranceDuplicatesWordsfromString() {
		// occurance of Words
		String s = "Hi Hello to to Welcome to";
		String[] res1 = s.split(" ");
		for (int i = 0; i < res1.length; i++) {
			int count = 0;
			for (int j = 0; j < res1.length; j++) {
				if (res1[i].equals(res1[j])) {
					if (i > j) {
						break;
					} else {
						count++;
					}
				}

			}
//			if (count>0) {
//				System.out.println(res1[i]+"  "+count);
//			}
			// remove Duplicates
//			if (count==1) {
//				System.out.println(res1[i]+"  "+count);
//			}
			// only duplicates
			if (count > 1) {
				System.out.println(res1[i] + "  " + count);
			}
		}
	}

	@Test
	public void duplicatesFromStringUsingMap() {
		String s = "Hi Hello to to Welcome to";
		String[] res1 = s.split(" ");
		LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
		for (int i = 0; i < res1.length; i++) {
			if (map.containsKey(res1[i])) {
				map.put(res1[i], map.get(res1[i]) + 1);
			} else {
				map.put(res1[i], 1);
			}
		}
		System.out.println(map);
		for (Entry<String, Integer> re : map.entrySet()) {
			System.out.println(re.getKey() + "  " + re.getValue());
		}
	}

	@Test
	public void reverseEachWord() {
		String s = "Hi Hello Welcome to";
		String[] s1 = s.split(" ");
		String res = "";
		for (int i = 0; i < s1.length; i++) {
			if (i == s1.length || i == 0) {
				res += reverse(s1[i]);
			} else {
				res += reverse(s1[i] + " ");
			}
		}
		System.out.println(res);// iH olleH emocleW ot
	}

	public String reverse(String str) {
		String s = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			s += str.charAt(i);
		}
		return s;
	}

	@Test
	public void SwapfirstAndLastWords() {
		String s = "Hi Hello Welcome to";
		String[] s1 = s.split(" ");
		String a1 = s1[0];
		String a2 = s1[s1.length - 1];
		String temp = s1[0];
		s1[0] = s1[s1.length - 1];
		s1[s1.length - 1] = temp;

		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + " ");
		}
//		String[] res = new String[s1.length];
//		for (int i = 0; i < s1.length; i++) {
//			if (i == 0) {
//				res[i] = a2;
//			} else if (i == s1.length - 1) {
//				res[i] = a1;
//			} else {
//				res[i] = s1[i];
//			}
//		}
//		System.out.println(Arrays.toString(res));
//		String d = "";
//		for (String st : res) {
//			d += st + " ";
//		}
//		System.out.println(d);
	}

	@Test
	public void program3() {
		String s = "I am?sElenIum";
		String spl = "";
		String alp = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch > 'A' && ch <= 'Z')) {
				alp += ch;
			} else {
				spl += ch;
			}
		}
		System.out.println(spl);
		System.out.println(alp);
		alp = reverse(alp);
		int temp = 0;
		int j = 0;
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch > 'A' && ch <= 'Z')) {
				res += alp.charAt(j++);
			} else {
				res += spl.charAt(temp++);
			}

		}
		System.out.println(res);
	}

	@Test
	public void program4() {
		String s = "i am Selenium";
		String alp = s.replace(" ", "");
		int j = alp.length() - 1;
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ') {
				res += alp.charAt(j--);
//				System.out.print(alp.charAt(j--));
			} else {
				res += s.charAt(i);
//				System.out.print(s.charAt(i));
			}
		}
		System.out.println(res);
	}

	@Test
	public void printOnlyVowels() {
		String s = "India";
		s = s.toLowerCase();
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
				System.out.print(ch + " ");
			} else {
				continue;
			}
		}
		System.out.println();
		System.out.println(count);
	}

	@Test
	public void removeDuplicateVOWEL_from_String() {
		String s = "Inudiaro";
		s = s.toLowerCase();
		int count = 0;
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				if (res.indexOf(ch) == -1) {
					count++;
					res += ch;
					System.out.print(ch + " ");
				}
			}
		}
		System.out.println(count);
	}

	@Test
	public void program5() {
		String s = "a1b&3$c";
		String alp = "", spl = " ", num = " ";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= 'A') && ch <= 'Z') {
				alp += ch;
			} else if (ch >= '0' && ch <= '9') {
				num += ch;
			} else {
				spl += ch;
			}
		}
		System.out.println(alp + num + spl);
	}

	@Test
	public void addNumbersInString() {
		String s = "a1b2c3";
		int value = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				value += (ch - 48);
			}
		}
		System.out.println(value);
	}

	@Test
	public void program6() {
		String[] s = { "ab", "abc", "abcd", "ctd", "cdy" };
		// o/p=ab cd
		int min = s[0].length();
		for (int i = 0; i < s.length; i++) {
			int ie = s[i].length();
			if (ie < min) {
				min = ie;
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == min) {
				System.out.print(s[i] + " ");
			}
		}
		System.out.println();
		System.out.println(min);
	}

	@Test
	public void program7() {
		// find maximum length of the string
		String[] s = { "ab", "abc", "moye", "ctd", "cdy", "moye", "okay" };
		// o/p=moye moye okay 4
		int max = s[0].length();
		for (int i = 0; i < s.length; i++) {
			int ie = s[i].length();
			if (ie > max) {
				max = ie;
			}
		}
		for (int i = 0; i < s.length; i++) {
			if (s[i].length() == max) {
				System.out.print(s[i] + " ");
			}
		}
		System.out.println();
		System.out.println(max);
	}

	@Test
	public void str1() {
		String s = "aabbabc";
		// o/p a3b3c1
		String res = "";
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int count = 0;
			for (int j = 0; j < s.length(); j++) {
				char ch1 = s.charAt(j);
				if (ch == ch1) {
					if (i > j) {
						break;
					} else {
						count++;
					}
				}
			}
			if (count > 0) {
				String ch1 = ch + "";
				res += ch1 + count;
			}
		}
		System.out.println(res);

		int count = 1;
		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				System.out.print(s.charAt(i) + "" + count);
				count = 1;
			}
		}
		System.out.print(s.charAt(s.length() - 1) + "" + count);
	}

	@Test
	public void str2() {
		String s = "aaabbbabbddccccc";
		String res = "";
		boolean flag = true;
		for (int i = 0; i < s.length(); i++) {
			char r = s.charAt(i);
			if (flag == true) {
				for (int j = i; j < s.length(); j++) {
					char c = s.charAt(j);
					if (r == c) {
						res += r;
						if (j == s.length() - 1) {
							flag = false;
							break;
						}
					} else {
						i += (res.length() - 1);
//						res+=r;
						break;
					}
				}
			} else {
				break;
			}
			System.out.println(res);
			res = "";
		}

		/*
		 * op aa bb a b c
		 */
		/*
		 * int count=1; for (int i = 0; i < s.length()-1; i++) {
		 * 
		 * if (s.charAt(i)==s.charAt(i+1)) { count++; } else { for (int j = 0; j <
		 * count; j++) { System.out.print(s.charAt(i)); } count=1; System.out.println();
		 * } } System.out.print(s.charAt(s.length()-1)+""+count);
		 */
		/*
		 * for (int i = 0; i < s.length()-1; i++) { if (s.charAt(i)==s.charAt(i+1)) {
		 * System.out.print(s.charAt(i)); } else { System.out.println(s.charAt(i)); } }
		 * System.out.println(s.charAt(s.length()-1));
		 */

	}

	@Test
	public void str3() {
		String s = "Hello";
		int count = 1;
		for (int i = 0; i < s.length(); i++) {
			System.out.print(s.charAt(i));
			for (int j = 0; j < count; j++) {
				System.out.print("-");
			}
			count++;
		}
		System.out.println();
	}

	@Test
	public void str4() {
		String s1 = "h2$e3#el4$l/o";
		// ol$4l#e3e$2/h

		String s = s1.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s);
		int len = s.length() - 1;
		String res = "";
		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);
			if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9') || (ch > 'A' && ch <= 'Z')) {
				res += s.charAt(len--);
			} else {
				res += ch;
			}
		}
		System.out.println(res);
	}

	@Test
	public void str6() {
		String s = "ab12cd34ef1234";
		String[] s1 = s.split("[^0-9]");
		for (int i = s1.length - 1; i >= 0; i--) {
			System.out.print(s1[i] + " ");
		}
		System.out.println(s1.length);
	}

	@Test
	public void swap() {
		String s = "java";
		String s1 = "coding";
		System.out.println(s);
		System.out.println(s1);
//		s=s+s1;//javacoding
//		int begin = s.indexOf(s1);
//		s1=s.substring(0,begin);
//		s=s.substring(begin);
//		System.out.println(s);
//		
//		System.out.println(s1);

		s = s.concat(s1);
		s1 = s.substring(0, s.length() - s1.length());
		s = s.substring(s1.length());
		System.out.println(s+ "     "+s1);

	}
}
