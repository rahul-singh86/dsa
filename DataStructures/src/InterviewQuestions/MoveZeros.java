package InterviewQuestions;

import java.util.Arrays;

public class MoveZeros {

    /*
         Input: nums = [0,1,0,3,12]
         Output: [1,3,12,0,0]
     */

    public static void main(String[] args) {
        int arr[]={0,1,0,3,12};
        System.out.println(Arrays.toString(moveZerosEnd(arr)));
    }

    public int[] moveZeroesmaintaingOrder(int[] arr) {
        if(arr.length == 1){
            return arr;
        }
        try{
            int i=-1;
            for(int j=0;j<arr.length;j++){
                if(arr[j]!=0){
                    i++;
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return arr;
    }


    public static int[] moveZerosEnd(int arr[]){
        if(arr.length == 1){
            return arr;
        }
        try{
            int i=arr.length;
            for(int j=arr.length-1;j>=0;j--){
                if(arr[j] == 0){
                    i--;
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return arr;
    }


}
