package PracticeAssignment.Inerviews;

public class Amazon {



    public static void main(String[] args) {
        String str = "flipkkRT";
        check(str);
    }
    public static void check(String str){

        char arr []  = str.toCharArray();

        char duplicateCharPlus1 = ' ' ;
        int duplicatecharIndex1 = 0;
        for (int i=0 ;i <str.length(); i++){
            for (int j=0; j<str.length()-1; j++){

                if (arr[j] == arr[j+1]){
                    duplicateCharPlus1 =arr[j+2];
                    duplicatecharIndex1 = j+2;
                }
            }
        }
        System.out.println(duplicateCharPlus1);
        System.out.println(duplicatecharIndex1);
    }

}
