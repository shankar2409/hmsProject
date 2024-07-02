package StringPrograms;

import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class Reverse 
{
	public static void main(String[] args) {
		
		String s="Banglore city";
		String[] st = s.split(" ");
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		
		for(int i=0;i<s.length();i++) 
		{
			if(map.containsKey(s.charAt(i))) 
			{
				map.put(s.charAt(i), map.get(s.charAt(i))+1);
			}
			else 
			{
				map.put(s.charAt(i), 1);
			}
		}
		for (Entry<Character, Integer> entry : map.entrySet()) {
			
			if(entry.getValue()>=1)
			{
				System.out.println(entry.getKey()+" ");
			}
		}	
	}
	
	

}
