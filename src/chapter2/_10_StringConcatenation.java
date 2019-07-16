package chapter2;

public class _10_StringConcatenation {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World!";

		System.out.println( str1+str2);	//+�� string���� ������ ��. 
										//string���� �϶� '+'�� �ǹ̴� ���� ���� ����>>Concatenation 
		
		// funny example:
		System.out.println("1+1="+1+1); // ���� 11�� ����?? >> JAVA�� ó���� String�� �ν��ϱ⿡ 
										//string���� +�� Concatenationó�� ���Ǿ 2�� �ƴ� 11�� �Ǵ°�
		
		System.out.println("1+1=" +(1+1)); // ()�� �̿��� String���� ���� int�� �ν��ϰ� ����� '���ϱ⸦ ���� �ϰ� ��'
		
		// why would the following work?
		// ** difference between print and println
		System.out.print("1+1="); 
		System.out.print(1+1);      // print�� println�� ����: println�� ���� 1ĭ �� ���ܼ� ���� �ٲ�����,
									                     //print�� ���� �ٲ��� ����
	
		System.out.print("Hello");
		System.out.println("World");
		System.out.println("Hello");
		System.out.println("World");
	}
}
