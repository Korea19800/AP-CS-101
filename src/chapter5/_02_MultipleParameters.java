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
		nStars( rows, cols); // �� ��ȣ �ȿ� rows�� ���� method�� �ν�x 
							// variable�� type�� ���� �������!
	}

	// method nStars() here. 
		public static void nStars( int r, int c) { // ������ rows, cols �ε� ���� r,c 
			for (int i=0; i<r; i++) {				// >> ��� �̸��� �ٸ����� ���x. ������ ���� method�̱⿡ �ڵ���Ī�̵�. �ٸ� variable type�� �ݵ�� ��ġ������ߵ�
				for(int j=0; j<c; j++) {
					System.out.print("* ");
				}
				System.out.println();

			}

		}


}
