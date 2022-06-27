package Arrays.Searching;

public class twoSum {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,8,11,29,40,65};
        twoSum(arr,69);
        /*
          int arr[]={1,2,3,4,4,5,8,11,29,40,65} find 2 numbers whose sum is 69
         */

    }

    public static void twoSum(int arr[],int target){

            int start=0;
            int end=arr.length-1;

            while(start<end){
                int currentsum=arr[start]+arr[end];
                if( currentsum == target)
                {
                    System.out.println(start+"|"+end);
                    start++;
                    System.out.println("Printing new start value: " +start);
                }
                else{
                    if(currentsum>target){
                        end--;
                        System.out.println("Printing new enf value: " +end);
                    }else if((currentsum<target)){
                        start++;
                        System.out.println("Printing new start value in else if: " +start);
                    }
                }
            }
    }

}
