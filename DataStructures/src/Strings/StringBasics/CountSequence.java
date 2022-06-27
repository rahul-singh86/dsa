package Strings.StringBasics;

public class CountSequence {

    public static void main(String[] args) {
        String s="aabbcccc";
        System.out.print(consequtiveCharResult(s));
    }

    //aabbcccc
    public static int consequtiveCharResult(String s){
        int maxcount=0;
        int count=1;
        char[] ch=s.toCharArray();
        System.out.println("test is"+ s.length());
        for(int i=0;i<s.length()-1;i++){
                if(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
                    count++;
                    System.out.println(s.charAt(i)+"|"+count+"|"+s.charAt(i+1)+"|"+i);
                }else{
                    if(count>maxcount){
                        maxcount=count;
                        count=1;
                    }else{
                        count=1;
                    }
                }
        }
        return (maxcount>count)?maxcount:count;
    }
}
