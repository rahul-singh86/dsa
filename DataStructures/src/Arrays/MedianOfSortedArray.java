package Arrays;

public class MedianOfSortedArray {
    public static void main(String[] args) {

        int datalist1[]={1,2};
        int datalist2[]={3,4};

        System.out.print("Median is "+medianOfSortedArray(datalist1,datalist2)); // (2+3)/2 = 2.5
    }

    /*
       [1,2,3] odd find the center element return
       [1,2,3,4] even so find center 2 elements and return
     */
    public static double medianOfSortedArray(int list1[],int list2[]){
        double median=0;
        int index=0;
        int sorted[]=merge(list1,list2);
        int lengthofsortedArray=sorted.length;
        index=lengthofsortedArray/2;
        if(lengthofsortedArray%2 == 0){
            median=(double)(sorted[index]+sorted[index-1])/2;
        }else{
            median=sorted[index];
        }
       return median;
    }

    public static int[] merge(int data[],int newdata[]){
        int result[]=new int[data.length+newdata.length];
        int i=0;
        int j=0;
        int k=0;

        //iterate through both arrays and since they are sorted compare each element and put in resultarray
        while(i<data.length && j<newdata.length){
            if(data[i]<newdata[j]){
                result[k]=data[i];
                i++;
            }else{
                result[k]=newdata[j];
                j++;
            }
            k++;
        }

        while(i<data.length){
            result[k]=data[i];
            i++;
            k++;
        }

        while(j<newdata.length){
            result[k]=newdata[j];
            j++;
            k++;
        }
        return result;
    }



}
