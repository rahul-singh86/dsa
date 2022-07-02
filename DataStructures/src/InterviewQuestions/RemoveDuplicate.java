package InterviewQuestions;

public class RemoveDuplicate {

    /*
        Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.
        nums = [1,1,2] then k=2 nums = [1,2,_]
        nums = [0,0,1,1,1,2,2,3,3,4] then k=5 as 0,1,2,3,4,_,_,_,_,_]

     */

    public static void main(String[] args) {
        int arr[]={1,1,2};
        System.out.println("Index is "+ removeDuplicate(arr));
    }

// Use two pointers i and j and then copy elements to left if they are not equal and return i+1 index
    public static int removeDuplicate(int arr[]){
        if(arr.length == 1) return 0;
        if(arr == null || arr.length == 0)return -1;
        int i=0;int j=1;
        while(j<arr.length-1){
            j++;
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }


}
