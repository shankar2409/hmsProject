package StringPrograms;

public class splittheWords {
	public static void main(String[] args) {
	String s="hi how are you";
	String word="";
	String ss="";
	int length=s.length();
	for(int i=0;i<s.length()-1;i++)
	{
		
		char ch=s.charAt(i);
		if(ch!=' ')
		{
			ss+=ch;
		}
		else if(ch==' ')
		{
			word=ss;
			ss="";
			System.out.println(word);
			System.out.println(ss);
		}
	}
	}
}
