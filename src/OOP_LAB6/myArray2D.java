package OOP_LAB6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class myArray2D {

    public static void main(String[] args) {
        //array2D
        int[][] num = new int[2][3];

        num[0][0] = 100;
        num[0][2] = 200;
        try {
            num = input(num);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ShowData(num);
    }//main

    private static int[][] input(int[][] num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter an integer:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("num[" + j + "][+j+]:");
                num[i][j] = Integer.parseInt(reader.readLine());

            }//j
        }//i
        return num;
    }//inputData


    private static void ShowData(int[][] num) {
        System.out.println("Data in array:");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.println("num(" + i + ")(" + j + "):" + num[i][j]);

            }//j
        }//i
    }//showData
}//class
