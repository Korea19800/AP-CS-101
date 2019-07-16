/* 
 * Write a method that returns the sum of the first n integers
 */
package chapter5;

public class _10_Sum {

	public static void main(String[] args) {
		
		int n;
		
		n = 3;	// try changing this value
		
		System.out.print(" the sum of the first "+n+" integers is: "+sum(n));
		
	}

	public static int sum(int n) {
		int sum=0;
		
		for(int i=1; i<=n;i++) {
			sum= sum +  i;
		}
		
		
		return sum;
	}
}

// I must r