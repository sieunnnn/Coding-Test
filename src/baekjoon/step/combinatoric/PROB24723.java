package baekjoon.step.combinatoric;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB24723 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        System.out.println((int) Math.pow(2, N));
    }
}
