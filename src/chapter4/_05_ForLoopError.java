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
        	// ������ {}��ߵ�. {}�� ���ٸ� �ݺ��� ������ ;������ �ִ� method�� �ݺ��ϰ� ��! 
        	//>> {}�� �������� method�� �����ִ� ����!
        	
        	//CAUTION
        	System.out.println("---CAUTION---");
        	for (int i = 1; i <= 5; i++); {
                System.out.println("come"); 
            	System.out.println("here"); 
        	} // ;�� ����� ;���� �� ���� ����� ���� ����. >> ���� loop�� ����� ������� �׳� 1���� ����Ʈ��!
	}

}