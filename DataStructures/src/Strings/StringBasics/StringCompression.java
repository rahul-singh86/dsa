package Strings.StringBasics;

public class StringCompression {

    public static void main(String[] args) {
        String testcase_1="abbebffgh"; //aabccddd be or aabccddd bb
        System.out.println(stringCompression(testcase_1));
    }
    // arr.length-2 = 4 [0,1,2,3,4,5]
    public static String stringCompression(String s){
        StringBuffer br=new StringBuffer();
        int count=1;
        try { //abcd
               if (s.isEmpty()) {
                System.out.print("isEmpty");
                return "";
            }else{
                for(int i=0;i<s.length()-1;i++){
                    if(s.charAt(i)==s.charAt(i+1)){
                        count++;
                    }else{
                        br.append(s.charAt(i));
                        if(count>1){
                        br.append(count);}
                        count=1;
                    }
                }
            }
          br.append(s.charAt(s.length()-1));
          if(count>1){
              br.append(count);
          }
        }catch(Exception e){
            System.out.print(e.getMessage());
        }
        return br.toString();
    }
}
