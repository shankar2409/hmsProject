package testYantraArrayPrograms;

import org.testng.annotations.Test;

public class PatternProgram {
	/**
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * * 
	* * * * * 
		 */
	@Test
	public void pat1() {
										
		int size=5;
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	/**
*         
* *       
* * *     
* * * *   
* * * * * 
	 */
	@Test
	public void pat2() {
		int n=5;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i>=j) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	/**
* * * * * 
* * * *   
* * *     
* *       
*         
	 */
	@Test
	public void pat3() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j<=n+1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	/**
        * 
      * * 
    * * * 
  * * * * 
* * * * * 
	 */
	@Test
	public void pat4() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i+j>=n+1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	/**
        *         
      * * *       
    * * * * *     
  * * * * * * *   
* * * * * * * * * 
	 */
	@Test
	public void pat5() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= 2*n-1; j++) {
				if (i+j>=n+1&&j-i<=n-1) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	/**
 * * * * * * * * * 
  * * * * * * *   
    * * * * *     
      * * *       
        * 
	 */
	@Test
	public void pat6() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= 2*n-1; j++) {
				if (i<=j&&i+j<=2*n) {
					System.out.print("* ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
	/**
1 1 1 1 1 
2 2 2 2 2  
3 3 3 3 3  
4 4 4 4 4  
5 5 5 5 5  
	 */
	
	@Test
	public void pat7() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			int a=1;
			for (int j = 1; j <= n; j++) {
					System.out.print(i+" ");
			}
			a++;
			System.out.println();
		}
	}
	@Test
	public void pat8() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			int a=1;
			for (int j = 1; j <= n; j++) {
					System.out.print(a++ +" ");
			}
			System.out.println();
		}	
	}
	/**
1         
2 2       
3 3 3     
4 4 4 4   
5 5 5 5 5 
	 */
	@Test
	public void pat9() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			int a=1;
			for (int j = 1; j <= n; j++) {
					if (i>=j) {
						System.out.print(i +" ");
					} else {
						System.out.print("  " );
					}
			}
			System.out.println();
		}
	}
	/**

        1 
      2 2 
    3 3 3 
  4 4 4 4 
5 5 5 5 5 

	 */
	@Test
	public void pat10() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <= n; j++) {
					if (i+j>=n+1) {
						System.out.print(i +" ");
					} else {
						System.out.print("  ");
					}
			}
			System.out.println();
		}
	}
	/**
5         
4 4       
3 3 3     
2 2 2 2   
1 1 1 1 1
	 */
	@Test
	public void pat11() {
		int n=5;
		int a=n;
		for (int i = 1; i <=n; i++,a--) {
			
			for (int j = 1; j <= n; j++) {
					if (i>=j) {
						System.out.print(a +" ");
					} else {
						System.out.print("  " );
					}
			}
			System.out.println();
		}
	}
	/**
        1         
      2   2       
    3   3   3     
  4   4   4   4   
5   5   5   5   5 
	 */
	@Test
	public void pat12() {
		int n=5;
		
		for (int i = 1; i <=n; i++) {
			int a=n+1;
			for (int j = 1; j <= 2*n-1; j++) {
					if (i+j>=n+1&&j-i<=n-1&&i+j==a) {
						System.out.print(i +" ");
						a=a+2;
					} else {
						System.out.print("  " );
					}
			}
			System.out.println();
		}
	}
	
	/**
	 *         1         
	 *       1 2 1       
	 *     1 2 3 2 1    
	 *   1 2 3 4 3 2 1  
	 * 1 2 3 4 5 4 3 2 1 
	 */
	@Test
	public void pat13() {
		int n=5;
		for (int i = 1; i <=n; i++) {
			int a=1;
			for (int j = 1; j <= 2*n-1; j++) {
					if (i+j>=n+1&&j-i<=n-1) {
						System.out.print(a+" ");
						if (j<n) {
							++a;
						} else {
							--a;
						}
					} else {
						System.out.print("  " );
					}
					
			}
			System.out.println();
		}
	}
	@Test
	public void name() {
		int n=4;
		System.out.println((char)97+"  "+(char)122);
		for (int i = 1; i <=n; i++) {
			char ch=(char) (64+i);
			for (int j = 1; j <= n; j++) {
				System.out.print(ch+" ");
				ch+=n;
			}
			System.out.println();
		}
	
	}
	/**
f f f f f f 
e e e e e   
d d d d     
c c c       
b b         
a    
	 */
	@Test
	public void s10() {
		int n=5;
		char ch=(char) ('a'+n-1);
		for (int i = 1; i <=2*n-1; i++) {
			for (int j = 1; j <=2*n-1; j++) {
				if(j==1||j==n||((i==j||i+j==n+1)&&(i!=n+1))) {
					System.out.print(ch+" ");
				}else {
					System.out.print("  ");
				}
			}
			ch--;
			System.out.println();
		}
		
	}
	
}
