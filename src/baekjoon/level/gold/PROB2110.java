package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB2110 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] houses;
    static int N;
    static int C;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        houses = new int[N];

        for (int i = 0; i < N; i++) {
            houses[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(houses);
        System.out.println(solve(1, houses[N - 1] - houses[0]));
    }

    public static int solve(int min, int max) {
        if (min >= max) {
            return min;
        }

        int middle = (max + min) / 2 + 1;
        int cnt = 1;
        int start = houses[0];

        for(int i = 1; i < N; i++) {
            if (houses[i] - start >= middle) {
                cnt ++;
                start = houses[i];

                if (cnt >= C) {
                    return solve(middle, max);
                }
            }
        }

        return solve(min, middle - 1);
    }
}
