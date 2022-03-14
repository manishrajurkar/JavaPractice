package PracticeAssignment.Inerviews;

public class FindStringNumbers {

    public static void main(String[] args) {

        String str = "Lorenzo +35115745456565 Nationality Italian\n" +
                "Heidi +4915678789898 Nationality Germany\n" +
                "Roberta +34342525665 Nationality France\n" +
                "Ingo +49151425523 Nationality Germany\n" +
                "\"";

       // printNumbersUsingArray(str);
       // modifyString(str);

        for (int i=0;i<str.length();i++) {
            for (int j=0;j<str.length()-i-1;j++){
            //System.out.println("Index Number" +j +" " +str.charAt(j));
            if (( str.charAt(j) == str.charAt(j+1))&& Character.isDigit(str.charAt(j))) {
                System.out.println("There is a match at index " +j + " ->" + str.charAt(j)+" "
                        + "Matched with "+j+1 + " ->" +str.charAt(j+1));
               }
            }
        }
    }

     public static void modifyString(String str){

         String newString2 = str.replaceAll("[\\D]","");
         System.out.println("------------------1------------------");
         System.out.println(newString2);


         String newString3 = str.replaceAll("[A-Z]","")
                 .replaceAll("[a-z]","");
         System.out.println("------------------2------------------");
         System.out.println(newString3);


//         String newstring4 = str.replaceAll("^+ $","");
//         System.out.println("-------------------3-----------------");
//         System.out.println(newstring4);
//
//         String newstring5 = str.replace("^+..a$","");
//         System.out.println("-------------------4-----------------");
//         System.out.println(newstring5);

     }

        public static void printNumbersUsingArray (String strValue){
            char[] arr = strValue.toCharArray();
            StringBuilder br = new StringBuilder();
            for (int i = 0; i < arr.length; i++) {
                if (Character.isDigit(i)) {
                    br.append(i);
                }
            }
            System.out.println("Numbers are" + br);
        }


    public static void printNumberUsingList(String strValue) {
        char[] arr = strValue.toCharArray();
        String [] num = strValue.split(" +") ;
        System.out.println(num);


    }
    }

