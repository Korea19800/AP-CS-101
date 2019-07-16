package chapter4;

public class _01_ForLoopIntro {

	public static void main(String[] args) {
        //System.out.println(1 + "^2 = " + (1 * 1));
        //System.out.println(2 + "^2 = " + (2 * 2));
        //System.out.println(3 + "^2 = " + (3 * 3));
        //System.out.println(4 + "^2 = " + (4 * 4));
        //System.out.println(5 + "^2 = " + (5 * 5));
        
        // Q �̰� 100�� �������� ���� �밡�� ���� �ʴ� �����?
        
        // now turn the above into a for loop
        
        for(int i=1; i<=10; i++ ) {
            System.out.println(i + "^2 = " + (i * i));
        }
        


        
        // The For Loop execution sequence:
        // 	for ( INIT ; TEST ; INCREMENT ) {
        //		BODY
		//	}
        // 1. INIT (just once) ex> i�� ���� �ѹ��� �����ָ� ��.
        // 2. TEST			  ex> i�� 1�̴� �̰� test������ �־����� true�̸� body�� execute��
        // 3-1. If TEST is true, execute BODY, then INCREMENT, and go to step 2.
        // 3-2. If TEST is false, exit the for loop.
   
	}

}