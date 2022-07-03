package InterviewQuestions;

public class ThirdLargestNumber {
    /*
            Given an array of n integers, find the third largest element. All the elements in the array are distinct integers.
            arr[] = {1, 14, 2, 16, 10, 20}
            The third Largest element is 14
     */

    public static void main(String[] args) {
        int testcase_1[]={1, 14, 2, 16, 10, 20};
        System.out.println(thirdLargestElement(testcase_1));
    }

    public static int thirdLargestElement(int arr[]){
        int first=arr[0];
        int second=Integer.MIN_VALUE;
        int third=Integer.MIN_VALUE;

        for(int i=1;i<arr.length;i++){
            if(first<arr[i]){
                third=second;
                second=first;
                first=arr[i];

            }
        }
      return third;
    }





}


