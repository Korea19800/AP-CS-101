package chapter4;

public class _01_ForLoopIntro {

	public static void main(String[] args) {
        //System.out.println(1 + "^2 = " + (1 * 1));
        //System.out.println(2 + "^2 = " + (2 * 2));
        //System.out.println(3 + "^2 = " + (3 * 3));
        //System.out.println(4 + "^2 = " + (4 * 4));
        //System.out.println(5 + "^2 = " + (5 * 5));
        
        // Q 이걸 100의 제곱까지 쓸때 노가다 하지 않는 방법은?
        
        // now turn the above into a for loop
        
        for(int i=1; i<=10; i++ ) {
            System.out.println(i + "^2 = " + (i * i));
        }
        


        
        // The For Loop execution sequence:
        // 	for ( INIT ; TEST ; INCREMENT ) {
        //		BODY
		//	}
        // 1. INIT (just once) ex> i의 값은 한번만 정해주면 됨.
        // 2. TEST			  ex> i가 1이다 이걸 test구문에 넣었을떄 true이면 body를 execute함
        // 3-1. If TEST is true, execute BODY, then INCREMENT, and go to step 2.
        // 3-2. If TEST is false, exit the for loop.
   
	}

}