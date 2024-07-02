package StringPrograms;

import java.util.Iterator;

public class reverseStringEachWord {
	public static void main(String[] args) {
		String input = "Hello My name is Ram";
		String output="maR si eman yM olleH";
		String[] step1 = input.split(" ");
		String result="";
		for(int i=step1.length-1;i>=0;i--) {
			String s1=step1[i];
			String rev="";
			for(int j=s1.length()-1;j>=0;j--) {
				rev+=s1.charAt(j);
			}
			if (i!=0) {
				result+=rev+" ";
			}
			else {
				result+=rev;
			}
		}
		System.out.println(result);
		System.out.println(output);
		System.out.println(result.equals(output));
	}
}
