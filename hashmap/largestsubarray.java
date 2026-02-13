package hashmap;
import java.util.HashMap;

public class largestsubarray {
    int zeroSumLargestSubarray(int[] arr, int n){
        HashMap<Integer, Integer> mp = new HashMap<>();
        int maxlen = 0, prefsum = 0;
        mp.put(0, -1);
        for(int i = 0; i < arr.length; i ++ ){
            prefsum += arr[i];
            if(mp.containsKey(prefsum)){
                maxlen = Math.max(maxlen, i - mp.get(prefsum));
            }
            else{
                mp.put(prefsum, i);
            }
        }
    }
}
