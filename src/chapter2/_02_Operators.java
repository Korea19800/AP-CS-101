package chapter2;

public class _02_Operators {

	public static void main(String[] args) {
		// arithmetic operators + - * / %
		System.out.println("1+1="+(1+1)); // string과 variable 동시에 쓴거
		System.out.println("5-2="+(5-2));
		System.out.println("2*3="+(2*3));
		System.out.println("10/2=" + (10/2)); 
		
		System.out.println("5+3="+(5+3));
		System.out.println("5-3="+(5-3));
		System.out.println("5*3="+5*3);
		System.out.println("5/1="+5/1);
		
		
		
		
		// how integer division is handled ** also try 101/10 and 109/10
		System.out.println("11/2=" + (11/2)); // division은 JAVA가 정확히지 않음. should be 5.5 하지만 컴퓨터는 여기있는 수들을 integer로만 인식함.
		System.out.println("101/10="+101/10);
		System.out.println("109/10="+109/10);
		
		// decimals => integer: floor() 버림이 일어남, 5.9=>5 
		System.out.println("101/10="+101.0/10.0);
		System.out.println("109/10="+109.0/10);		
		// how do you get the right answer?
		System.out.println("11/2=" + (11.0/2.0)); //컴퓨터가 11.0의 data type을 double로 인식하기에 계산 정확하게 나옴
												// >> 따라서 data type은 엄청 중요!

		// special cases: division by zero
			//0으로 divide하면 error뜸, 주의하기 >>  //		System.out.println(10/0);
		
		
		// modulus: %
		System.out.println("11/2="+ (11/2)); 
		System.out.println("11%2="+ (11%2)); // 11=2*5+ 1 (modulus는 remainder나타냄)
		System.out.println("50%9="+50%9);
		// quotient and remainder

		// also try 10.5%2.1
		System.out.println("10.5%2.1="+ (10.5%2.1));
		// roundoff error => makes double division inaccurate (Java에서 modulus는 실수 계산이 부정확함) 
		

	}
}
