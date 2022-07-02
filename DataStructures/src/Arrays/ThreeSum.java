package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ThreeSum {

    public static void main(String[] args) {
        int arr[]={3,7,1,2,8,4,5};
        ArrayList<int[]> sumofthreeintegers = threeSum(arr, 20);

//        ArrayList<int[]> result = twoSum(arr, 13, 1, arr.length);
//        for(int[] ele :result){
//            System.out.print("--Result from 2Sum Method--");
//            System.out.println(Arrays.toString(ele));
//        }

        for(int[] ele :sumofthreeintegers){
            System.out.print("--Result from 3Sum Method--");
            System.out.println(Arrays.toString(ele));
        }

    }



    public static ArrayList<int[]> threeSum(int arr[],int target){
        ArrayList<int []> finallist=new ArrayList<>();
        //loop through the element 3,7,1,2,8,4,5
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            int diff=target-element;
            ArrayList<int[]> resulted = twoSum(arr, diff, i + 1, arr.length);

            for(int[] arr1 : resulted){
                         finallist.add(new int[]{arr1[0],arr1[1],element});
                }
            resulted.clear();
            }


        return finallist;
    }


    //2Sum
    public static ArrayList<int []> twoSum(int arr[], int target, int startindex,int endindex){
        //[3,7,1,2,8,4,5]
        ArrayList<int []> results=new  ArrayList<>();
        Arrays.sort(arr,startindex,endindex); //nlogn  [1,2,3,4,5,7,8]
        int start=startindex;
        int end=endindex-1;
        while(start<end){
            if(arr[start]+arr[end] == target){
                results.add(new int[]{arr[start],arr[end]});
                start++;
                end--;
            }else{
                if((arr[start]+arr[end]) > target){
                    end--;
                }else{
                    start++;
                }
            }
        }
        return results;
    }

}
