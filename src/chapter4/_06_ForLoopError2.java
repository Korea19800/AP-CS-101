// infinite for loop error

package chapter4;

public class _06_ForLoopError2 {

	public static void main(String[] args) {
		
		// we just wanted to print five rows of five stars
		// what went wrong?
		
		for ( int i = 1; i <= 5 ; i++) {
			for ( int j = 1; i<=5; j++) {
				System.out.print("* "); // change this to println to see what's going on
			}
		}
		
		
		System.out.println();
		// SOlution: ������ ù���� loop���� i=1�� ����> ���� loop���� ��
		//>> ���� j loop���� j�� ������ �����Ƿ� ������ for loop���� ������ ����> infinite loop����
		// i�� j�� �ٲ��ָ� �ʵ�
		for ( int i = 1; i <= 5 ; i++) {
			for ( int j = 1; j<=5; j++) {
				System.out.print("* "); // change this to println to see what's going on
			}
		}
	}

}