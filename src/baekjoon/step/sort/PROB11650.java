package baekjoon.step.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB11650 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[][] coordinates;
    static int N;

    public static void main (String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        coordinates = new int[N][2];

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            coordinates[i][0] = Integer.parseInt(st.nextToken());
            coordinates[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(coordinates,(o1, o2) -> {
            if (o1[0] == o2[0]) {
                return o1[1] - o2[1];
            }else {
                return  o1[0] - o2[0];
            }
        });

        for (int[] coordinate : coordinates) {
            System.out.println(coordinate[0] + " " + coordinate[1]);
        }
    }
}
