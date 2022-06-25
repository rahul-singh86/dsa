package Arrays;

import java.util.Arrays;

public class MergeSort {
//[9,8,7,1,2,4] so mid is 3 ==> [9,8,7,1] and [2,4]

    public static void main(String[] args) {
        int arr[]={1,3,5,2,9};
        sort(arr,0,arr.length-1);
        System.out.println("Sorted Array via Merge Sort is "+ Arrays.toString(arr));
    }

    public static void merge(int arr[],int left,int mid, int right){

        int n1=mid-left+1;//4
        int n2=right-mid; //2


        int leftArray[]=new int[n1];
        int rightArray[]=new int[n2];

        for(int m=0;m<n1;m++){
            leftArray[m]=arr[left+m];
        }

        for(int n=0;n<n2;n++){
            rightArray[n]=arr[mid+1+n];
        }

        //copy the array
        int k=left;
        int i=0; int j=0;
        while(i<n1 && j<n2){
            if(leftArray[i]<=rightArray[j]){
                arr[k]=leftArray[i];
                i++;
            }else{
                arr[k]=rightArray[j];
                j++;
            }
            k++;
        }

        while(i<n1){
            arr[k]=leftArray[i];
            i++;
            k++;
            }

        while(j<n2){
            arr[k]=rightArray[j];
            j++;
            k++;
        }

        }


     public static void sort(int arr[], int left, int right){
        if(left<right) {
            int mid = left + (right - left) / 2;
            sort(arr, left, mid);
            sort(arr, mid +1, right);
            merge(arr, left, mid, right);
        }

    }

}
