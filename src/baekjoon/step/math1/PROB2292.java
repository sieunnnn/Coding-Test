package baekjoon.step.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int n = 1;

        if(N == 1) {
            n = 1;
        } else {
            while((3*n*n - 3*n + 1) < N) {
                n++;
            }
        }
        System.out.println(n);
    }
}
