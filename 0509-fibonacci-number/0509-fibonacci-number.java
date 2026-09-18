import java.util.Arrays;

class Solution {
    int fibonacci(int n, int[] dp) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        if (dp[n] != -1) return dp[n];

        int first = fibonacci(n - 1, dp);
        int second = fibonacci(n - 2, dp);

        dp[n] = first + second;
        return dp[n];
    }

    public int fib(int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);
        int ans = fibonacci(n, dp);
        return ans;
    }
}