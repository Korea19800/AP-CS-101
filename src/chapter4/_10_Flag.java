package chapter4;

public class _10_Flag {

	public static void main(String[] args) {
	
		// print this:
		/*
**************=========================
**************=========================
**************=========================
**************=========================
**************=========================
**************=========================
**************=========================
**************=========================
=======================================
=======================================
=======================================
=======================================
=======================================
=======================================
=======================================
=======================================
=======================================
=======================================
=======================================
		 */
		
		//2���� ������ �����ϸ� nested loop ����Ѵ�
		for(int i=0; i<20; i++) { // rows
			for( int j=0; j<39; j++) { // column
				if(i<8 && j<=15) {
					System.out.print("*"); 
					} else {
						System.out.print("="); 
						}				
			}
			
			System.out.println();

		}
		// LESSON POINT: for loop �ȿ��� if & else�� ����� ��� ����� 
		
		
	}

}