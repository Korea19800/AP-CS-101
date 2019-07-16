/* 
 * Write a method that takes two parameters:
 * int r
 * int c
 * and prints r rows and c columns of stars
 */
package chapter5;

public class _02_MultipleParameters {

	public static void main(String[] args) {

		int rows = 10;  // change these numbers 
		int cols = 5;

//		nStars( rows, cols );
		nStars( rows, cols); // 이 괄호 안에 rows만 쓰면 method를 인식x 
							// variable의 type과 개수 맞춰야함!
	}

	// method nStars() here. 
		public static void nStars( int r, int c) { // 위에선 rows, cols 인데 밑은 r,c 
			for (int i=0; i<r; i++) {				// >> 비록 이름이 다를지라도 상관x. 어차피 같은 method이기에 자동매칭이됨. 다만 variable type을 반드시 일치시켜줘야됨
				for(int j=0; j<c; j++) {
					System.out.print("* ");
				}
				System.out.println();

			}

		}


}
