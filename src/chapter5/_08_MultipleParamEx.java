/* 
 * Write a method that takes three parameters:
 * int r
 * int c
 * char ch
 * and prints rows rows and c columns of ch
 * ch can be any character, such as *, -, $, or even alphabets 
 */
package chapter5;

public class _08_MultipleParamEx {

	public static void main(String[] args) {
		
		int rows = 4;  // change this for number of rows
		int cols = 5;  // number of columns
		String str = "/./"; 	// what you want to print
		
		chars2D( rows, cols, str );
		
	}

	// method nStars() here. 
	public static void chars2D(int r, int c, String s) {
		for (int i=0; i<r; i++) {				// >> ��� �̸��� �ٸ����� ���x. ������ ���� method�̱⿡ �ڵ���Ī�̵�. �ٸ� variable type�� �ݵ�� ��ġ������ߵ�
			for(int j=0; j<c; j++) {
				System.out.print(s+" ");
			}System.out.println();
		}
		

		
		
		
	}
	
}
