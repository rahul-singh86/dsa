package InterviewQuestions;

public class MaxSumHourGlassMatrix {
    /*
            Given a 2D matrix, the task is to find the maximum sum of an hourglass.
            Input : 1 1 1 0 0
                    0 1 0 0 0
                    1 1 1 0 0
                    0 0 0 0 0
                    0 0 0 0 0
                Output : 7
                Below is the hour glass with
                maximum sum:
                1 1 1
                  1
                1 1 1

     */

    public static void main(String[] args) {
        int [][]mat = {
                {1, 2, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {2, 1, 4, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0}
        };


        System.out.println(SumofHourGlass(mat));

    }

    public static int SumofHourGlass(int arr[][]){

        int maxsum=Integer.MIN_VALUE;;


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
               int tempsum=(arr[i][j] + arr[i][j + 1] +arr[i][j + 2])+
                                             (arr[i+1][j + 1]) +
                        (arr[i+2][j] + arr[i+2][j + 1] + arr[i+2][j + 2]);
                maxsum=Math.max(maxsum,tempsum);
            }
        }
       return maxsum;
    }



}
