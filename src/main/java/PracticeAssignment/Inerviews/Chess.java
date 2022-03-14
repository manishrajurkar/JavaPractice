package PracticeAssignment.Inerviews;

import javax.swing.*;
import java.awt.*;


public class Chess {

    public static void main(String[] args) {
        int row =8;
        int col =8;

        JPanel [][] chesArray = new JPanel[row][col];

        for(int i=0; i<row;i++){

            for (int j =0; j<col;j++){

                chesArray[i][j]= new JPanel();

                if((i+j)%2==0){
                    chesArray[i][j].setBackground(Color.BLACK);

                }else
                    chesArray[i][j].setBackground(Color.white);
            }
            //JFrame.add(squares[i][j]);

            System.out.println(chesArray);
        }


    }
}
