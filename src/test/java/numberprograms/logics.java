package numberprograms;

import java.util.Iterator;

public class logics {
	public static void main(String[] args) {
		String s = "a2b5c1d4e5";
		String s1 = "abbcccdddd";
		String e1 = "", e2 = "";
		for (int i = 0; i < s.length(); i++) {
			if (Character.isAlphabetic(s.charAt(i))) {
				e2 += s.charAt(i);
			} else {
				e1 += s.charAt(i);
			}
		}
		String result="";
		int k=0;
		for (int i = 0; i <e1.length(); i++) {
			String r = e1.charAt(i)+"";
				int loop = Integer.parseInt(r);
				for (int j = 0; j < loop; j++) {
					result+=e2.charAt(k);
				}
				k++;
		}
		System.out.println(result);
		System.out.println(result.equals(s1));
		
	}
	
}
