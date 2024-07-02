package StringPrograms;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int b[]= {2,3,4,5,6,7};
		
		int c[]=new int[a.length+b.length];
		
		int temp=0,temp1=0;
		
		int i=0;
		while(i<c.length)
		{
			if(temp<a.length)
			{
				c[i]=a[temp++];
			}
			else
			{
				c[i]=b[temp1++];
			}
			i++;
		}
		System.out.println(Arrays.toString(c));
		
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		int count=0;
		for (int j = 0; j < c.length; j++) {
			for (int j2 = j+1; j2 < c.length; j2++) {
				 if(c[j]==c[j2])
				 {
					 c[j2]=-1;
				 }
			}
			if(c[j]!=-1)
			{
				System.out.print(c[j]+" ");
			}
		}
		System.out.println(  );
		System.out.println(Arrays.toString(c));
	}
}
