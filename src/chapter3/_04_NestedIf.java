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
				     } // ���� �ִ� �ֶ� ����� ���� �ٵ� else������ nest�ϸ� ���Ⱑ ��������!
						//���� else if�� ���·� 1�ڷ� �������ִ� ����� ���� �� �� ����!
						// Nested if ������ ��� �ÿ� else if�� �����ϴ°� ���� ���� 
	

			
			
		}
		
		
		
		
	}
	

