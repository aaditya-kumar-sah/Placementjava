class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length, ans = 0, gap = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < n - 1; i ++){
            int l = i + 1, r = n - 1;
            while(l < r){
                int currSum = nums[i] + nums[l] + nums[r];
                if(currSum == target) return target;
                else if(currSum > target) r --;
                else l ++;

                int currGap = Math.abs(currSum - target);
                if(currGap < gap){
                    gap = currGap;
                    ans = currSum;
                }
            }
        }
        return ans;
    }
}