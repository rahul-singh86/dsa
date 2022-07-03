package InterviewQuestions;

import java.util.Arrays;

public class Rotate2DArray {

    /*
            Given a square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
            Input:
            Matrix:
             1  2  3
             4  5  6
             7  8  9
            Output:
             3  6  9
             2  5  8
             1  4  7
            The given matrix is rotated by 90 degree
            in anti-clockwise direction.

           a[2][0]= a[0][0]
           a[1][0]= a[0][1]
           a[0][0]= a[0][2]


           a[0][1]= a[1][2]
           a[0][0]= a[2][2]

     */
    public static void main(String[] args) {
        int arr[][]={
                    { 1, 2, 3 },
                    { 5, 6, 7,},
                    { 9, 10, 11 }
                    };

        int result[][]=rotateAntiClockWise(arr);
        display2DMatrix(result);
        reverse2DMatrixRow(result);
        System.out.println();
        display2DMatrix(result);
    }


    public static void reverse2DMatrixRow(int arr[][]){
       for(int i=0;i<arr.length;i++){
           reverse(arr[i]);
       }
    }

    public static void reverse(int arr[]){
        int i=0; int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }


    public static void display2DMatrix(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

    public static void swapArrayElement2D(int arr[][], int i,int j){
        int temp = arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }

    public static int[][] rotateAntiClockWise(int arr[][]){
        int dest[][]=new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                dest[i][j]=arr[arr.length-1-j][i];
            }
        }
        return dest;
    }
}
