package chapter4;

public class _03_NRepeats {

	public static void main(String[] args) {
		
		String str = "Hello World";
		int num = 10;
		
		// print "Hello World" num times.
		for (int a=1; a<= num; a++) {
			System.out.println(a+":"+str);
		} 
		// ��ǻ�ʹ� 0���� ���⿡ for ���� ���� initialize�ҽ� 0���� �ϴ½��� �鿩��!
		for (int a=0; a<num; a++) {
			System.out.println(a+":"+str);
		} 
		
		
		
        
	}

}