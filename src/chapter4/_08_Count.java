package chapter4;

public class _08_Count {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		
		/*
		 * write a routine that counts how many numbers have a remainder of 2 when divided by 5
		 * between a and b

		 */
		//COUNT는 엄청 자주 쓰이는 중요한 알고리즘임
		int count= 0; // count 하는 경우는 반드시 for loop밖에서 initialize해주기!!

		for (int i=a; i<=b; i++) {
			if ( i%5==2) {
				count++;
				System.out.println(i); // remainder가 2인 숫자를 알려줌!
	}
		}
		//Q1 여기서 Variable scope에서 배웠듯이 i의 값을 알고 싶다면?
		//A for 밖에서 int i를 정의해주고, for 밖으로 System.out을 뺀후 출력하기!
		//Q2 System.out.println(i)를 1>for밖에 놓을때,2>if안에 넣을때 3> if와 for사이에 넣을 때 나오는 값이 다르다
		// 왜 다른걸까?
		//A:
		System.out.println(count);
        
	}

}