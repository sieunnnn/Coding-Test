package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1978 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int[] numbers;
    static boolean[] isPrime;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        numbers = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        isPrime = new boolean[1001];
        solve();
        System.out.println(find());
    }

    public static void solve() {
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i <= Math.sqrt(isPrime.length); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < isPrime.length; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static int find() {
        int result = 0;
        for (int i = 0; i < N; i++) {
            if (numbers[i] > 1 && isPrime[numbers[i]]) {
                result++;
            }
        }

        return result;
    }
}
