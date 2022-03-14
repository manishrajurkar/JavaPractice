package JavaComplete.JavaLoops;

public class DoWhilePractice {
    /**
     * Do - loop will always execute first & then check for the condition from while.
     * if while condition is true, it will again execute do block until condition become false.
     */

    public static void main(String[] args) {
        int value = 1;

        do {
            System.out.println(value + "From DO");
            value ++;
            System.out.println(value + "From DO Increment");

        }while (value <=10) ;     //while loop should be ended here
        //System.out.println(value);
            System.out.println(value + "Greater than 10 hence from exit");
        }

    }

