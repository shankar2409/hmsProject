package StringPrograms;

public class removeDuplicates {
	public static void main(String[] args) {
		String p = "My name is Khan".toLowerCase();
		String p1 = "My name is Khan";
		String output = "My nae is Kh";
		String result = "";
		for (int i = 0; i < p.length(); i++) {
			int count = 1;
			for (int j = 0; j < i; j++) {
				if (p.charAt(i) != ' ') {
					if (p.charAt(i) == p.charAt(j)) {
						count++;
					}
				}
			}
			if (count == 1) {
				result += p1.charAt(i);
			}
		}
		System.out.println(result);
	}
}
