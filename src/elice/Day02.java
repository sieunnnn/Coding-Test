package elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day02 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;
    static int N, M;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        numbers = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken()) - 1;
            int end = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken()) - 1;

            solve(start, end, target);
        }

        System.out.println(sb.toString());
    }

    public static void solve(int start, int end, int target) {
        int[] temp = Arrays.copyOfRange(numbers, start, end);
//        System.out.println(Arrays.toString(temp));
        Arrays.sort(temp);
        sb.append(temp[target]).append("\n");
    }
}
