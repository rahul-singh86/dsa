package Arrays;

public class NonDuplicateNumber {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2};
        findNonDuplicateNumber(arr);
    }

    public static void findNonDuplicateNumber(int arr[]){
        int nonduplicateno=0;
        for(int ele : arr){
            nonduplicateno=nonduplicateno^ele;
        }
        System.out.print(nonduplicateno);
    }

}
