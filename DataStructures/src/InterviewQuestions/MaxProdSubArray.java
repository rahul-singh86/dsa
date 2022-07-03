package InterviewQuestions;

public class MaxProdSubArray {
    /*
            Given an integer array, find the subarray that has the maximum product of its elements. The solution should return the maximum product of elements among all possible subarrays.
            Input:  { -6, 4, -5, 8, -10, 0, 8 }
            Output: 1600
            Explanation: The maximum product subarray is {4, -5, 8, -10} having product 1600

     */

    public static void main(String[] args) {
        int arr[]={-6, 4, -5, 8, -10, 0, 8};
        System.out.println(maxProdSubArray(arr));
    }
    /*
            maxprod(+-)     arr[i](+-)
            minprod(+-)
     */
    public static int maxProdSubArray(int arr[]){

        int minprod=arr[0];
        int maxprod=arr[0];
        int result=arr[0];

        for(int i=1;i<arr.length;i++){

            int temp1=arr[i]*maxprod;
            int temp2=arr[i]*minprod;

            if(arr[i] ==  0){
                minprod=0;
                maxprod=0;
                continue;
            }

            maxprod=Math.max(temp1,temp2);
            maxprod=Math.max(maxprod,arr[i]);

            minprod=Math.min(temp1,temp2);
            minprod=Math.min(minprod,arr[i]);

            result=Math.max(result,maxprod);

        }
        return result;
    }




}
