package chapter2;

public class _04_Precedence {

	public static void main(String[] args) {
		// some operators are executed before others
		// what is the output of the following?
		System.out.println( 2 * 3 + 4 );  // is it 10? 14?
		System.out.println( 2 + 3 * 4 );  // is it 20? 14?
		System.out.println(5+5*7);
		
		// PEMDAS 
		// precedence: () => */% => +-
		// when in doubt, use parentheses!

	}
}
