public class Solution {
//
//    private int myrob(int index, int[] nums) {
//        if (index == 0)
//            return nums[0];
//        else if (index == 1)
//            return Math.max(nums[0], nums[1]);
//        else {
//            return Math.max(myrob(index - 1, nums), myrob(index - 2, nums) + nums[index]);
//        }
//    }

//    可以用动态规划，也可以记忆化搜索
    public int rob(int[] nums) {
        if (nums.length==0)
            return 0;
        else if (nums.length==1)
            return nums[0];
        else if (nums.length==2)
            return Math.max(nums[0], nums[1]);
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];

    }

}