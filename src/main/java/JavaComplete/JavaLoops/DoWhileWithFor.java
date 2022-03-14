package JavaComplete.JavaLoops;

public class DoWhileWithFor {

    public static void main(String[] args) {

        String status = "Complete";

        for (int i =0 ; i<5;) {

            do {
                System.out.println(status);
                i++;
                break;
            }
            while (!status.equals("complete"));
            System.out.println("from while" +i);

        }
    }
}
