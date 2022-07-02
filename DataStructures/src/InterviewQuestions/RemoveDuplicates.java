package InterviewQuestions;

public class RemoveDuplicates {



    public static void main(String[] args) {
        int arr[]={3,2,2,3};
        System.out.print("element index is "+removeElement(arr,2));
    }

    public static int removeElement(int[] nums, int val) {

        int i= nums.length;
        int j= nums.length-1;
        while(i>=0 && j >=0){
            if(nums[j] == val){
                i--;
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
            }
            j--;
        }
        return i;
    }
}
