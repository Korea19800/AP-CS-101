/* 
 * Using a for-loop, write a program that prints the following:


1 2 3 4 5 
1 2 3 4 5 6 7 8 9 10 
3 4 5 
1 3 5 7 9 
5 4 3 2 1 
* * * * *


 */
package chapter4;

public class _02_SimpleSequence {

	public static void main(String[] args) {
		
		//1 2 3 4 5
		for(int i=1;i<=5; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		//1 2 3 4 5 6 7 8 9 10
		for(int k=1 ; k<=10; k++) {
			System.out.print(k+" ");
		}
		System.out.println();
		for(int k=3 ; k<=5; k++) {
			System.out.print(k+" ");
		}
		System.out.println();
		for(int k=1 ; k<=9; k+=2) {
			System.out.print(k+" ");
		}
		System.out.println();
		for(int k=5 ;k>=1 && k<=5; k--) {
			System.out.print(k+" ");
		}
		System.out.println();
		//  * * * * *
		for(int k=1 ; k<=5; k++) {
			System.out.print("* ");
		}  // 단순 반복은 loop variable과 무관!
		   // 왜냐하면 k=1 이 5보다 작으므로 *을 출력> 그 후에 k=2도 5보다 작으므로 똑같이 출력
		// >> 따라서 그냥 for안의 test가 true이면 {}안의 것이 출력되는 거임!
		
		
		
		
		

        
	}

}