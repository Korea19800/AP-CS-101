package chapter2;

public class _03_Modulo {

	public static void main(String[] args) {
		
		double z=4;
		int x=3;
		// 1. testing if a number is even or odd
		//if odd print 1, if even, print0
		System.out.println(z%2); 
		System.out.println(x%2);  // >> modulo operator 통해 odd even판별가능
		

		int k=12345;
		int a=45612;
		// 2. finding the last 3 digits of a number
		System.out.println(k%1000);		
		System.out.println(a%1000);
		// 3. finding the ones digit of a number
		System.out.println(k%10);
		System.out.println(a%10);

		// 4. finding the tens digit of a number
		System.out.println(k/10 %10);
		System.out.println((k%100-k%10)/10); // 이렇게 하면 나중에 100digit구할 때 복잡해짐!
		System.out.println(a/10 %10);
		// 5. finding the hundreds digit of a number
		System.out.println(k/100 %10);
		System.out.println(a/100 %10);



	}
}
