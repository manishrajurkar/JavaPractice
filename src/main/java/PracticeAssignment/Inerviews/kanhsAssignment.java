package PracticeAssignment.Inerviews;

import java.util.Arrays;

public class kanhsAssignment {

    public static void main(String[] args) {

        //String str = "1,2,3,4,5,6 ";
       int[] values = {1, 2, 3, 5, 6, 7};
       // Arrays.sort(values);
        sortTheGivenString(values);
    }
       public static int [] sortTheGivenString (int [] arr){
        if (arr == null)
            return null;
          Arrays.sort(arr);
          StringBuilder sb = new StringBuilder();
           sb.append('[');
           System.out.println("Length" +arr.length);

           //int[] values = {1, 2, 3, 5, 6, 7};
          //for (int i =1;i<arr.length;i++){
              for (int j=0;j<arr.length-1;j++){

                      if ((arr[j] - arr[j+1]) == -1){
                         // if (sb.toString().contains(arr[j])) {
                              sb.append(arr[j]);
                              sb.append(',');
                              sb.append(arr[j + 1]);
                              sb.append(',');
                          //}
                         }else sb.append("][");
                      //j++;



              }
        //  }
           System.out.println("NOW-->"+sb);
           return arr;
       }


//        int current = values[0];
//
//        ArrayList<Integer> firstSet = new ArrayList<Integer>();
//        ;
//        for (int i = 0; i < values.length; i++) {
//            if (values[i] == (current + 1)) {
//                firstSet.add(values[i]);
//                System.out.println(firstSet);
//                current=values[i];
//
//            }
//            else {
//                ArrayList<Integer> secondSet = new ArrayList<Integer>();
//                secondSet.add(values[i]);
//                System.out.println(secondSet);
//                current=values[i];
//
//            }
//        }
//
//    }


}
