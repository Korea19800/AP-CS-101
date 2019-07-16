/* 
 * Using a for-loop, write a program that generates the sequence:
 * 
 
come
here
come
here
come
here
come
here
come
here
 
 * 
 */
package chapter4;

public class _05_ForLoopError {

	public static void main(String[] args) {

		// see if you can spot the error on this one:
        for (int i = 1; i <= 5; i++)
            System.out.println("come"); 
        	System.out.println("here"); 
        	
        	System.out.println("---------");
       // correct answer:
        	for (int i = 1; i <= 5; i++) {
                System.out.println("come"); 
            	System.out.println("here"); 
        	}
        	// 정답은 {}써야됨. {}가 없다면 반복은 하지만 ;전까지 있는 method만 반복하게 됨! 
        	//>> {}은 여러가지 method를 묶어주는 역할!
        	
        	//CAUTION
        	System.out.println("---CAUTION---");
        	for (int i = 1; i <= 5; i++); {
                System.out.println("come"); 
            	System.out.println("here"); 
        	} // ;의 기능은 ;까지 그 줄의 기능을 끊는 거임. >> 따라서 loop의 기능이 살아지고 그냥 1번씩 프린트됨!
	}

}