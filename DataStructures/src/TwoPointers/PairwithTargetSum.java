package TwoPointers;

import java.util.Arrays;

public class PairwithTargetSum {

    // Time Complexity is o(n) and space complexity is o(1)s
    public static void main(String[] args) {
        int arr[]={1, 2, 3, 4, 6};
        int target=6;
        int[] result = SumofTargetPair(arr, target);
        System.out.println("Pair with matching sum is "+ Arrays.toString(result));
    }

    // Given an array of sorted numbers and a target sum, find a pair in the array whose sum is equal to the given target.
    public static int[] SumofTargetPair(int arr[], int target){
        /*
            1) It is a Sorted Array
            2) We use two pointers first at start and second at the end
            3) We sum that and if its greater then target then we reduce the end pointer from end else start pointer
            4) once we have the target we say target found
         */
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int sum=arr[start]+arr[end];
            if(sum >target){
                end--;
            }else if (sum <target){
                start++;
            }else{
                return new int[]{arr[start],arr[end]};
            }
        }
        return new int[]{-1,-1};
    }


}
