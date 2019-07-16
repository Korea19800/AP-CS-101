/* 
 * Write a method that doubles the value of a given integer
 */
package chapter5;

public class _03_ReturnValueProb {

	public static void main(String[] args) {
		
		int num = 10;
		
		// What would this print?
		System.out.print(" 2 times "+num+" = ");
		failedMethod(num);
		System.out.println(num);
		
		// Would this work?
		System.out.print(" 2 times "+num+" = ");
		num = num*2;
		System.out.println(num);
		// it does, but this is not a method.
		
	} 
	/* 0. ReturnValue Prob is related to Variable Scope
	 * 1. Main's num and Method area's num is different variable!! 
	 * Mains affect main area, whereas the other one affects only out of main. 
	 * 2. 즉, 위의 경우 밑의 num은 10*2로 20의 값을 갖지만 print할때 num은 main의 num에만 영향을 받기에
	 * 답이 20이 아닌 10이 나오는 거임!! 
	 * +void는 아무것도 돌려주지 않는 method>> 따라서 num이 밑에서 20이더라도 위로 올라오지 x 
	 */
	
	public static void failedMethod(int num) {
		num = num * 2;
	}
}

//
