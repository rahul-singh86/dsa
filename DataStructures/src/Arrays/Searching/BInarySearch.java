package Arrays.Searching;

public class BInarySearch {
    // Array should be sorted
    /*
     Approach 1 -- Iterative Approach
     Approach 2 -- Recursive Approach

     [0,1,2,3,4,5,6,7]   and no is 6 , mid index == low+(high-low)/2
     1 find middle compare is that element ur target?
     2 no ? is 3<6 low = mid+1
     3 no ? is 3>6 high=mid-1

     TC -- (n+n/2+n/4...) --(logn)
     */
    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7};
        //System.out.println("ans is "+ iterativeBinarySearch(arr,7));
        System.out.println("ans is "+ recursiveBinarySearch(arr,7));
    }

/*
   call 1--> mid 3 recursiveBinarySearch(arr,3)-->recursiveBinarySearch(arr,3)
   If we use recursion
 */
    public static int recursiveBinarySearch(int arr[], int target){
        int start=0;
        int end=arr.length-1;
        if(start<=end){
            int mid=start+(end-start)/2;//4+  3/2=4+1=5
            System.out.println(mid);
            if(arr[mid]==target){
                return mid;
            }else{
                if(arr[mid]>target){
                    return recursiveBinarySearch(arr,target);
                }else{
                    return recursiveBinarySearch(arr,target);
                }
            }}
        return -1;
    }


    public static int recursiveBinarySearch(int arr[], int target,int start, int end){

        if(start<=end){
            int mid=start+(end-start)/2;//4+  3/2=4+1=5
            System.out.println(mid);
            if(arr[mid]==target){
                return mid;
            }else{
                if(arr[mid]>target){
                    return recursiveBinarySearch(arr,target,start,mid-1);
                }else{
                    return recursiveBinarySearch(arr,target,start+1,end);
                }
            }}
        return -1;
    }

    public static int iterativeBinarySearch(int arr[], int target){
        //[0,1,2,3,4,5,6,7] target = 7
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;//4+  3/2=4+1=5
            System.out.println(mid);
            if(arr[mid]==target){
                return mid;
            }else{
                if(arr[mid]>target){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }

        }
return -1;
    }




}

