/* 
 * combine the two nStars methods :
 * nStars(n) // gives you a single line of n stars
 * nStars(r,c) // gives you r rows and c columns
 * Concepts: method overloading, method signature(header)
 */
package chapter5;

public class _06_MethodOverloading { //Overload 과하게 실는다>> nStars같이 같은 이름이 있는 놈 여럿을 실더라도 parameter갯수로 구분가능!

	public static void main(String[] args) {
		
		int r = 3;
		int c = 5;
		
		nStars(r);
		System.out.println();
		System.out.println();
		nStars(r,c);
	}
		/* 밑에 method에 nStars같이 이름 같은 method 두 개일때 어떻게 구분할까? 
		 * A: parameter개수로 구분! 따라서 1개짜리 부르고 싶다면 nStars치고 parameter 1개만 치면 됨
	
	    */

	
	// signature: nStars(int)
	public static void nStars(int n) {
		
		for( int i=0; i<n; i++) { 
			System.out.print("* ");
		}
		
	}
	// signature: nStars(int, int)
	public static void nStars(int r, int c) {
		for (int i=0; i<r; i++) {				// >> 비록 이름이 다를지라도 상관x. 어차피 같은 method이기에 자동매칭이됨. 다만 variable type을 반드시 일치시켜줘야됨
			for(int j=0; j<c; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		
	}
}
