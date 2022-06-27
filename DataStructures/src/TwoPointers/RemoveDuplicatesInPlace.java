package TwoPointers;

public class RemoveDuplicatesInPlace {

    /*
    Given an array of sorted numbers, remove all duplicate number instances from it in-place, such that each element appears only once.
    The relative order of the elements should be kept the same and you should not use any extra space so that that the solution have a space complexity of O(1).
     */

    public static void main(String[] args) {
        int arr[]={2, 3, 3, 3, 6, 9, 9 };
        int resultedarraysize = removeDuplicatesInOrder(arr);
        System.out.println("Resulted Array size is " + resultedarraysize);
    }

    public static int removeDuplicatesInOrder(int arr[]){
        int swapindex=1;
        for(int i=0;i<arr.length;i++){
            if(arr[swapindex-1]!=arr[i]){
                arr[swapindex]=arr[i];
                swapindex++;
            }
        }
    return swapindex;
    }
}
