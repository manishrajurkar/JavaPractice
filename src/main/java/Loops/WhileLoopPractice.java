package Loops;

public class WhileLoopPractice {
    public static void main(String[] args) {
        /** Entry -> While loop repeat the block until condition is true
         *  Exit -> only when condition becomes false.
         *  ; will act as a breakpoint
         *  scope is between curly { }
         */

        int value =(int)(Math.random()*10);
        System.out.println("Value--> " +value);
         while (value <=5) {
                 System.out.println(value + " value is in the range");
              break;  //to break infinite loop
         }
        System.out.println("While loop execution completed");

    }
}
