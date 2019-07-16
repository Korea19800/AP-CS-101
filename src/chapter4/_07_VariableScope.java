package chapter4;

public class _07_VariableScope {

	public static void main(String[] args) {

        // Suppose we want to print the value of the loop counter i
        // after the loop has concluded.
        // would the following code do it?
        /* 
         // scope of i is the for loop only
        for (int i = 1; i <= 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("i = "+i); 
		*/
		
		// so what is the correct way to do it?
		int i; // scope of i is now the whole main 
        for ( i = 1; i <= 5; i++) {
            System.out.print(i+" ");
        }
        System.out.println();
        System.out.println("i = "+i); 
        // Q �� i���� 5�� �ƴ϶� 6�� ���ñ�?
        // A for loop�ȿ� i++ǥ�ô� 5�� 6���� ������ִµ� �̶� for loop�ȿ����� 5���� �� �����.+
        //for loop�ȿ����� 6�� ��µ��� �ʰ� �Ǵµ� for loop�ۿ� ���ͼ� i�� ����Ʈ�ϸ� 6�� ������ ��.
        // loop counter i is visible outside the for loop now.
		
	}

}