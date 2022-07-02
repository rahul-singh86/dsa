package InterviewQuestions;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class CountElementFrequency {


    /*
        Count frequency of Elements in an Array
        [10,20,10,10,30] -- 10-3 20-1 and 30-1
     */

    public static void main(String[] args) {
        int testcase_1[]={10,20,10,10,30}; //print result
        int testcase_2[]=null; // handle exception
        int testcase_3[]={};  //  print its Empty Array
        int testcase_4[]={10}; // print result
        int testcase_5[]={-10,-10,20}; //print result


        LinkedHashMap<Integer, Integer> resultedmap = arrayfrequencyCounter(testcase_5);
        System.out.println(resultedmap);
    }




    public static LinkedHashMap<Integer,Integer> arrayfrequencyCounter(int arr[]){
        if(arr == null) return new LinkedHashMap<>();
        if(arr.length == 0){
            System.out.println("Array is Empty");
            return new LinkedHashMap<>();
        }
        LinkedHashMap<Integer, Integer> frequency=new LinkedHashMap<>();
        for(int element : arr){
            frequency.put(element,frequency.getOrDefault(element,0)+1);
        }
        return frequency;
    }


}
