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
		System.out.println("num="+num); // 여기서  포인트는 위에서 --num했지만 프린트시 -안되서 나옴
										// 왜 그럴까?
										// tr이 true인 경우 OR로 연결되어 있기에 뒤에 무슨 결과가 나오든 무조건 always true가 나옴 >> 따라서 컴퓨터는 뒤의 결과가 의미 없기에 뒤의 operator를 연산하지 않음!
										// >> 따라서 tr==true시 뒤에꺼 계산 x 하지만 false일 경우 뒤에걸 계산하게 됨!
		// A || B is not equivalent to B || A (because of Short Circuit!)
		// 수학에선 A||B= B||A지만 컴퓨터에선 아님 왜냐하면 앞에게 참이면 뒤에거 연산 x
		System.out.println();
		// A && B is not eqivalent to B&&A
		// 2.
		// true || ?? 
		// false && ?? 
		//>> ?? 들은 실행되지 않음!
		
		if ( tr== true && --num==0) {
			System.out.println("always true");
		}
		System.out.println("num=" +num); 
		// Lesson Point
		
		// 1. 
		//A || B is not equivanlent to B||A   
		//A && B is not eqivalent to B&&A
				
		// 2.Short-Circuit (짧은 순환: 앞에서 끊기는 경우!)
				// true || ?? 
				// false && ?? 
				//>> ?? 들은 실행되지 않음!
	
	
	
	
	
	}
	
	
	
	
	
	
	
}
