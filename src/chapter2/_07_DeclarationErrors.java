package chapter2;

public class _07_DeclarationErrors {

	public static void main(String[] args) {
		// Declare the same variable twice : ERROR!
		int a=1;
		// some long code ..
		
		
		//...
				
//  	int a= a+1; >> �ι� ���ǽ� duplicate local variable�̶�� �ַ� ���		
 		int b = a+1;
 		System.out.println(b);
 		
		System.out.println( a );
		
		// �� ���� 08 increment, decrement �����Ѱ�
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
