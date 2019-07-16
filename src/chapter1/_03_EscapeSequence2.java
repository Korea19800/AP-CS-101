 /*
 * More escape sequences
 * - get your program to print : How do you print "\Jason/"?
 */
package chapter1;

public class _03_EscapeSequence2 {

	public static void main(String[] args) {
		
		
		System.out.println("How do you print \"\\Jason/\"? ");  
		// \를 print하기 위해선 \\ 로 쓰면 됨!(왜냐하면 별도의 입력이 없다면 컴퓨터는 \를 escape sequence로 인식하기 때문에
		System.out.println("My name is \"\\KangJin/\"? ");
		
		// escape sequences: \b \t \n \f \r    \" \' \\
		System.out.println("Hello \"\\KangJin/?\""); 
		
	}

}
