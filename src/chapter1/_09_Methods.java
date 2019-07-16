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
        //여기선 method를 만드는 방법을 배운다
    	
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
    // other methods, (method는 main밖에 class안에 !)
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
    
    
    
    

    
    
    
    
    
    
    




    	
    	
    	
    	
    	
    	
    	
    	
    	