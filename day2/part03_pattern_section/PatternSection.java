package day2.part03_pattern_section;

public class PatternSection {

    public static final int SIZE = 3;

    public static void main(String[] args) {
        // Call each method below in this order:
        printEdge();
        printDiamondTop();
        printDiamondBottom();
        printEdge();
    }

    // Print the edge line that fits the width for SIZE.
    // Format: + followed by repeating "=*" and ending with +
    // Example for SIZE=2: +=*=*=*=*+
    public static void printEdge() {
        System.out.print("+");
        for (int i = 0; i < SIZE * 2; i++) {
            System.out.print("=*");
        }
        System.out.print("+");
        System.out.println();
    }

    // Print the top half of the “double-diamond” section.
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots decrease while "/\" pairs increase, then dots again
    // - use SIZE in all loop bounds (no magic numbers except 0/1)
    public static void printDiamondTop() {

        // loop through the total rows in the top half of the diamond 
        // we know that when SIZE = 3, total rows is 6

        for (int row = 0; row < SIZE * 2; row++) {
            
            System.out.print("|");                //begin the row with a pipe
            
            int dots = (SIZE * 2 - 1) - row;
            
            for (int i = 0; i < dots; i++) {        //print leading dots .
                System.out.print(".");
                
                }

            int triangles = row + 1;
            
            for (int i = 0; i < triangles; i++){    //print triangles /\
                
                System.out.print("/\\");
                
                }
                
            for (int i = 0; i < dots; i++) {        //print trailing dots .
                System.out.print(".");
                }

            
            System.out.print("|");               // end the row with a pipe and a new line
            System.out.println();
            }

    }

    // Print the bottom half (mirror/inverse of the top half).
    // Requirements:
    // - total rows: SIZE * 2
    // - each row starts/ends with '|'
    // - inside, dots increase while "\/" pairs decrease, then dots again
    // - use SIZE in all loop bounds
    public static void printDiamondBottom() {
        for (int row = 0; row < SIZE * 2; row++) {
            
            System.out.print("|"); 

            int dots = row;                       

            for (int i = 0; i < dots; i++) {        //print leading dots .
                System.out.print(".");
            }

            int triangles = SIZE * 2 - row;      
        
            for (int i = 0; i < triangles; i++){    //print triangles \/
                System.out.print("\\/");
            }
            
            for (int i = 0; i < dots; i++) {        //print trailing dots .
                System.out.print(".");
            }

            System.out.print("|");               // end the row with a pipe and a new line
            System.out.println();
        }
    }
}
// +=*=*=*=*=*=*+
// |...../\.....|
// |..../\/\....|
// |.../\/\/\...|
// |../\/\/\/\..|
// |./\/\/\/\/\.|
// |/\/\/\/\/\/\|
// |\/\/\/\/\/\/|
// |.\/\/\/\/\/.|
// |..\/\/\/\/..|
// |...\/\/\/...|
// |....\/\/....|
// |.....\/.....|
// +=*=*=*=*=*=*+