package chapter2;

public class _06_Variables {

	public static void main(String[] args) {
		// To use a variable, first declare, and then assign
		
		
		// declare a variable of type int
		int a; 

		// assign the value 1 to the variable a
		a=1; // = is called 'assignment operator':���״�� �����ʿ� �ִ°� ���ʿ� �־���� operator
			 // a equal 1 ��� a gets 1 �̶�� ǥ������ �ܿ�°� �� ����
		// ** this does not mean a is equal to 1
		System.out.println(a);

		// now declare another int variable b and assign it the value a+5
		// ** you can declare and assign in the same line
		int b = a + 5;    // ����: a�� access�ؼ� 1�� �����> 1+5�� 6�� ����> b�� �����ʿ��� ���� ����� ������ 
		                 //�ֳ��ϸ� '='�� �ǹ̴� right side gets left side �̱� ������
		System.out.println(b);


		
		// multiple init an assignment>�������� ������ �ٸ������� initialize�ϴ� ��
		int x=2, y=3, z=4;  // multiple initialization �� , ���
		System.out.println(x+y+z);
		
		int j=5, k=4, l=53;
		System.out.println(j+k-l);
		double r=100, s=2, lopital=45;
		System.out.println(r+s-lopital);
		
		
		
		
		
		


		
		
		
		
		
	}
}
