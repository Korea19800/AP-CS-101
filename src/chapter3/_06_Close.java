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
		 * / 중심이 10이고 10에서 3떨어져 있으면 warm하다는거 예를 들어 12면 warm!
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
