package Arrays.Searching;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[]={1,6,3,4,8,9};
        int element=8; //0008
        String padded = String.format("%03d" , element);
        String padded1 = String.format("|%-10d|" , element);


// TODO Handle Exception
       try{
                System.out.println(padded+"|"+padded1);
                System.out.println("Index is "+linearSearch(arr,6));
                System.out.println("Index is "+linearSearch(arr,10));
                System.out.println("Index is "+linearSearch(arr,Integer.valueOf(padded)));
                System.out.println("Index is "+linearSearch(arr,Integer.valueOf(padded1)));
                System.out.println("Index is "+linearSearch(arr,Integer.MAX_VALUE));
                System.out.println("Index is "+linearSearch(arr,-1));
                System.out.println("Index is "+linearSearch(arr,0));
       }catch (Exception e){
           System.out.println("Entered Exception Block");
           System.out.print(e.getMessage());
       }finally {
           System.out.println("Index is "+linearSearch(arr,Integer.MAX_VALUE));
           System.out.println("Index is "+linearSearch(arr,-1));
           System.out.println("Index is "+linearSearch(arr,0));
       }

    }

    //TC is o(n) and SC-- Nothing
    public static int linearSearch(int arr[], int target){
       try{
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target){
                    return i;
            }
        }}catch (Exception e){
           System.out.println("Entered Exception Block");
           System.out.print(e.getMessage());
       }
        return -1;
    }

}
