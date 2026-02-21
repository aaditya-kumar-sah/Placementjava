package arr;

public class maxsumtar{

    public static void main(String args[]){
        int[] nums = {2,3,1,1,3,2};
        int k = 2;
        int target = 5;
        int count = 0;
        int n = nums.length;
        int currSum = 0;
        int[] res = new int[nums.length];

        for(int i = 0; i < k; i ++){
            currSum += nums[i];
            if(currSum == target){
                count ++;
            }
        }
        
        for(int i = k; i < n; i++){
            currSum = currSum - nums[i - k] + nums[i];
            if(currSum == target) count ++;
        }

        System.out.println(count);
    }
}