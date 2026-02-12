package hashmap;
import java.util.*;

public class frequency{
    public static void main(String args[]){
        int[] arr = {3,4,5,6,4,5};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int el : arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            }
            else{
                freq.put(el, freq.get(el + 1));
            }
        }
        System.out.println(freq.entrySet());
    }
}