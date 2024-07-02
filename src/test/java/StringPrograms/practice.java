package StringPrograms;

public class practice {
	
	public static void main(String[] args) {
		
		String s="jhony jhony yes papa";
		for(int i=0;i<s.length();i++) {
			
			if(s.charAt(i)=='j') 
			{
				s=s.replace(s.charAt(i), 't');
			}
			else if(s.charAt(i)=='p')
			{
				s=s.replace(s.charAt(i),'n');
			}
			
		}
		System.out.println(s);
		

		}
}
