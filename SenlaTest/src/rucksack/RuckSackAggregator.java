package rucksack;

public class RuckSackAggregator {

    public int getValue(int[] weights, int[] costs, int maxValue){
        int N = weights.length;
        if(N != costs.length){
            return -1;
        }
        int[][] DP = new int[N+1][maxValue+1];
        for (int i = 0;i<=maxValue;i++) {
            DP[0][i] = 0;
        }
        for (int i = 0;i<=N;i++) {
            DP[i][0] = 0;
        }
        for (int k = 1;k<=N;k++) {
            for (int s = 1;s<=maxValue;s++) {
                if (s >= weights[k-1]) {
                    DP[k][s] = Math.max(DP[k - 1][s], DP[k - 1][s - weights[k-1]] + costs[k-1]);
                }
                else{
                    DP[k][s] = DP[k - 1][s];
                }
            }
        }
        return DP[N][maxValue];
    }
}
