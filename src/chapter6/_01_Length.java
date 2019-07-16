package chapter6;

public class _01_Length { 

	public static void main(String[] args) {

		String str = "abcdefghij";
		
		
		// 1. Strings are objects with primitive tendencies. 
		// String
		// 		- has methods
		// 		- passed by value(copied, not referenced)
		
		
		// first of string methods: length()
		// invoking a method: the dot operator!! 
		// usage: object.method()
		
		/* 
		 * write a routine that prints how long str is
		 * ex:
		 * String "abcdefghij" is 10 characters long.
		 */
		System.out.println(str.length());
		System.out.println("String \""+str+"\" is " + str.length()+ " chars long");
		// length shows you String's length
		
		
		
		// note: you can also do this:
		// "abcd".length()
		System.out.println("String \""+"string"+"\" is " + "string".length()+ " chars long");
		// length앞의 String의 길이를 바로 잼
		
		System.out.println("GITHUB");
	}

}
