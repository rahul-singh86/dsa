package InterviewQuestions;

public class maxJump {

    /*
        Given an array of non-negative integers, you are initially positioned at the first index of the array. Each element in the array represents your maximum jump length at that position. Determine if you are able to reach the last index.
        Example 1:
        Input: [2,3,1,1,4]
        Output: true
        Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.

     */

    public static void main(String[] args) {
        int arr[]={3,2,1,0,4};
        maxJump(arr);
    }

    public static void maxJump(int arr[]){
        int jumpindex=0;
        int prevval=0;
        boolean jumppossibe=false;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr.length-i-1){
                jumpindex=i;
            }else{
                prevval=i;
            }
            if(jumpindex-prevval>=arr[prevval]){
                jumppossibe=true;
                break;
            }
        }

        if(jumppossibe){
            System.out.println("Jump is Possible");
        }else{
            System.out.println("Jump is Not Possible");
        }

    }

}
