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
		}  // �ܼ� �ݺ��� loop variable�� ����!
		   // �ֳ��ϸ� k=1 �� 5���� �����Ƿ� *�� ���> �� �Ŀ� k=2�� 5���� �����Ƿ� �Ȱ��� ���
		// >> ���� �׳� for���� test�� true�̸� {}���� ���� ��µǴ� ����!
		
		
		
		
		

        
	}

}