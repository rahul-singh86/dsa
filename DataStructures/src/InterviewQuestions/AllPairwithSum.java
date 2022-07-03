package InterviewQuestions;

public class AllPairwithSum {

    public static void main(String[] args) {
        int arr[]={1,5,7,-1,5,4,2};
        System.out.println("Total Sum Pair is " + AllPairBruteForce(arr,17));
    }


    //1 5 7 -1 5 4 2 and k=6 this is Brute Force to find all pairs with given Target o(n2) Solution
    public static int AllPairBruteForce(int arr[], int target){
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum == target){
                    System.out.println(arr[i]+"|"+arr[j]);
                    count++;
                }
            }
        }
        return count;
    }

   // Optimized Solution to use HashMap

}
