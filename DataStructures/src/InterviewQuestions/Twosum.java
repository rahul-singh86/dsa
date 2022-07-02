package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;

public class Twosum {

    /*
        Input: nums = [1,4,10,-3], target = 14
        Output: [1,2] or [2,1] # 4 + 10 = 14

        Input: nums = [9,5,1,23], target = 10
        Output: [0,2] or [2,0] # 9 + 1 = 10

        Input: nums = [1,-2,5,10], target = -1
        Output: [0,1] or [1,0] # 1 + -2 = -1
     */


    public static void main(String[] args) {

        int[] testcase_1={1,-2,5,10};
        //System.out.print(Arrays.toString(twoSum(testcase_1,14)));
        System.out.print(Arrays.toString(twoSumwithoutSorting(testcase_1,-1)));
    }

    public static int[] twoSumwithoutSorting(int arr[],int target) {
            HashMap<Integer,Integer> elements=new HashMap<Integer,Integer>();
            for(int i=0;i<arr.length;i++){
                int diff=target-arr[i];
                if(elements.get(diff) == null) {
                    elements.put(arr[i], i);
                }
                else{
                    int index=elements.get(diff);
                    return new int[]{index,i};
                }
            }
            return new int[]{};
    }

    public static int[] twoSum(int arr[],int target){
       // Arrays.sort(arr); // nlogn  [-3,1,4,10]
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int sum=arr[start]+arr[end];
            if(sum == target){
                return new int[]{start,end};
            }else{
                if(sum > target){
                    end-- ;
                }else{
                    start++;
                }

            }
        }
    return new int[]{};
    }

}
