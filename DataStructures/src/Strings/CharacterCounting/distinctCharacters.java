package Strings.CharacterCounting;

public class distinctCharacters {

    static void printdistinctCharacters(int n, int k){

        String result="";
        for(int i=0;i<k;i++){
            result=result+(char)(i+'a');
        }
        int count = 0;
        for(int i=0;i<n-k;i++){
            result=result+(char)(count+'a');
            count++;
            if(count == k)
                count=0;
        }

         System.out.print(result);
    }

    public static void main(String[] args) {
        printdistinctCharacters(12,5);
    }

}
