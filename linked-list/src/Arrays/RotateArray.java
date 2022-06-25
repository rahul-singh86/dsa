package Arrays;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        rotateArray(arr,4);
    }
//0(n2) Space Com constant
    public static void rotateArray(int arr[], int k){
        for(int i=0;i<k;i++){
            int temp=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
               arr[j]=arr[j-1];
            }
            arr[0]=temp;
        }
      System.out.println(Arrays.toString(arr));
    }
}
