package InterviewQuestions;

public class SearchInsertPosition {

    public static void main(String[] args) {
        int arr[]={1, 3, 5, 6};
        int k=8;
        System.out.println("Element index is "+searchInsertPosition(arr,k));
    }

    public static int searchInsertPosition(int arr[], int target){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid] == target) return mid;
            else{
                if(target>arr[mid]){
                    left=mid+1;
                }else{
                   right=mid-1;
                }
            }
        }
     return left;
    }

}
