/* 
 * Using nested for-loops, print the following:

* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

* * * 
* * * 
* * * 
* * * 
* * * 

* * * * * 
* * * * * 
* * * * * 

 * 
 */
package chapter4;

public class _09_NestedForLoop {

	public static void main(String[] args) {
		
		// five rows of five stars - incorrect(1)
		// what would this do?
		
		System.out.println(); 
 
		
		
		System.out.println(); 
		// five rows of five stars - incorrect(2)
		// what would this do?


		
		
		System.out.println(); 
		
		// five rows of five stars
		// print and println control
		
			for( int i=1; i<=5;i++) { // controls number of rows
			
			for(int j=1; j<=5; j++) { // controls number of columns
				System.out.print("* ");
			}
			
			System.out.println(); // 별들을 띄워주기 위한 기능! >> 안의 for loop밖에 써야됨!
		}

		
		
			System.out.println();
		// print five rows of three stars
			for( int i=1; i<=5;i++) { // controls number of rows
				
				for(int j=1; j<=3; j++) { // controls number of columns
					System.out.print("* ");
				}
				
				System.out.println(); // 별들을 띄워주기 위한 기능! >> 안의 for loop밖에 써야됨!
			}	

		
		
		
		System.out.println();
		// print three rows of five stars
			for( int i=1; i<=3;i++) { // controls number of rows
				
				for(int j=1; j<=5; j++) { // controls number of columns
					System.out.print("* ");
				}
				
				System.out.println(); // 별들을 띄워주기 위한 기능! >> 안의 for loop밖에 써야됨!
			}

		
		
		
		
		
	}

}