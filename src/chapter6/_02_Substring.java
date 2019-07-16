package chapter6;

public class _02_Substring { // Real Important in AP CS

	public static void main(String[] args) {

		String str = "abcdefghij"; // 10 chars
		String str2 = "abcdefghijk"; // 11 chars
		
		
		// string methods: substring()
		// usage: object.method()
		// substring(a,b) : chars from index[a,b): includes a but NOT B!!
		//					>>a's index number is 0, b's index number is 1
		// b-a: number of characters in substring  					
		// substring(a): chars form index a to the end of string!
		
		String ans = "";
		// MEMORIZE THESE 8examples!! 공식처럼 암기하기!!
		
		// 1. print the first character of str
		ans = str.substring(0,0+1);// b-a: number of characters in substring  
		System.out.println("1. first character of \"" + str + "\" : " + ans);
	//여기까지 들었음!	
		// 2. print the last character of str
		ans = str.substring( str.length() - 1);// substring(a)가 a부터 끝까지 인거 이용!
		ans = str.substring( str.length()-1, str.length());// change ans...
		System.out.println("2. last character of \"" + str + "\" : " + ans);
		
		// 3. print the first three characters of str
		ans = str.substring(0,0+3);; // change ans...
		System.out.println("3. first three characters of \"" + str + "\" : " + ans);
		
		// 4. print the last three characters of str
		ans =str.substring( str.length()-3);  // change ans...
		System.out.println("4. last three characters of \"" + str + "\" : " + ans);
		
		// 5. print the center character(s) of str(center two, if even number of chars in string)
		ans = str.substring( str.length()/2-1,str.length()/2+1 );  // change ans...
		System.out.println("5. center character(s) of \"" + str + "\" : " + ans);
		
		
		// START FROM HERE
		
		// 6. print the center character(s) of str2(center two, if even number of chars in string)
	 	ans = "???"; // change ans...
		System.out.println("6. center character(s) of \"" + str2 + "\" : " + ans);
		
		// 7. print the first half of str
		ans = "???"; // change ans...
		System.out.println("7. first half of \"" + str + "\" : " + ans);
		
		// 8. print the last half of str
		ans = "???"; // change ans...
		System.out.println("8. last half of \"" + str + "\" : " + ans);
		

	}

}
