package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1629 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int A, B, C;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        A = Integer.parseInt(st.nextToken());
        B = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        System.out.println(solve(A, B, C));
    }

    public static long solve(int A, int B, int C) {
        if (B == 0) return 1;

        long N = solve(A, B / 2, C);
        if (B % 2 == 0) return N * N % C;
        else return (N * N % C) * A % C;
    }
}
