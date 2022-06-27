package Arrays;

public class maxSubArray {

    public static void main(String[] args) {
        int test_case1[]={-2,1,-3,4,-1,2,1,-5,4};
        int test_case2[]={1};
        int test_case3[]={-1};
        int test_case4[]=null;
        int test_case5[]={};

          System.out.println(maxSubArray(test_case1));
//        System.out.println(maxSubArray(test_case2));
//        System.out.println(maxSubArray(test_case3));
//        System.out.println(maxSubArray(test_case4));
//        System.out.println(maxSubArray(test_case5));

    }

    public static int maxSubArray(int []arr){

        int maxSum=0;
        int currentSum=0;
        int j=0;
        int startindex=0;
        int endindex=0;

        try{
            if(arr.length == 1)return arr[0] ;
            while(j<arr.length){
                if(currentSum<0){
                    currentSum=0;
                    startindex=j;
                }

                currentSum+=arr[j];

                if(currentSum>maxSum){
                    maxSum=currentSum;
                    endindex=j;
                }
                j++;
            }
            System.out.println(startindex+"|"+endindex);
            return maxSum;
        }
        catch(Exception e){
              System.out.print(e.getMessage());
            }
        return -1;
    }


}
