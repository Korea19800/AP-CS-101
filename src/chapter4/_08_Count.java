package chapter4;

public class _08_Count {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 30;
		
		/*
		 * write a routine that counts how many numbers have a remainder of 2 when divided by 5
		 * between a and b

		 */
		//COUNT�� ��û ���� ���̴� �߿��� �˰�����
		int count= 0; // count �ϴ� ���� �ݵ�� for loop�ۿ��� initialize���ֱ�!!

		for (int i=a; i<=b; i++) {
			if ( i%5==2) {
				count++;
				System.out.println(i); // remainder�� 2�� ���ڸ� �˷���!
	}
		}
		//Q1 ���⼭ Variable scope���� ������� i�� ���� �˰� �ʹٸ�?
		//A for �ۿ��� int i�� �������ְ�, for ������ System.out�� ���� ����ϱ�!
		//Q2 System.out.println(i)�� 1>for�ۿ� ������,2>if�ȿ� ������ 3> if�� for���̿� ���� �� ������ ���� �ٸ���
		// �� �ٸ��ɱ�?
		//A:
		System.out.println(count);
        
	}

}