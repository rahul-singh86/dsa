package InterviewQuestions;

public class CountOddEven {

    /*
        For the given array of integers, count even and odd elements.
        Input:
        int arr[5] = {2, 3, 4, 5, 6}
        Output:
        Number of even elements = 3
        Number of odd elements = 2

     */
    public static void main(String[] args) {

        int arr[]={2, 3, 4, 5, 6};
        countOddEven(arr);
    }


    public static void countOddEven(int arr[]){
        int evencount=0;
        int oddcount=0;
        for(int element : arr){
            int tempeven=element % 2;
            switch(tempeven){
                case 0:
                    evencount++;
                    break;
                default:
                    oddcount++;
                    break;
            }
        }
       System.out.println(evencount);
       System.out.println(oddcount);
    }

}
