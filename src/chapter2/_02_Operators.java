package chapter2;

public class _02_Operators {

	public static void main(String[] args) {
		// arithmetic operators + - * / %
		System.out.println("1+1="+(1+1)); // string�� variable ���ÿ� ����
		System.out.println("5-2="+(5-2));
		System.out.println("2*3="+(2*3));
		System.out.println("10/2=" + (10/2)); 
		
		System.out.println("5+3="+(5+3));
		System.out.println("5-3="+(5-3));
		System.out.println("5*3="+5*3);
		System.out.println("5/1="+5/1);
		
		
		
		
		// how integer division is handled ** also try 101/10 and 109/10
		System.out.println("11/2=" + (11/2)); // division�� JAVA�� ��Ȯ���� ����. should be 5.5 ������ ��ǻ�ʹ� �����ִ� ������ integer�θ� �ν���.
		System.out.println("101/10="+101/10);
		System.out.println("109/10="+109/10);
		
		// decimals => integer: floor() ������ �Ͼ, 5.9=>5 
		System.out.println("101/10="+101.0/10.0);
		System.out.println("109/10="+109.0/10);		
		// how do you get the right answer?
		System.out.println("11/2=" + (11.0/2.0)); //��ǻ�Ͱ� 11.0�� data type�� double�� �ν��ϱ⿡ ��� ��Ȯ�ϰ� ����
												// >> ���� data type�� ��û �߿�!

		// special cases: division by zero
			//0���� divide�ϸ� error��, �����ϱ� >>  //		System.out.println(10/0);
		
		
		// modulus: %
		System.out.println("11/2="+ (11/2)); 
		System.out.println("11%2="+ (11%2)); // 11=2*5+ 1 (modulus�� remainder��Ÿ��)
		System.out.println("50%9="+50%9);
		// quotient and remainder

		// also try 10.5%2.1
		System.out.println("10.5%2.1="+ (10.5%2.1));
		// roundoff error => makes double division inaccurate (Java���� modulus�� �Ǽ� ����� ����Ȯ��) 
		

	}
}
