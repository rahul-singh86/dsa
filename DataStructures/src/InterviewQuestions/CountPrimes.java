package InterviewQuestions;

public class CountPrimes {

        /*
             an array arr[] of N positive integers. The task is to write a program to count the number of prime elements in the given array.
             Input: arr[] = {1, 3, 4, 5, 7}
            Output: 3
            There are three primes, 3, 5 and 7

            Input: arr[] = {1, 2, 3, 4, 5, 6, 7}
            Output: 4
         */



    public static void main(String[] args) {
        int testcase_1[]={1, 3, 4, 5, 7};
        int testcase_2[]=null;

        System.out.println(countNoOfPrime(testcase_2));
        System.out.println(countNoOfPrime(testcase_1));


//        System.out.println("No is Prime true / false ? : " +isPrimeNumber(17));
    }

        public static int countNoOfPrime(int arr[]){
        int count=0;
        try{
             for(int element:arr){
                        if(isPrimeNumber(element)){
                            count++;
                        }
                    }
           }catch (Exception e)
               {
                   System.out.println(e.getMessage());
               }
            return count;
        }

        public static boolean isPrimeNumber(int number){
            boolean isprime=false;
            if(number % 2 == 0){
                isprime=false;
                return isprime;
            }else{
                if(number % 3 == 0 && number!=3){
                    isprime=false;
                    return isprime;
                }else{
                    isprime=true;
                }
            }
          return isprime;
        }


}
