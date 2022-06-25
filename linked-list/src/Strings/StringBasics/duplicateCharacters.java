package Strings.StringBasics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class duplicateCharacters {

    public static void main(String[] args) {
        String test=null;
        System.out.println(duplicateReturner("Rahull").toString());
        System.out.println(duplicateReturner("").toString());
        System.out.println(duplicateReturner(test).toString());
        System.out.println(duplicateReturner("Rahull ").toString());
        System.out.println(duplicateReturner("***Rahul*^").toString());
        System.out.println(duplicateReturner("Rahul Singh Rahul ").toString());
        System.out.println(duplicateReturner(" ").toString());
        System.out.println("HashMap Implemetation Below");
        System.out.println(hashMapImplementation("Rahull"));
    }

    // How do you print duplicate characters from a string?

    /*
            1. "Rahull" --> l
            2. "Rahul Singh is Rahul"--?Rahul -> wat is the output-->ArrayList
                1. Do we need to print count? ---> No
            3. "Rahul*^("-->Rahul--> only alphabets
            4. ""--> what should we return-> empty string or ArrayList?--arraylist
            5. null --> ,,
            6. Spaces --> we will not consider spaces
            7. Millions of characters--> yes
     */

    public static ArrayList<Character> duplicateReturner(String s){
        ArrayList<Character> duplicate=new ArrayList<>();
        //if(s == null || s.isEmpty()) return duplicate;
       try{
        s=s.replaceAll("[^a-zA-Z]","");
        for(char temp : s.toCharArray()){
           if(s.indexOf(temp)!=s.lastIndexOf(temp)){
               if(!duplicate.contains(temp))
               { duplicate.add(temp);}
           }
        }
        return duplicate;
       }catch (Exception e){
           System.out.println(e.getMessage());
       }
       return new ArrayList<>();
    }

    public static HashMap<Character,Integer> hashMapImplementation(String s){
        HashMap<Character,Integer> hmap=new HashMap<>();
        for(char c : s.toCharArray()){
            if(hmap.containsKey(c)){
                hmap.put(c,hmap.get(c)+1);
            }else{
                hmap.put(c,1);
            }
        }// HashMap is created

        for(Map.Entry<Character,Integer> preeti:hmap.entrySet()){
            char temp=preeti.getKey();
            int  val=preeti.getValue();
            System.out.println(temp+"+"+val);
            //TO Be Enhanced TBD
//            if(val == 1){
//                hmap.values().removeAll(Collections.singleton(val));
//            }
        }
        return hmap;
    }


}
