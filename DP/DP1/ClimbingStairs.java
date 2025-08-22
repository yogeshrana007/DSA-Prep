public class ClimbingStairs{

    // 1. Using only Recurrsion
    public static int countWays(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return countWays(n-1) + countWays(n-2);
    }

    // 2. Using memoization + rec
    public static int countWays(int n, int[] ways){
        if(n == 0 || n == 1){
            return 1;
        }
        if(ways[n] != 0){
            return ways[n];
        }
        ways[n] = countWays(n-1, ways) + countWays(n-2, ways);
        return ways[n];
    }

    // 3. Using Tabulation
    public static int countWaysTab(int n){
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public static void main(String args[]){
        int n = 5;
        System.out.println(countWays(n));

        int[] ways = new int[n+1];
        System.out.println(countWays(n, ways));

        System.out.println(countWaysTab(n));
    }
}