/* 
 * combine the two nStars methods :
 * nStars(n) // gives you a single line of n stars
 * nStars(r,c) // gives you r rows and c columns
 * Concepts: method overloading, method signature(header)
 */
package chapter5;

public class _06_MethodOverloading { //Overload ���ϰ� �Ǵ´�>> nStars���� ���� �̸��� �ִ� �� ������ �Ǵ��� parameter������ ���а���!

	public static void main(String[] args) {
		
		int r = 3;
		int c = 5;
		
		nStars(r);
		System.out.println();
		System.out.println();
		nStars(r,c);
	}
		/* �ؿ� method�� nStars���� �̸� ���� method �� ���϶� ��� �����ұ�? 
		 * A: parameter������ ����! ���� 1��¥�� �θ��� �ʹٸ� nStarsġ�� parameter 1���� ġ�� ��
	
	    */

	
	// signature: nStars(int)
	public static void nStars(int n) {
		
		for( int i=0; i<n; i++) { 
			System.out.print("* ");
		}
		
	}
	// signature: nStars(int, int)
	public static void nStars(int r, int c) {
		for (int i=0; i<r; i++) {				// >> ��� �̸��� �ٸ����� ���x. ������ ���� method�̱⿡ �ڵ���Ī�̵�. �ٸ� variable type�� �ݵ�� ��ġ������ߵ�
			for(int j=0; j<c; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}

		
	}
}
