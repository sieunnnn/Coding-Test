package gold;

import java.io.*;

public class PROB9251 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] str1;
    static String[] str2;
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        str1 = br.readLine().split("");
        str2 = br.readLine().split("");
        dp = new int[str1.length + 1][str2.length + 1];

        LCS();
        System.out.println(dp[str1.length][str2.length]);
    }

    public static void LCS() {
            for (int i = 0; i < str1.length; i++) {
                for (int j = 0; j < str2.length; j++) {
                    if (str1[i].equals(str2[j])) {
                        dp[i + 1][j + 1] = dp[i][j] + 1;

                    } else {
                        dp[i + 1][j + 1] = Math.max(dp[i + 1][j], dp[i][j  + 1]);
                    }
                }
            }
    }
}
