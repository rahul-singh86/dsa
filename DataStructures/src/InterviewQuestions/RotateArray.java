package InterviewQuestions;

import java.util.Arrays;

public class RotateArray {

    /*
        Input arr[] = [1, 2, 3, 4, 5, 6, 7], d = 2, n =7
        Rotated Array is [4,5,6,7,1,2]
     */

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(RotateArray(arr,5)));
    }

    public static int[] RotateArray(int arr[], int k){
        int temp=0;
        int count=0;
        // k=2 k*o(n) elements 2 times time complexity space is o(1)
        while(count<k) {
            temp = arr[0];
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }
            count++;
            arr[arr.length-1]=temp;
        }
        return arr;
    }

}
