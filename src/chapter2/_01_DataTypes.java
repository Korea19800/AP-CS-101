package chapter2;

public class _01_DataTypes {

	public static void main(String[] args) {
		// common data types
		// declare => use. You MUST declare a variable before use.
		// DATA TYPE: 4 primitives: int= integer double char boolean
		// Operators: * / % + -
		
		int i = 2;// declare(정의) & initialize(초기화) >> variable을 쓸려면 declare해줘야함.
		// i는 variable name int는 variable type  2는 initialize
		//int=2.66 쓰면 error뜸 ,double에 6써도 상관x integer는 double에 속하는 거니까
		
		double k= 5.16428; 
		double d = 3.1415926; 
		char c= 'c'; //여기엔 single quote'써야됨. char는 xyz같이 여러개의 character담을 수 없음. x만 써야됨
		boolean b= false; // true or false만 쓸수 있음.
		
		String str = "hello world"; // 이렇게 긴놈은 string이라 불림. string은 검은색 또는 파랑색, 
		
		System.out.println(d);
		System.out.println(b);
		System.out.println(2*3.14);
		System.out.println(i*d);
		System.out.println(i);
		System.out.println("i"); /*위와 아래는 동일한 i임 하지만 위는 variable, 아래는 "가 있기에 string처리됨 여기서 우리는 variable의 기능이 값을 불러오는데 사용될 수 있따는 걸 알수 있음 */
		System.out.println("b");
		System.out.println(b);
		System.out.println("2*5="+ 2*5);
		
		// literals, expressions, and evaluation


		
		
	}

}
