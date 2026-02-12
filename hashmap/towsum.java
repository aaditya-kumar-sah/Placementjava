package hashmap;
import java.util.HashMap;

public class towsum {
    public int[] TowSum(int[] nums, int target){
        int n = nums.length;
        int[] ans = {-1};

        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i = 0; i < n; i ++){
            int remaining = target - nums[i];
            if(mp.containsKey(remaining)){
                ans = new int[]{i, mp.get(remaining)};
                return ans;
            }
            mp.put(nums[i],i);
        }
        return ans;

    }
    public static void main(args[]){
        int target = 13;
        int[] nums = {14, 7, 10, 4, 5, 9, 1, 2};
    }
}
