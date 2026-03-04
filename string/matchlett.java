package string;
import java.util.Arrays;

public class matchlett {
    public static void main(String args[]){
        String s1 = "bank";
        String s2 = "ankb";

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            System.out.println("Both strings are anagrams");
        } else {
            System.out.println("Not anagrams");
        }
    }
}