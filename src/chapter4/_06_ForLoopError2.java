// infinite for loop error

package chapter4;

public class _06_ForLoopError2 {

	public static void main(String[] args) {
		
		// we just wanted to print five rows of five stars
		// what went wrong?
		
		for ( int i = 1; i <= 5 ; i++) {
			for ( int j = 1; i<=5; j++) {
				System.out.print("* "); // change this to println to see what's going on
			}
		}
		
		
		System.out.println();
		// SOlution: 위에선 첫번쨰 loop에서 i=1을 실행> 안쪽 loop으로 들어감
		//>> 그후 j loop에서 j의 범위가 없으므로 안쪽의 for loop에서 영원히 돌림> infinite loop생김
		// i를 j로 바꿔주면 됨됨
		for ( int i = 1; i <= 5 ; i++) {
			for ( int j = 1; j<=5; j++) {
				System.out.print("* "); // change this to println to see what's going on
			}
		}
	}

}