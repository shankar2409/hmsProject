package NumberProgram;
import java.util.*;
public class Number 
{
	public static void main(String[] args) throws Exception
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("For armstrong number press-1");
		Thread.sleep(500);
		System.out.println("For automorphic number press-2");
		Thread.sleep(500);
		System.out.println("For 3&5 divisible number press-3");
		Thread.sleep(500);
		System.out.println("For factorial of a number press-4");
		Thread.sleep(500);
		System.out.println("For fibinocci series press-5");
		Thread.sleep(500);
		System.out.println("For first no even or odd press-6");
		Thread.sleep(500);
		System.out.println("For GCD of a number press-7");
		Thread.sleep(500);
		System.out.println("For happy number number press-8");
		Thread.sleep(500);
		System.out.println("For leap year press-9");
		Thread.sleep(500);
		System.out.println("For multiplication table press-10");
		Thread.sleep(500);
		System.out.println("For Neon number press-11");
		Thread.sleep(500);
		System.out.println("For Nth even number press-12");
		Thread.sleep(500);
		System.out.println("For Nth fibinocci press-13");
		Thread.sleep(500);
		System.out.println("For palindrome number press -14");
		Thread.sleep(500);
		System.out.println("For spy number press -15");
		Thread.sleep(500);
		System.out.println("For perfect square press -16");
		Thread.sleep(500);
		System.out.println("For range of primes press - 17");
		Thread.sleep(500);
		System.out.println("For strong number press - 18");
		Thread.sleep(500);
		System.out.println("For tech number press - 19");
		Thread.sleep(500);
		System.out.println("For xylem number press - 20");
		Thread.sleep(500);
		System.err.print("Enter the number :");
		int ch=scn.nextInt();
		switch (ch)
		{
		case 1:
			{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			armstrong(n);
			break;
			}
		case 2:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			automorphic(n);
			break;
		}
		case 3:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			divisible(n);
			break;
		}
		case 4:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			factorial(n);
			break;
		}
		case 5:
		{
			fibinocci();
			break;
		}
		case 6:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			firstnumberodd(n);
			break;	
		}
		case 7:
		{
			gcd();
		}
		case  8:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			happy(n);
			break;
		}
		case 9:
		{
			leapyear();
			break;
		}
		case 10:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			multiplicationtable(n);
			break;
		}
		case 11:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			neon(n);
			break;
		}
		case 12:
		{
			ntheven();
			break;
		}
		case 13:
		{
			 nthfibinocci();
			 break;
		}
		case 14:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			palindrome(n);
			break;
		}
		case 15:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			spynumber(n);
			break;
		}
		case 16:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			perfectsquare(n);
			break;
		}
		case 17:
		{
			System.out.print("Enter the start range :");
			int start=scn.nextInt();
			System.out.print("Enter the start range :");
			int end=scn.nextInt();
			rangeofprime(start,end);
			break;
		}
		case 18:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			sunnynumber(n);
			break;
		}
		case 19:
		{
			System.out.print("Enter the number :");
			int n=scn.nextInt();
			technumber(n);
			break;
		}
		case 20:
		{

			System.out.print("Enter the number :");
			int n=scn.nextInt();
			xylemnumber(n);
			break;
			
		}
			
		
			
		}
}
		
		public static void armstrong(int n) 
		{
			int count=0,copy=n,sum=0;
			while(n!=0)
			{
				n=n/10;
				count++;
			}
			n=copy;
			while(n>0)
			{
				int d=n%10;
				int product=1;
				for(int i=1;i<=count;i++) 
				{
					product*=d;
					
				}
				sum+=product;
				n=n/10;
			}
				if(sum==copy)
				{
					System.out.println(copy+" is armstrong number");
				}
				else
				{
					System.out.println(copy+" is not a armstrong number");
				}
				
			}
		public static void automorphic(int n) 
		{
			
			int sq=n*n,copy=n;
			while(n>0)
			{
				if(n%10!=sq%10)
				{
					break;
				}
					n=n/10;
					sq=sq/10;
					
				}
				if(n==0)
					System.out.println(copy+" is a automorphic number");
				else
					System.out.println(copy+" is a automorphic number");
			}
		public static void divisible(int n) 
		{
			
			if (n%3==0 && n%5==0) 
			{
				System.out.println(n+" is divisible by 3 and 5");
					
			}
			else
				System.out.println(n+" is not divisible by 3 and 5");
		}
		public static void factorial(int n) 
		{
			
			int p=1,i;
			for(i=n;i>=1;i--)
			{
				p=p*i;
			}
			System.out.println("factorial of "+n+" is "+p);
			
		}
		public static void fibinocci() 
		{
			int a,b,sum;
			a=0;
			b=1;
			sum=0;
			for(int i=1;i<=10;i++)
			{
				System.out.print(a+",");
				sum=a+b;
				a=b;
				b=sum;//b=1
				
			}
		}
		public static void firstnumberodd(int n) 
		{
			
			
			while(n>9)
			{
				n=n/10;	
			}
			
			if(n%2==1)
			{
				System.out.println(n+" is odd");
			}
			else
				System.out.println(n+" is even");
		}
		public static void gcd()
		{
			Scanner scn=new Scanner(System.in);
			System.out.print("Enter the number n1 :");
			int N1=scn.nextInt();
			System.out.print("Enter the number n2 :");
			int N2=scn.nextInt();
			int Gcd=0;
			for(int i=1;i<=N1&&i<=N2;i++)
			{
				if(N1%i==0 && N2%i==0)
					Gcd=i;
			}
			System.out.println("GCD of a number :"+ Gcd);	
		}
		public static void happy(int n) 
		{
			int copy=n;
			while(true)
			{
				int sum=0;
				while(n>0)
				{
					int d=n%10;
					sum=sum+(d*d);
					n=n/10;
				}
				n=sum;
				if(n==1)
				{
					System.out.println(copy+" is happy number ");
					break;
				}
				else if (n==4)
				{
					System.out.println(copy+" is unhappy number");
					
				}
				
			}
			
		}
		public static void leapyear() 
		{
			Scanner scn=new Scanner(System.in);
			System.out.print("Enter the year :");
			int year=scn.nextInt();
			if(year%4==0&&year%100!=0||year%400==0)
				System.out.println(year+" is a leap year ");
			else
				System.out.println(year+" is not leap year");
			
		}
		public static void multiplicationtable(int n) 
		{
			int mul=0;
			for(int i=1;i<=10;i++)
			{
				mul=n*i;
				System.out.println(n+"x"+i+"="+mul);
			}	
		}
		public static void neon(int n) 
		{
			int sq=n*n,n1,sum=0;
			while(sq>0)
			{
				n1=sq%10;
				sq=sq/10;
				sum=sum+n1;
				
			}
			if(sum==n)
				System.out.println(n+" is neon number");
			else
				System.out.println(n+" is not a neon number");
			
		}
		public static void ntheven() 
		{
			Scanner scn=new Scanner(System.in);
		System.out.print("Enter the taget value :");
		int target=scn.nextInt();
		int start=1;
		long count=0;
		for(int i=start; i<=target*2 ;i++)
		{
			if(i%2==0)
			{
				count++;
			}
			if(count==target)
			{
				System.out.println("NTH even number is : "+i);
				break;
			}	
		}
		
	}
		public static void nthfibinocci() 
		{
			Scanner scn=new Scanner(System.in);
			System.out.print("Enter the target value :");
			int target=scn.nextInt();
			int a=0,b=1,c=0,count=0;
			for(int i=1;i<=target;i++)
			{
				if(target==i)
				{
					System.out.println("Nth fibonacci is "+a);
					break;
				}
					c=a+b;
					a=b;
					b=c;			
				}
		}
		public static void palindrome(int n) 
		{
			
			int copy=n,reverse=0;
			while(n>0)
			{
				int reminder=n%10;
				n=n/10;
				reverse=reverse*10+reminder;
			}
			if(reverse==copy)
				System.out.println(copy+" is a palindrome number");
			else
			{
				System.out.println(copy+" is not a palindrome number");
			}
}
		public static void spynumber(int n) 
		{
			int sum=0;
			for (int i=1;i<n;i++)
			{
				if(n%i==0)
					sum+=i;//1+2+4+7+14=28
			}
			if(sum==n)
				System.out.println(n+" perfect number");
			else
				System.out.println(n+" not perfect number");
}
		public static void perfectsquare(int n) 
		{
			int sq=1;
			boolean flag=false;
			for(int i=1;i<=n;i++)
			{
				sq=i*i;
				if(sq==n)
				{
					System.out.println(i+" is the perfect square");
					flag=true;
					break;
				}	
			}
			if(flag==false)
				System.out.println("perfect Square root not found");
			
			
			
		}
		public static void rangeofprime(int start,int end) 
		{
			int i,j,target=5;
			for(i=start;i<=end;i++)
			{
				for(j=2;j<=i;j++)
				{
					if(i%j==0)
						break;
				}
			
			if(i==j)
				System.out.print(i+",");
			}
		}
		public static void sunnynumber(int n) 
		{
			int n1=n+1,sq=1;
			boolean flag=false;
			for(int i=1;i<=n1;i++)
			{
				sq=i*i;
				if(sq==n1)
				{
					System.out.println(n+" is a sunny number ");
					flag=true;
					break;
				}
				
					
			}
			if(flag==false)
			{
				System.out.println("not a sunny number");
			}
		}
		public static void technumber(int n)
		{
			int count=0,copy=n,sq=1,sq1=1;
			while(n>0)
			{
				 n=n/10;
				count++;
				
			}
			int power=count/2;
			n=copy;
			if(count%2==0)
			{
				for(int i=1;i<=power;i++)
				{
					sq*=10;
				}
				int f1=n/sq;//first part
				int f2=n%sq;//last number
				int add=f1+f2;
				sq1=add*add;
				if(sq1==copy)
				{
					System.out.println(copy+" is a tech number");
				}	
				else
					System.out.println(copy+" is not a tech number");	
			}
			else
			{
				System.out.println(copy+" is not a tech number");
			}
			
			
		}
		public static void xylemnumber(int n)
		{
		int copy=n,innersum=0;
		int lst=n%10;
		 n=n/10;
		 while(n>9)
		 {
			 int s=n%10;
			 innersum+=s;
			 n=n/10;
		 }
		 int outersum=lst+n;
		 if(innersum==outersum)
			 System.out.println(copy+ " is a xylem number");
		 else
			 System.out.println(copy+" is a phloem number");
		}

		
}