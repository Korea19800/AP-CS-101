package chapter6;

public class _06_TraversalError {

	public static void main(String[] args) {

		String str = "hello";
		
		// can you figure out what will happen if you run this?
		
		for ( int i = 0; i<= str.length(); i++ ) {
			System.out.print(str.substring(i, i+1)+"*");
		}
		
	}

}
