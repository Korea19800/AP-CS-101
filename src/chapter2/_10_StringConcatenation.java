package chapter2;

public class _10_StringConcatenation {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World!";

		System.out.println( str1+str2);	//+는 string에도 적용이 됨. 
										//string끼리 일때 '+'의 의미는 둘을 갖다 붙임>>Concatenation 
		
		// funny example:
		System.out.println("1+1="+1+1); // 답이 11이 나옴?? >> JAVA가 처음에 String을 인식하기에 
										//string뒤의 +가 Concatenation처럼 사용되어서 2가 아닌 11이 되는거
		
		System.out.println("1+1=" +(1+1)); // ()를 이용해 String보다 먼저 int를 인식하게 만들면 '더하기를 먼저 하게 됨'
		
		// why would the following work?
		// ** difference between print and println
		System.out.print("1+1="); 
		System.out.print(1+1);      // print와 println의 차이: println은 줄이 1칸 더 생겨서 줄이 바뀌지만,
									                     //print는 줄이 바뀌지 않음
	
		System.out.print("Hello");
		System.out.println("World");
		System.out.println("Hello");
		System.out.println("World");
	}
}
