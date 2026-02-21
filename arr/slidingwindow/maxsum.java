package arr.slidingwindow;
public class maxsum{

    public static void main(String args[]){
        int[] nums = {2,1,1,3,2};
        int k = 3;
        int n = nums.length, currSum = 0, maxSum;
        for(int i = 0; i < k; i++){
            currSum += nums[i];
        }
        maxSum = currSum;
        for(int i = k; i < n; i ++){
            currSum = currSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currSum);
        }
        System.out.println(maxSum);
    }
}