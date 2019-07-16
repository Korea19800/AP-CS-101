package chapter4;

public class _04_PrintOdd {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 31;
		
		/*
		 * write a routine that prints all the odd numbers between a and b inclusive.
		 */
		for( int i=a; i<=b; i++) {
			if(i%2==1) {
				System.out.println(i);

			}
		}

		
        
	}

}