package chapter3;

public class _06_Close {

	public static void main(String[] args) {
		
		double CENTER = 10;
		double RADIUS = 3;
		
		double num =12;
		
		/* 
		 * if num is within distance RADIUS from CENTER, say "warm",
		 * if num is outside the RADIUS, say "cold"
		 * if num is equal to CENTER, say "spot on!" 
		 * / �߽��� 10�̰� 10���� 3������ ������ warm�ϴٴ°� ���� ��� 12�� warm!
		 */
		
		if(num == CENTER) { 
			System.out.println("\"spot on!\"");
		} else if(CENTER-RADIUS< num && num<CENTER+RADIUS) {
			System.out.println("warm");
		} else {
			System.out.println("cold");
		}
		

		
		
	
	}
	
}
