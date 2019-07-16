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
    	// �� Lesson�� point: �ڷ��� ������ ã���� �ݺ��ϴ� �� ���� �� ���� 
    	// �ڵ��� �Ҷ� DATA Structure�� �ݺ��Ǵ°� ���δٸ� �ִ��� ������ pasting the code�ؼ� �ð� �Ƴ���)
    	// ������ print�ϰ� ������ System.out.print(); 
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



