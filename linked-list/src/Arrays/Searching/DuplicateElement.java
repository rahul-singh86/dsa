package Arrays.Searching;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DuplicateElement {

    public static void main(String[] args) {
        int arr[]={1,3,11,10,8,3,11};
        System.out.println(hashTableImplementation(arr));
//        System.out.println(hashTableImplementationwithRemove(arr));
        /*
        Approach 1 - 2 For Loops o(n2)
        Approach 2 - Sort it and then do binary search --> nlogn+n= nlogn
        1 3 3 8 10 11
        Approach 3- > HashTable 0(n)
         */
    }


//    public static HashMap<Integer, Integer> hashTableImplementationwithRemove(int arr[]){
//        ArrayList<Integer> duplicatelist=new ArrayList<>();
//        HashMap<Integer,Integer> duplicate=new HashMap<>();
//        for(int element : arr){
//            duplicate.put(element,duplicate.getOrDefault(element,0)+1);
//        }
//        System.out.println(duplicate);
//        for(Iterator<Map.Entry<Integer,Integer>> dup=duplicate.entrySet().iterator();{
//            dup.hasNext());
//            int val=dup.getValue();
//            int key=dup.getKey();
//            if(val == 1) {
//               try{ duplicate.remove(key);}catch(Exception e){
//                   System.out.println(e.getMessage());
//               }
//            }
//        }
//        return duplicate;
//    }



    // 2-1
    public static ArrayList<Integer> hashTableImplementation(int arr[]){
        ArrayList<Integer> duplicatelist=new ArrayList<>();
        HashMap<Integer,Integer> duplicate=new HashMap<>();
        for(int element : arr){
                duplicate.put(element,duplicate.getOrDefault(element,0)+1);
            }
        System.out.println(duplicate);
        for(Map.Entry<Integer,Integer> dup:duplicate.entrySet()){
            int val=dup.getValue();
            int key=dup.getKey();
            if(val > 1) {
                duplicatelist.add(key);
            }
        }
        return duplicatelist;
        }



}
