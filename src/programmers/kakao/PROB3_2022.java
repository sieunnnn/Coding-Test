package programmers.kakao;

import java.util.*;

public class PROB3_2022 {
    public int solution(int alp, int cop, int[][] problems) {
        int maxAlp = 0, maxCop = 0;
        for (int[] problem : problems) {
            maxAlp = Math.max(maxAlp, problem[0]);
            maxCop = Math.max(maxCop, problem[1]);
        }

        maxAlp = Math.max(alp, maxAlp);
        maxCop = Math.max(cop, maxCop);

        int[][] dp = new int[maxAlp + 1][maxCop + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }

        dp[alp][cop] = 0;

        for (int i = 0; i <= maxAlp; i++) {
            for (int j = 0; j <= maxCop; j++) {
                if (i < maxAlp) {
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + 1);
                }
                if (j < maxCop) {
                    dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + 1);
                }
                for (int[] problem : problems) {
                    if (i >= problem[0] && j >= problem[1]) {
                        int nextAlp = Math.min(maxAlp, i + problem[2]);
                        int nextCop = Math.min(maxCop, j + problem[3]);
                        dp[nextAlp][nextCop] = Math.min(dp[nextAlp][nextCop], dp[i][j] + problem[4]);
                    }
                }
            }
        }

        return dp[maxAlp][maxCop];
    }
}
