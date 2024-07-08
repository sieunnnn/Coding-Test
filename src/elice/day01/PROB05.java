package elice.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB05 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N, M;
    static double[] attacks;
    static double answer = 0.0;
    static int index = 0;
    static double[] alleviation = {0.7, 0.5, 0.4, 0.3};

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        attacks = new double[N + 1];

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            attacks[i] = Integer.parseInt(st.nextToken());

            if (i > M) {
                if (index > 3) {
                    attacks[i] *= alleviation[3];

                } else {
                    attacks[i] *= alleviation[index++];
                }
            }
        }

//        System.out.println(Arrays.toString(attacks));
        for (double attack : attacks) {
            answer += attack;
        }

        System.out.println(Math.round(answer * 100) / 100.0);
    }
}
