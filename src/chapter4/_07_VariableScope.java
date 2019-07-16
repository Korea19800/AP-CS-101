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
        // Q 왜 i값이 5가 아니라 6이 나올까?
        // A for loop안에 i++표시는 5를 6으로 만들어주는데 이때 for loop안에서는 5까지 만 출력함.+
        //for loop안에서는 6은 출력되지 않게 되는데 for loop밖에 나와서 i를 프린트하면 6이 나오게 됨.
        // loop counter i is visible outside the for loop now.
		
	}

}