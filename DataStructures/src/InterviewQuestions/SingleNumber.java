package InterviewQuestions;

public class SingleNumber {

    /*
                Given a non-empty array of integers, every element appears twice except for one. Find that single one.
                [2,1,5,3,1,5,2] the result will be 3 since 3 occurs once.
     */


    public static void main(String[] args) {

        int arr[]=new int[]{2,1,5,3,1,5,2};
        System.out.println(nonDuplicateFinder(arr));
    }

        public static int nonDuplicateFinder(int[] arr){
            int result=0;
            for(int ele : arr){
                result=result^ele;
            }
         return result;
        }


}
