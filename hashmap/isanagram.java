package hashmap;
import java.util.*;

public class isanagram {

    public static HashMap<Character, Integer> makeFreqMap(String s){
        HashMap<Character, Integer> mp = new HashMap<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        return mp;
    }

    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> mp = makeFreqMap(s);

        for(int i = 0; i < t.length(); i++){
            char ch = t.charAt(i);

            if(!mp.containsKey(ch)) return false;

            int currFreq = mp.get(ch);
            mp.put(ch, currFreq - 1);
        }

        for(int freq : mp.values()){
            if(freq != 0) return false;
        }

        return true;
    }

    public static void main(String[] args){
        System.out.println(isAnagram("listen", "silent")); // true
        System.out.println(isAnagram("hello", "world"));   // false
    }
}