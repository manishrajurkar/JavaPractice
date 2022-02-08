package Loops;

public class IfElsePractice {

    public static void main(String[] args) {

        int number = (int) (Math.random()*5);
        System.out.println("Random Value is :"  +number);

        if(number >= 10)
            System.out.println(number +" is Greater than 10");
        else if (number>=5 && number<10 )
            System.out.println(number +" is between 5 and 10");
        else if (number>0 && number<5)
            System.out.println(number +" is between 0 and 5");
        else
            System.out.println("Invalid number");

    }

}
