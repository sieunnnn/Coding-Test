package baekjoon.step.numberTheory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB1929 {
    // 소수 출력
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static ArrayList<Boolean> primes;
    static int M, N;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        primes = new ArrayList<>(N + 1); // 인덱스와 수를 맞춰주기 위해 + 1
        findPrimes();
    }

    public static void findPrimes() {
        primes.add(false);
        primes.add(false);

        for (int i = 2; i <= N; i ++) {
            primes.add(i, true);
        }

        for (int i = 2; i <= N; i ++) {
            for (int j = 2 ; i * j <= N; j++) {
                primes.set(i * j, false);
            }
        }

        for (int i = M; i <= N; i ++) {
            if (primes.get(i)) {
                System.out.println(i);
            }
        }
    }
}
