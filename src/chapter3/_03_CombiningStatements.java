package chapter3;

public class _03_CombiningStatements {

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
		
		int tempC = -10;
		
		/*
		 * water is liquid in temperatures of celcius 0~100, 
		 * solid when below 
		 * gas when above
		 * write a routine that prints the state of water given temperature tempC
		 */ 
		String state = "";
		if( tempC >=100) {
			state = "gas";
		}
		if(0<=tempC && tempC<100) { // 0<= tempC<100이라 쓰면 안됨. 순차적으로 계산하기에 0<=tempC가 true로 계산되기에 이후에 boolean과 100의 크기를 비교할 수 없음!
			state ="liquid";
		}
		if(tempC<0) {
			state= "solid";
		}
		System.out.println("At"+ tempC+" degreesC, water is "+state);
		// && ==> AND: true only if both are true
		// || ==> OR: false only if both are false
		// ! ==> NOT: true => false , false=> true
				
		// De Morgan's Laws 
		// !(p or q) = !p and !q
		String k = "KJ THE BEST";
		System.out.println(k); 
		
		
	}
	
}
