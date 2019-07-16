package chapter3;

public class _05_School {

	public static void main(String[] args) {
		
		// boolean vars store result of evaluating statements. (true/false)
		boolean weekday = false;
		boolean holiday = true;  //여기선 두 개의 변수 boolean을 정의한후 값을 주는 거임; 
		
		/*
		 * you go to school on a weekday, but not on weekends.
		 * you never go to school on a holiday.
		 * write a routine that sets the proper value for gotoSchool
		 */
		boolean gotoSchool ;
		
		if( weekday == true && holiday != true) {  
			gotoSchool = true;
		} else { // weekday!= true || holiday== true
			gotoSchool = false;
		}
				
		

		
		
		
		
		if( gotoSchool ) {
			System.out.println("You need to get up, time to go to school!");
		} else {
			System.out.println("You can sleep more, until mom calls you");
		}
		

		
	}
	
}
