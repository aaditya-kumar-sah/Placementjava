package problems;
import java.util.HashSet;

public class gen_unique_subseq {
    public static void unique_seq(String str, int idx, String newString, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
            System.out.println(newString);
            set.add(newString);
            return;
            }
        }
        char currChar = str.charAt(idx);
        unique_seq(str, idx + 1, newString + currChar, set);
        unique_seq(str, idx + 1, newString, set);
    }
    public static void main(String args[]){
        String str = "abc";
        HashSet<String> set = new HashSet<>();
        unique_seq(str, 0, "", set);
    }
}
