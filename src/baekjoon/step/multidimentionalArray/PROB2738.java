package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2738 {
    /*
    N*M 크기의 두 행렬 A와 B가 주어졌을 때, 두 행렬을 더하는 프로그램을 작성하세요.
    첫째 줄에 행렬의 크기 N 과 M이 주어진다. 둘째 줄부터 N개의 줄에 행렬 A의 원소 M개가 차례대로 주어진다.
    이어서 N개의 줄에 행렬 B의 원소 M개가 차례대로 주어진다.
    N과 M은 100보다 작거나 같고, 행렬의 원소는 절댓값이 100보다 작거나 같은 정수이다.
    첫째 줄부터 N개의 줄에 행렬 A와 B를 더한 행렬을 출력한다. 행렬의 각 원소는 공백으로 구분한다.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        matrix(br, sb, N, M);

    }

    private static void matrix(BufferedReader br, StringBuilder sb, int N, int M) throws IOException {
        int[][] matrix = new int[N][M];

        // 행렬 A 만들기
        for (int i = 0; i < N; i++) {
            StringTokenizer a = new StringTokenizer(br.readLine());

            for (int j = 0; j < M; j++) {
                matrix[i][j] = Integer.parseInt(a.nextToken());
            }
        }

        // 행렬 B 를 만듬과 동시에 행렬 A 더하기
        for (int i = 0; i < N; i++) {
            StringTokenizer b = new StringTokenizer(br.readLine());

            for(int j = 0; j < M; j++) {
                int sum = matrix[i][j] + Integer.parseInt(b.nextToken());
                sb.append(sum).append(" ");

            }
            sb.append("\n");

        }

        System.out.print(sb);
    }

}

