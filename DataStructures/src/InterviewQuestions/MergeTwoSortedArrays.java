package InterviewQuestions;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    /*
            Given Two Arrays Merge Sorted Arrays
            Approach is to use what we use in merge sort merge function and we take two indices and merge them accordingly
     */


    public static void main(String[] args) {

        /*
                Start with the TestCases and Confirm the Approach for the Same like outcome of all the tests. Here i am assuming elements are positve and non duplicate
                but if they ask this will work for negative elements as well.
         */

        int[] arrayonetestcase_1={5,6,7};
        int[] arraytwotestcase_2={1,2,3};

        int[] sortedarray=mergeSortedArray(arrayonetestcase_1,arraytwotestcase_2);
        System.out.println(Arrays.toString(sortedarray));

        int[] arrayonetestcase_3=null;
        int[] arraytwotestcase_4={1,2,3};

        int[] sortedarraynull=mergeSortedArray(arrayonetestcase_3,arraytwotestcase_4);
        System.out.println(Arrays.toString(sortedarraynull));


        int[] arrayonetestcase_5=null;
        int[] arraytwotestcase_6={};

        int[] sortedarraynullandempty=mergeSortedArray(arrayonetestcase_5,arraytwotestcase_6);
        System.out.println(Arrays.toString(sortedarraynullandempty));

        int[] arrayonetestcase_7= {};
        int[] arraytwotestcase_8={1};

        int[] sortedarrayoneelement=mergeSortedArray(arrayonetestcase_7,arraytwotestcase_8);
        System.out.println(Arrays.toString(sortedarrayoneelement));

        int[] arrayonetestcase_9= {-1,-1,0,1};
        int[] arraytwotestcase_10={-2,-3};

        int[] sortedarraynegativevalue=mergeSortedArray(arrayonetestcase_9,arraytwotestcase_10);
        System.out.println(Arrays.toString(sortedarraynegativevalue));

    }


    public static int[] mergeSortedArray(int arrayone[], int arraytwo[]){

       if(arrayone == null || arrayone.length == 0)return arraytwo;
       if(arraytwo == null || arraytwo.length == 0)return arrayone;

        int i=0;int j=0; int k=0;
        int result[]=new int[arrayone.length+arraytwo.length];
        while(i<arrayone.length && j<arraytwo.length){
            if(arrayone[i]<arraytwo[j]){
                result[k]=arrayone[i];
                i++;
            }else{
                result[k]=arraytwo[j];
                j++;
            }
            k++;
        }

        while(i<arrayone.length){
            result[k]=arrayone[i];
            i++;
            k++;
        }

        while(j<arraytwo.length){
            result[k]=arraytwo[j];
            j++;
            k++;
        }
       return result;
    }


}
