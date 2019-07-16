package chapter2;

public class _06_Variables {

	public static void main(String[] args) {
		// To use a variable, first declare, and then assign
		
		
		// declare a variable of type int
		int a; 

		// assign the value 1 to the variable a
		a=1; // = is called 'assignment operator':말그대로 오른쪽에 있는걸 왼쪽에 넣어라라는 operator
			 // a equal 1 대신 a gets 1 이라는 표현으로 외우는게 더 좋다
		// ** this does not mean a is equal to 1
		System.out.println(a);

		// now declare another int variable b and assign it the value a+5
		// ** you can declare and assign in the same line
		int b = a + 5;    // 과정: a를 access해서 1을 갖고옴> 1+5로 6을 만듬> b가 오른쪽에서 계산된 결과를 가져옴 
		                 //왜냐하면 '='의 의미는 right side gets left side 이기 때문에
		System.out.println(b);


		
		// multiple init an assignment>여러개의 변수를 다른값으로 initialize하는 것
		int x=2, y=3, z=4;  // multiple initialization 시 , 사용
		System.out.println(x+y+z);
		
		int j=5, k=4, l=53;
		System.out.println(j+k-l);
		double r=100, s=2, lopital=45;
		System.out.println(r+s-lopital);
		
		
		
		
		
		


		
		
		
		
		
	}
}
