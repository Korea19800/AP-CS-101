package chapter3;

public class _07_EEven {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 0;
		int c = 5;
		
		/* 
		 * say "EEven!" if and only if exactly two of a, b, c are even.
		 * say "burp!" if not.
		 */
		
		// hint: a or b or c is odd. >> a�Ǵ� b�Ǵ� c�� ��� 1���� odd���� EEVEn����
		//+ 8���� ����� �� �� EEVEN�� 3������. 
		if( a%2==1 && b%2==0 && c%2==0) {
			System.out.println("EEVEN!");
		} else if( a%2==0 && b%2==1 && c%2==0) {
			System.out.println("EEVEN!");			
		} else if( a%2==0 && b%2==0 && c%2==1) {
			System.out.println("EEVEN!");	
			
		} else {
			System.out.println("burp!");
		}
		// �� ���� ���� ����ȭ ��Ų �ڵ�>> OR�� ���� ���
		/** ���� ����!! 
		 * && has higher precedence than || 
		 * 
		 */
		if( (a%2==1 && b%2==0 && c%2==0) || (a%2==0 && b%2==1 && c%2==0) ||(a%2==0 && b%2==0 && c%2==1)) {
			System.out.println("EEVEN!");
		}  else {
			System.out.println("burp!");
		}
		
		
		
	
	}
	
}
