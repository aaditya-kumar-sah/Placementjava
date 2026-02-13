package hashset;
import java.util.*;

public class hashset {
    public int longestConsecutive(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums) st.add(num);

        for(int num: st){
            if(!st.contains(num - 1)){// num is starting point of the sequence
                int currNum = num;
                int currStreak = 1;
                while(st.contains(currNum + 1)){
                    currStreak ++;
                    currNum ++;
                    
                }
            }
        }
    }
}

