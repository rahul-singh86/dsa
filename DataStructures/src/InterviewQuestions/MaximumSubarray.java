package InterviewQuestions;

public class MaximumSubarray {

    public static void main(String[] args) {
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.print("Max Sum is "+maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int arr[]){

        int maxsofar=0;
        int maxendinghere=0;

        for(int i=0;i<arr.length;i++){
            maxendinghere=maxendinghere+arr[i];
            if(maxendinghere<0){
                maxendinghere=0;
            }
            if(maxsofar<maxendinghere){
                maxsofar=maxendinghere;
            }

        }
        return maxsofar;

    }
}
