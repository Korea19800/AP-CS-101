package chapter3;

public class _08_ShortCircuit {

	public static void main(String[] args) {
		
		boolean tr = false;
		int num = 5;
		
		/* 
		 * write a routine that prints "always true"
		 * if tr is true or num decremented by one is equal to 0
		 */
		if ( tr== true || --num==0) {
			System.out.println("always true");
		}
		System.out.println("num="+num); // ���⼭  ����Ʈ�� ������ --num������ ����Ʈ�� -�ȵǼ� ����
										// �� �׷���?
										// tr�� true�� ��� OR�� ����Ǿ� �ֱ⿡ �ڿ� ���� ����� ������ ������ always true�� ���� >> ���� ��ǻ�ʹ� ���� ����� �ǹ� ���⿡ ���� operator�� �������� ����!
										// >> ���� tr==true�� �ڿ��� ��� x ������ false�� ��� �ڿ��� ����ϰ� ��!
		// A || B is not equivalent to B || A (because of Short Circuit!)
		// ���п��� A||B= B||A���� ��ǻ�Ϳ��� �ƴ� �ֳ��ϸ� �տ��� ���̸� �ڿ��� ���� x
		System.out.println();
		// A && B is not eqivalent to B&&A
		// 2.
		// true || ?? 
		// false && ?? 
		//>> ?? ���� ������� ����!
		
		if ( tr== true && --num==0) {
			System.out.println("always true");
		}
		System.out.println("num=" +num); 
		// Lesson Point
		
		// 1. 
		//A || B is not equivanlent to B||A   
		//A && B is not eqivalent to B&&A
				
		// 2.Short-Circuit (ª�� ��ȯ: �տ��� ����� ���!)
				// true || ?? 
				// false && ?? 
				//>> ?? ���� ������� ����!
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
