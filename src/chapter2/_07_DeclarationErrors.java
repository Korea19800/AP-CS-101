package chapter2;

public class _07_DeclarationErrors {

	public static void main(String[] args) {
		// Declare the same variable twice : ERROR!
		int a=1;
		// some long code ..
		
		
		//...
				
//  	int a= a+1; >> 두번 정의시 duplicate local variable이라는 애러 뜬다		
 		int b = a+1;
 		System.out.println(b);
 		
		System.out.println( a );
		
		// 이 밑은 08 increment, decrement 연습한거
		int z=5 ;
		System.out.println(z);
		z=z+5; System.out.println(z);
		z-=5; System.out.println(z);
		z*=5; System.out.println(z);
		z/=5; System.out.println(z);
		z=z*50; System.out.println(z);
		z%=7; System.out.println(z);
		z++; System.out.println(z);
		z--; System.out.println(z);
		
		int kj=5;
		--kj; System.out.println(kj);
		
		
		
	}
}
