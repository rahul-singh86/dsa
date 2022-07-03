package InterviewQuestions;

public class LargestSumNonAdjacent {

    public static void main(String[] args) {
        int arr[]={3,2,7,10};
        System.out.println(largestNonAdjacentSum(arr));
        System.out.println(largestNonAdjacentDP(arr));
    }


    public static int largestNonAdjacentDP(int arr[]){

        int oldinclusive=arr[0];
        int exclusive=0;
        int newinclusive=0;

        for(int i=1;i<arr.length;i++){
            newinclusive=Math.max(oldinclusive,exclusive+arr[i]);
            exclusive=oldinclusive;

        }
    return newinclusive;
    }


    //Time Complexity of this solution is O(n2) and Space is O(1)
    public static int largestNonAdjacentSum(int arr[]){
        int tempsum=0;
        int maxSum=Integer.MIN_VALUE;
        int i=0;
       while(i<arr.length-1) {
           for (int j = i + 2; j < arr.length; j++) {
                tempsum=arr[i]+arr[j];
                if(tempsum>maxSum){
                    maxSum=tempsum;
                }
           }
           i++;
       }
       return maxSum;
    }

}
