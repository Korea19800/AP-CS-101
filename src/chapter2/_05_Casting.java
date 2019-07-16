package chapter2;

public class _05_Casting {

	public static void main(String[] args) {
		// casting: type change!
		// passive cast
		System.out.println( 5/2.); // 2뒤에 .0 써주면 컴퓨터는 double은 double끼리 계산해야 하기에 스스로 5를 5.0으로 바꿈>> 이게 passive casting 
		

		
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
		System.out.println((int)(3.4/0.4)); // 그냥 계산시 8.75나오는데 integer가 답이기에 integer로 만들어줘야함
		System.out.println((int)3.4/0.4); // 위에랑 parenthesis만 다른데 결과가 다름!
		
	
		
		
		
		
	}
}
