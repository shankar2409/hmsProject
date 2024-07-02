package numberprograms;

import java.util.Arrays;

public class maxValue {
	public static void main(String[] args) {
		
//		int[] a= {20,30,100,30,234,43,-23,0};
		/*int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<max)
			{
				max=a[i];
			}
		}
		System.out.println(max);*/
		/*int max=a[0];
		int secondmax=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				secondmax=max;
				max=a[i];
			}
			else if(secondmax<a[i]&&max!=a[i])
			{
				secondmax=a[i];
			}
		}
		System.out.println(max);
		System.out.println(secondmax);*/
		/*
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		int min=max;
		int secondmin=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				secondmin=min;
				min=a[i];
			}
			else if(a[i]<secondmin&& min!=a[i])
			{
				secondmin=a[i];
			}
		}
		System.out.println(min);
		System.out.println(secondmin);*/
		/*Scanner sc=new Scanner(System.in);
		System.out.println("1--->remove duplicate");
		System.out.println("2--->distinct");
		System.out.println("3--->duplicate");
		int []a= {21,32,-32,4,321,75,-0,98,98,21,0,65};
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if(count==1)
			{
				System.out.println(a[i]);
			}
//			System.out.println(a[i]);
		}*/
		/* 
		int[] a= {21,32,95,32,0,23};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));*/
//		String s="shan",s1="shan";
//		System.out.println(s==s1);
//		System.out.println(s.equals(s1));
		
		/*String s="shankar";
		String res="";
		for(int i=0;i<s.length();i++) {
			int ch=s.charAt(i);
			if(ch>='a'&&ch<='z')
			{
				res+=(char)(ch-32);
			}
			else {
				res+=(char)ch;
			}
		}
		System.out.println(res);*/
		/*String s="hi every buddy cool";
		String res="";
		String[] a=s.split(" ");
		String temp=a[0],temp1=a[a.length-1];
		for(int i=0;i<a.length;i++) {
			if(i==0) {
				res+=temp1+" ";
			}
			else if(i==a.length-1) {
				res+=temp;
			}
			else {
				res+=a[i]+" ";
			}
			
		}System.out.println(res);*/
		String num="hello world";
		String[] a=num.split(" ");
		
		String res="";
	
			res+=a[a.length-1]+" ";
			res+=a[0];

		System.out.println(res);
		
	}}

