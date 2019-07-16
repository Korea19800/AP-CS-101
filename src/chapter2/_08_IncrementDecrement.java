package chapter2;

public class _08_IncrementDecrement {

	public static void main(String[] args) {

		int a = 1;
		System.out.println( a );
		// increase a by 1
		a= a+1; // programming에선 '=' 을 같다라고 보지 말기! > =이 assignment operator라는거 기억하기!
		// int a=a+1 쓰면 error
		System.out.println(a);
		


		System.out.println( a );
		// decrease a by 1
		a=a-1; 
		System.out.println( a );
		

		
		System.out.println("----------------------");
		// you can also do these:
		a += 10;  // a를 increase by 10, a= a+10이랑 완전히 같은 표현
		System.out.println(a);
		a *=10;
		System.out.println(a);
		a /=10;
		System.out.println(a);
	    a -= 10;
		System.out.println(a);
		
		// There is also %=  
		
	    System.out.println("----------------------");
		
		// fast increment: 수의 증가
		a++ ;  // a++ 한 다음 print a치면 a가 1씩 늘어남 
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
    	// >> 이부분부터  인강 다시 듣기!!!
		--a ;
    	System.out.println(a);
    	
		/* 
		 * a puzzle: what will be the value of z after this?
		 */
		int x = 9, y=11;
		int z = x++ * y--; // 100! >> 이런 표현은  매우 Discouraged in JAVA!!
		System.out.println(z);
		// a--, --a의 차이 :a--는 assign한 후 에 답이 나오고 --a는 assign전에 답이 나옴.
		System.out.println("x="+x);
		System.out.println("y="+y);
		
		int xx=9, yy=11;
		int zz=++xx*--yy; System.out.println(zz);
		
		
	}
}
