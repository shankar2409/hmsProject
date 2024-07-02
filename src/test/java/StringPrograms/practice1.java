package StringPrograms;

public class practice1 {
	
	public static void main(String[] args) {
		
		String s="I am from test yantra";
		
		String[] st = s.split(" ");
		String rev = "";
		int l=st.length-1;
		//System.out.println("sasassa");
		for(int i=0;i<st.length;i++)
		{
		
			
			//System.out.println(rev);
			if(i==l)
			{
				String word = st[i];
				//System.out.println(word);
				for(int j=word.length()-1;j>=0;j--)
				{
					//System.out.println(st[i]);
					rev=rev+word.charAt(j);
					//System.out.print(word.charAt(j));
					
				}
			}
			else {
				rev=rev+st[i]+" ";
			}
		}
		System.out.println(rev);
	}

}
