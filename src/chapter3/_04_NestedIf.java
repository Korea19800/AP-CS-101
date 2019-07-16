package chapter3;

public class _04_NestedIf {

	public static void main(String[] args) {
		
		/*
		 *  if ( CONDITION ) { 
		 *  	BODY1
		 *  } else {
		 *  	BODY2
		 *  }
		 *
		 *	==> if CONDITION is true, execute BODY1
		 * 		if not, execute BODY2
		*/ 
		
		int tempC = 170;
		
		/*
		 * water is liquid in temperatures of celcius 0~100, 
		 * solid when below 
		 * gas when above
		 * write a routine that prints the state of water given temperature tempC
		 */
		String state = "";
		if( tempC >=100) {
			state = "gas";
			} else { //tempC<100  
				if(tempC>=0) {
				state ="liquid";
			     } else { // tempC<0
				state= "solid";	
			}	
			}
			System.out.println("At"+ tempC+" degreesC, water is "+state);
		
			
			if( tempC >=100) {
				state = "gas";
				} else if(tempC>=0) {
				state ="liquid";
				     } else { // tempC<0
				state= "solid";
				     } // 위에 있는 애랑 기능은 같음 근데 else만으로 nest하면 보기가 불편해짐!
						//따라서 else if의 형태로 1자로 정리해주는 방식을 택할 수 도 있음!
						// Nested if 구문을 사용 시엔 else if로 정리하는게 보기 좋음 
	

			
			
		}
		
		
		
		
	}
	

