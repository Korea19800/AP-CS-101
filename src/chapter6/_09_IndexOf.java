package chapter6;

public class _09_IndexOf {

	public static void main(String[] args) {

		String str = "abcabcabc";
		String find = "bc";
		int index = 0;
		
		// string methods: indexOf()
		// usage: object.method()
		// indexOf(str) : find from 0
		// indexOf(str,index) : find from index

		
		// 1. find first occurrence of find : should be 1
		index = 0;
		System.out.println(find + " occurs at index "+ index);
		
		
		// 2. find second and third occurrences of find : should be 4 and 7
		index = 0;
		System.out.println(find + " occurs at index "+ index);
		index = 0;
		System.out.println(find + " occurs at index "+ index);
		
		
		// 3. try searching for occurrences of "xy" (not there) : should be -1
		index = 0;
		System.out.println("xy" + " occurs at index "+ index);


	}
	


}
