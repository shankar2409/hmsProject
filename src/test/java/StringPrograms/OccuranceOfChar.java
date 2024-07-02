package StringPrograms;

public class OccuranceOfChar {

	public static void main(String[] args) {
		 String s="javaa";
		 String s1="";
		 for(int i=0;i<s.length();i++)
		 {
			 char ch=s.charAt(i);
			 int count=1;
			 System.out.println(s1.indexOf(ch));
				if (s1.indexOf(ch) == -1) {
					for (int j = i + 1; j < s.length(); j++) {
						char ch1 = s.charAt(j);
						if (ch == ch1) {
							count++;
						}
					}
					if (count >= 1) {
						System.out.println(ch + " = " + count);
					}
					s1 += ch;

				}
			 
			 
		 }
	}

}
