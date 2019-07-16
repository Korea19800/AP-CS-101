package chapter5;

public class _07_DieRollSimulation {

	public static void main(String[] args) {
		
		/*
		 * write a routine that prints the results of
		 * 20 rolls of a hexahedral die(1~6)
		 */
		int N=20;
		
		for(int i=0; i<N; i++) {
			int roll= (int)( Math.random()*6+1); // Math.random()*(range+1) + offset
			System.out.println("rolling...:"+roll);
		}
		


	}

	
	
	
}
