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

** note there are two empty lines separating houses

 */
package chapter1;

public class _06_DrawingFiguresModular {
    public static void main(String[] args) {
    	// 이 Lesson의 point: 자료의 패턴을 찾으면 반복하는 걸 줄일 수 있음 
    	// 코딩을 할때 DATA Structure가 반복되는게 보인다면 최대한 여러번 pasting the code해서 시간 아끼기)
    	// 빈줄을 print하고 싶으면 System.out.print(); 
    	System.out.println("    /\\");    	
    	System.out.println("   /  \\");
    	System.out.println("  /    \\");
    	System.out.println(" /      \\");
    	System.out.println("/        \\");
    	System.out.println("----------");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("+--------+");
    	System.out.println("|        |");
    	System.out.println("|  +--+  |");
    	System.out.println("|  |  |  |");
    	System.out.println("+--+--+--+");
     	System.out.println();
     	System.out.println();
    	System.out.println("    /\\");    	
    	System.out.println("   /  \\");
    	System.out.println("  /    \\");
    	System.out.println(" /      \\");
    	System.out.println("/        \\");
    	System.out.println("----------");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("+--------+");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("+--------+");
    	System.out.println("|        |");
    	System.out.println("|  +--+  |");
    	System.out.println("|  |  |  |");
    	System.out.println("+--+--+--+");
     	System.out.println();
     	System.out.println();
    	
        System.out.println("    /\\");    	
    	System.out.println("   /  \\");
    	System.out.println("  /    \\");
    	System.out.println(" /      \\");
    	System.out.println("/        \\");
    	System.out.println("----------");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("+--------+");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("+--------+");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("+--------+");
    	System.out.println("|        |");
    	System.out.println("|  +--+  |");
    	System.out.println("|  |  |  |");
    	System.out.println("+--+--+--+");
     	System.out.println("");
     	System.out.println("");
    	floor();
    	floor();
    	wall();
    	door();
    	door();
        
    }
    public static void floor() {  
    	System.out.println("    /\\");    	
    	System.out.println("   /  \\");
    	System.out.println("  /    \\");
    	System.out.println(" /      \\");
    	System.out.println("/        \\");
    }
    
    public static void wall() {
    	System.out.println("----------");
    	System.out.println("|        |");
    	System.out.println("|        |");
    	System.out.println("|        |");
    
    
    }
    public static void door() {
    	System.out.println("+--------+");
    	System.out.println("|        |");
    	System.out.println("|  +--+  |");
    	System.out.println("|  |  |  |");
    	System.out.println("+--+--+--+");
    
    
    }
    
    
    
    
    
}



