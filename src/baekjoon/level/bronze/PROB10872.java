package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB10872 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        System.out.println(solve(N));
    }

    public static int solve(int i) {
        if (i == 0 || i == 1) {
            return 1;
        }

        return solve(i - 1) * i;
    }
}
