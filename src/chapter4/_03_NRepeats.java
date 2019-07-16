package chapter4;

public class _03_NRepeats {

	public static void main(String[] args) {
		
		String str = "Hello World";
		int num = 10;
		
		// print "Hello World" num times.
		for (int a=1; a<= num; a++) {
			System.out.println(a+":"+str);
		} 
		// 컴퓨터는 0부터 세기에 for 안의 변수 initialize할시 0으로 하는습관 들여라!
		for (int a=0; a<num; a++) {
			System.out.println(a+":"+str);
		} 
		
		
		
        
	}

}