/* 
 * Write a program that draws this:
 * 
    /\
   /  \
  /    \
 /      \
/        \
----------
|        |
|        |
|        |
+--------+
|        |
|  +--+  |
|  |  |  |
+--+--+--+


    /\
   /  \
  /    \
 /      \
/        \
----------
|        |
|        |
|        |
+--------+
|        |
|        |
|        |
+--------+
|        |
|  +--+  |
|  |  |  |
+--+--+--+


    /\
   /  \
  /    \
 /      \
/        \
----------
|        |
|        |
|        |
+--------+
|        |
|        |
|        |
+--------+
|        |
|        |
|        |
+--------+
|        |
|  +--+  |
|  |  |  |
+--+--+--+

** use methods this time to simplify the process.

 */
package chapter1;

public class _09_Methods {
    public static void main(String[] args) {
    	    	
    	// use your completed code from _06_DrawingFiguresModular.java
        //���⼱ method�� ����� ����� ����
    	
    	roof(); 
    	floor();
    	gfloor();
    	System.out.println();
    	System.out.println();
    	roof(); 
    	floor();
    	floor();
    	gfloor();
    	System.out.println();
    	System.out.println();
    	roof();  
    	floor();
    	floor();
    	floor();
    	gfloor();
    	System.out.println();
    	System.out.println();
    	Kangjin(); 
    	
    }
    // other methods, (method�� main�ۿ� class�ȿ� !)
    // class variables..

    public static void roof() {
    	System.out.println("    /\\");    	
    	System.out.println("   /  \\");
    	System.out.println("  /    \\");
    	System.out.println(" /      \\");
    	System.out.println("/        \\"); 	
    	System.out.println("----------");
    }
    
    public static void floor() {
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("+--------+");
    }
    
    public static void gfloor() {
    	System.out.println("|        |");
    	System.out.println("|  +--+  |");
    	System.out.println("|  |  |  |");
    	System.out.println("+--+--+--+");
    }
    
    
    public static void Kangjin() { 
        System.out.println("KJ");
    	System.out.println("will be the");
    	System.out.println("best progammer ever");
    }  
}
    
    
    
    

    
    
    
    
    
    
    




    	
    	
    	
    	
    	
    	
    	
    	
    	