package chapter2;

public class _05_Casting {

	public static void main(String[] args) {
		// casting: type change!
		// passive cast
		System.out.println( 5/2.); // 2�ڿ� .0 ���ָ� ��ǻ�ʹ� double�� double���� ����ؾ� �ϱ⿡ ������ 5�� 5.0���� �ٲ�>> �̰� passive casting 
		

		
		System.out.println("----------------------");
		// active cast: suppose you want to go the opposite way
		// and turn 2.0 to 2
		double x= 2.0;
		System.out.println(x);
		System.out.println((int) x); 
		int i= (int) x;  System.out.println(i);
		double a=5.5;
		System.out.println((int)a);
		double b=9.9564;
		System.out.println((int)b);
		

		/* 
		 * Ex: You have blocks 0.4 feet wide 
		 * and want to fit in a box 3.5 feet wide.
		 * How many blocks will fit in this box?
		 */
		System.out.println((int)(3.4/0.4)); // �׳� ���� 8.75�����µ� integer�� ���̱⿡ integer�� ����������
		System.out.println((int)3.4/0.4); // ������ parenthesis�� �ٸ��� ����� �ٸ�!
		
	
		
		
		
		
	}
}
