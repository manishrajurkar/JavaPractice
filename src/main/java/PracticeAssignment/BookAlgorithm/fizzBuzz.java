package PracticeAssignment.BookAlgorithm;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class fizzBuzz {

    public static void main(String[] args) {
        int numArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 30};

        Map<String, Integer> fizzBuzz = new HashMap<String, Integer>();

        for (int i : numArray) {

            if (numArray[i] % 3 == 0) {
                System.out.println("Fizz");
                if (fizzBuzz.containsKey("Fizz")) {
                    fizzBuzz.replace("Fizz", fizzBuzz.get(i) + 1);
                } else {
                    fizzBuzz.put("Fizz", 1);
                }

            } else if (numArray[i] % 5 == 0) {
                System.out.println("Buzz");
                if (fizzBuzz.containsKey("Buzz")) {
                    fizzBuzz.replace("Buzz", fizzBuzz.get(i) + 1);
                } else {
                    fizzBuzz.put("Buzz", 1);
                }

            } else System.out.println("Something is wrong");
        }

        System.out.println("Print HashMap " + fizzBuzz);

    }
}




//    public static void replace(Map map) {
//
//
//    }
//}

//
//            if(numArray[i] %3==0 && numArray[i]%5==5){
//                System.out.println("FizzBuzz-"+numArray[i]);
//                //fizzBuzz.put("FizzBuzz",numArray[i]);
//            }
//            else if(numArray[i] % 3 ==0){
//                System.out.println("Fizz-"+numArray[i]);
//
//                if(fizzBuzz.containsKey(numArray[i])){
//                    fizzBuzz.replace("Fizz",fizzBuzz.get(numArray[i])+ numArray[i]);
//                }
//                else
//                    fizzBuzz.put("Fizz", (String.valueOf(numArray[i])));
//            }
//            else if (numArray[i]% 5 ==0){
//                System.out.println("Buzz-"+numArray[i]);
//                //fizzBuzz.put("Buzz",numArray[i]);
////            }
//        }
//
//        System.out.println("Print HashMap " +fizzBuzz);
//    }
//    }


