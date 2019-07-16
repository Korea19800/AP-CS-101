package chapter2;

public class _08_IncrementDecrement {

	public static void main(String[] args) {

		int a = 1;
		System.out.println( a );
		// increase a by 1
		a= a+1; // programming���� '=' �� ���ٶ�� ���� ����! > =�� assignment operator��°� ����ϱ�!
		// int a=a+1 ���� error
		System.out.println(a);
		


		System.out.println( a );
		// decrease a by 1
		a=a-1; 
		System.out.println( a );
		

		
		System.out.println("----------------------");
		// you can also do these:
		a += 10;  // a�� increase by 10, a= a+10�̶� ������ ���� ǥ��
		System.out.println(a);
		a *=10;
		System.out.println(a);
		a /=10;
		System.out.println(a);
	    a -= 10;
		System.out.println(a);
		
		// There is also %=  
		
	    System.out.println("----------------------");
		
		// fast increment: ���� ����
		a++ ;  // a++ �� ���� print aġ�� a�� 1�� �þ 
		System.out.println(a);
		a++ ;  
		System.out.println(a);
		a++ ;  
		System.out.println(a);
		a++ ;  
		System.out.println(a);
		a-- ;
    	System.out.println(a);
    	

		// ** also legal are: ++a, --a
    	// >> �̺κк���  �ΰ� �ٽ� ���!!!
		--a ;
    	System.out.println(a);
    	
		/* 
		 * a puzzle: what will be the value of z after this?
		 */
		int x = 9, y=11;
		int z = x++ * y--; // 100! >> �̷� ǥ����  �ſ� Discouraged in JAVA!!
		System.out.println(z);
		// a--, --a�� ���� :a--�� assign�� �� �� ���� ������ --a�� assign���� ���� ����.
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int xx=9, yy=11;
		int zz=++xx*--yy; System.out.println(zz);
		
		
	}
}
