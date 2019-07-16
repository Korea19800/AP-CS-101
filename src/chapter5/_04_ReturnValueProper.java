/* 
 * Write a method that doubles the value of a given integer
 */
package chapter5;

public class _04_ReturnValueProper {

	public static void main(String[] args) {
		
		int num = 10;
		
		// We want the method to work like this:
		int result = successfulMethod(num);
		System.out.println(" 2 times "+num+" = "+result);
		
		// this is a more compact way of doing things
		System.out.println(" 2 times "+num+" = "+betterSuccessfulMethod(num));
		
	}

	/* notice : void ==> int 
	 *1.public static void와 public static int의 차이:
	 *  void는 아무것도 돌려주지 않는 Method, int는 int값을 돌려주는 method임!!
	 *2. return 뒤의 나오는 놈의 값을 돌려줌 
	 *form: public static int..
	 *			int ret=0; >> 항상 이렇게 먼저 static뒤의 type에 따라 정의를 내려주기
	 *			
	 *			return ret;>> return할 variable을 치기
	*/ 
	public static int successfulMethod(int num) {
		int ret = 0; 
		ret = num * 3;
		return ret;
	}
	public static int betterSuccessfulMethod(int num) {
		return num*2;	
	}
}
