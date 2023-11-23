package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB20529 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int T, N;
    static String[] mbti;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i ++) {
            N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            mbti = new String[N];

            if(N > 32) {
                sb.append(0).append("\n");
                continue;
            }
            for (int j = 0; j < N; j ++) {
                mbti[j] = st.nextToken();
            }
            solve();
        }
        System.out.println(sb.toString());
    }

    public static void solve() {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < N; i ++) {
            for (int j = i + 1; j < N; j ++) {
                for (int k = j + 1; k < N; k ++) {
                    int distance = 0;
                    for (int s = 0; s < 4; s ++) {
                        distance += mbti[i].charAt(s) != mbti[j].charAt(s) ? 1 : 0;
                        distance += mbti[j].charAt(s) != mbti[k].charAt(s) ? 1 : 0;
                        distance += mbti[k].charAt(s) != mbti[i].charAt(s) ? 1 : 0;
                    }
                    min = Math.min(min, distance);
                    if(min == 0) break;
                }
            }
        }
        sb.append(min).append("\n");
    }
}