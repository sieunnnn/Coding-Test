package baekjoon.step.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB15439 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static int cnt;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i ++) {
            for (int j = i + 1; j < N; j ++) {
                cnt ++;
            }
        }

        System.out.println(cnt * 2);
    }
}
