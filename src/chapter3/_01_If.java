 package chapter3;

public class _01_If {

	public static void main(String[] args) {
	
		/*
		 *  if ( Condition, Statement:명제 ) { 
		 *       // 이 condition에 오는건  무조건 boolean expression임!
		 *  	BODY
		 *  }
		 *
		 *	==> if CONDITION is true, execute BODY.
		 * 		if not, do nothing
		*/ 
		int num = 150;
		
		/* write a routine that 
		 * - prints 'positive' if num is positive
		 * - prints 'negative' if num is negative
		 * - prints 'zero' if num is zero
		 */
		if( num >0 ) {      // >= 쓰면 답이 2개가 나올 수 도 있음.
			System.out.println("positive");
		}
		
		if (num<0) {
			System.out.println("negative");
		}
		if( num == 0 ) {	//수치를 비교시엔 =말고 ==을 써라
			System.out.println("zero");
		}
		
		double star= 0;
		
		if( star>100) { 
			System.out.println("King");
		}
		if( 0<star && star<100) {
			System.out.println("Queem");
		}
		if(star==0) { 
			System.out.println("Bishop");
			
			}
		
		int z=0;
		if (z==0); {
			System.out.println("Lion King");
		}
		 
		{
			System.out.println("Tiger King");
		} 
	}
	}
		/* NOTE:
		 * relational operators:
		 * ==		// EQUAL
		 * !=		// NOT equal
		 * <, >
		 * <=, >=
		 * ## relational operators have a lower precedence than arithmetic operators
		 */
	
		
	


