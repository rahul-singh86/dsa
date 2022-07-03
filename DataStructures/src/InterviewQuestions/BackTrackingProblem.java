package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BackTrackingProblem {
    /*
      Find all possible Combination of 123 or ABC
     */
    public static void main(String[] args) {
        int arr[]={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        permute(arr,0,result);
    }
    public static void permute(int arr[],int index, List<List<Integer>> result){
        if(index == arr.length){
            //add this combinations to result list and return or use if necassary
            System.out.println(Arrays.toString(arr));
            return;
        }
        for(int i=index;i<arr.length;i++){
            swap(arr,i,index);
            permute(arr,index+1,result);
            swap(arr,i,index);//backtrack
        }
    }

    public static void swap(int arr[], int i , int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


}
