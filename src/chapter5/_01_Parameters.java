/* 
 * In the previous examples, we used methods to control flow
 * Here, we begin passing variables to and from methods.
 * Write a method that takes a parameter int n, and prints
 * n stars
		
 */
package chapter5;

public class _01_Parameters {

	public static void main(String[] args) {
		
		int n = 10;    // change this to print different number of stars
		
//		nStars(n);
		nStars(n);
		// parameter 3개짜리
		int a=12, b=5, c=6;
		
		KSTARS(a,b,c);
		
		
		
	}

	// method nStars() here. // method´Â main¹Û¿¡ ±×¸®°í ¸¶Áö¸· °ýÈ£ »çÀÌ¿¡ ¾´´Ù 
		public static void nStars(int n) { // Main의 Parameter와 Method칸의 Parameter는 이름이 다르더라도 type과 갯수만 일치하면 됨!!
			for( int i=0; i<n; i++) { 
				System.out.print("* ");
			}
		}
		public static void KSTARS(int n, int m, int l)  {
			System.out.println(n-m+l);
			
			
		}
	
}
