package baekjoon.step.binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB1920 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N, M;
    static int[] A;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        A = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        M = Integer.parseInt(br.readLine());
        numbers = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            System.out.println(binarySearch(numbers[i]));
        }
    }

    public static int binarySearch(int number) {
        int startIdx = 0;
        int endIdx = A.length - 1;
        int middleIdx;

        while(startIdx <= endIdx) {
            middleIdx = (startIdx + endIdx) / 2;
            if (A[middleIdx] == number) {
                return 1;
            } else if (A[middleIdx] < number){
                startIdx = middleIdx + 1;
            } else if (A[middleIdx] > number) {
                endIdx = middleIdx - 1;
            }
        }
        return 0;
    }
}
