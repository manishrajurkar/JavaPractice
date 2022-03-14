package PracticeAssignment.Inerviews;

public class FindCountOfUpperLower {
    public static void main(String[] args) {

        checkCase(" My Name Is Manish");

    }
    public static void checkCase(String str){

          str.replace(" " ,"");
          char arr[] = str.toCharArray();

           int upCount = 0;
           int lowCount =0;

          for (int i=0; i<arr.length;i++){

              if (Character.isUpperCase(arr[i])){
                  upCount++;

              }
              else if (Character.isLowerCase(arr[i])){
                  lowCount++;
              }
          }
        System.out.println("Up" +upCount);
        System.out.println("Low" +lowCount);
    }
}
