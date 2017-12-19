package OOP_LAB4.OOP_LAB5;
//1. input Data from user
//2. find summation of data in array
//3. find average value of Data in array
//4. find maximum value of Data in array
//5. find minimum value of Data in array
import  java.util.Scanner;
public class InputDataToArray {
    private static final int MAX =10;
    public static void main(String[] args) {
        int num[] = new int[MAX];
        num=inputData(num);
        showData(num);
    }
   private static void summation(int[]num){
        int total =0;
        for(int i=0;i<num.length;i++){
            total = num[i];
        }
        System.out.println("the summation of Value in array in:"+total);
       System.out.println("the average value in array is " +total/MAX);
   }

    private static void showData(int[] num){
        System.out.println("Data in array:");
        for(int val: num)
            System.out.print(val+"");
    }
    private static int[] inputData(int []num) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pleae enter data to array:");
        for (int i = 0; i < num.length; i++) {
            System.out.print("num[" + i + "]:");
            num[i] = scanner.nextInt();
        }
        return num;
        ////////
        /////////
    }
}//class
