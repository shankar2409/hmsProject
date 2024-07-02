package StringPrograms;

public class remove_numbersAndAddNumbers {
	public static void main(String[] args) {
		String input = "asc123bsd4";
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isDigit(input.charAt(i))) {
				output+=input.charAt(i);
				
			}
			
		}
		int oi = Integer.parseInt(output);
		int result=0;
		while(oi>0) {
			int d = oi%10;
			result+=d;
			oi=oi/10;
		}
		System.out.println(result);
	}
}
