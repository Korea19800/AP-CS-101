 package chapter3;

public class _01_If {

	public static void main(String[] args) {
	
		/*
		 *  if ( Condition, Statement:���� ) { 
		 *       // �� condition�� ���°�  ������ boolean expression��!
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
		if( num >0 ) {      // >= ���� ���� 2���� ���� �� �� ����.
			System.out.println("positive");
		}
		
		if (num<0) {
			System.out.println("negative");
		}
		if( num == 0 ) {	//��ġ�� �񱳽ÿ� =���� ==�� ���
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
	
		
	


