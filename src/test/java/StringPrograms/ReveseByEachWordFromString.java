package StringPrograms;

public class ReveseByEachWordFromString {
	public static void main(String[] args) {
		String input="Hello I am a good boy";
		String output="boy good a am I Hello";
		String[] sp1 = input.split(" ");
		String result="";
		for(int i=sp1.length-1;i>=0;i--) {
			result+=sp1[i]+" ";
		}
		System.out.println(result);
	}
}
