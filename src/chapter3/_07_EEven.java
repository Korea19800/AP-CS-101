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
		
		// hint: a or b or c is odd. >> a또는 b또는 c중 적어도 1개가 odd여야 EEVEn나옴
		//+ 8가지 경우의 수 중 EEVEN은 3가지임. 
		if( a%2==1 && b%2==0 && c%2==0) {
			System.out.println("EEVEN!");
		} else if( a%2==0 && b%2==1 && c%2==0) {
			System.out.println("EEVEN!");			
		} else if( a%2==0 && b%2==0 && c%2==1) {
			System.out.println("EEVEN!");	
			
		} else {
			System.out.println("burp!");
		}
		// 이 다음 놈은 간단화 시킨 코드>> OR로 묶는 경우
		/** 주의 사항!! 
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
