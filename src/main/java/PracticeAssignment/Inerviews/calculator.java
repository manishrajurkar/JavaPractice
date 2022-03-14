package PracticeAssignment.Inerviews;

public class calculator {


    public static void main(String[] args) {

        System.out.println(addition(10,10));
        System.out.println(substraction(10,10));
        System.out.println(multiplication(10,10));
        System.out.println(division(10,10));
        System.out.println(mod(11,2));

    }

    public static float addition(float a , float b){
        return a+b;
    }
    public static float substraction(float a,float b){
        return a-b;
    }
    public static float multiplication(float a, float b){
        return a*b;
    }
    public static float division(float a, float b){
        return a/b;
    }
    public static float mod(float a, float b){
        return a % b;
    }
}
