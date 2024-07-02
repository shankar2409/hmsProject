package StringPrograms;


public class task1 {
	public static void main(String[] args) {
		String input =  "&quot;This is m@y count!ry !&quot;;";
//		String output = "&sihT;touq si y@m yrtnu!oc !&touq;;";
		String s1="";
		String speicalCh = "";//&;@!&;;
		for(int i=0;i<input.length();i++) {
			if (Character.isAlphabetic(input.charAt(i))|| Character.isDigit(input.charAt(i))||Character.isSpaceChar(input.charAt(i))) {
				s1+=input.charAt(i);
			} else {
				speicalCh+=input.charAt(i);
			}
		}
		System.out.println(speicalCh);
		String[] op = s1.split(" ");
		String op1="";
		for(int i=0;i<op.length;i++) {
			op1+=reverseWord(op[i]);
		}
		op1=op1.trim();
		int temp=0;
		for(int i=0;i<=input.length();i++) {
			if(input.charAt(i)==speicalCh.charAt(temp)) {
				
			}
		}
		
	}
	public static String reverseWord(String rev) {
		String result="";
		for(int i=rev.length()-1;i>=0;i--) {
			result+=rev.charAt(i);
		}
		return result+" ";
	}

}
