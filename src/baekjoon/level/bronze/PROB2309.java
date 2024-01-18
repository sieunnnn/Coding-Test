package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PROB2309 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] heights;
    static int sum = 0;
    static int idx1 = 0;
    static int idx2 = 0;

    public static void main(String[] args) throws IOException {
        heights = new int[9];
        for(int i = 0; i < 9; i ++) {
            heights[i] = Integer.parseInt(br.readLine());
            sum += heights[i];
        }

        Arrays.sort(heights);

        for (int i = 0; i < 9; i ++) {
            for (int j = 0; j < 9; j ++) {
                if (sum - heights[i] - heights[j] == 100) {
                    idx1 = i;
                    idx2 = j;
                    break;
                }
            }
        }

        for (int i = 0; i < 9; i ++) {
            if (i == idx1 || i == idx2) {
                continue;
            }
            sb.append(heights[i]).append("\n");
        }

        System.out.println(sb.toString());
    }
}
