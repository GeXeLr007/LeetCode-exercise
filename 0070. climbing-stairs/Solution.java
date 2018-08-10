public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] arr = new int[][]{};
        System.out.println(solution.climbStairs(2));
    }

//    使用记忆化搜索才能不超时
    private int climb(int n, int[] memo) {
        if (memo[n] != 0) {
            return memo[n];
        }

        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        } else {
            memo[n] = climb(n - 1, memo) + climb(n - 2, memo);
            return memo[n];
        }
    }

    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return climb(n, memo);

    }

}