package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2630 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int[][] graph;
    static int whitePaperCnt = 0;
    static int bluePaperCnt = 0;
    static final int BLUE = 1;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        graph = new int[N][N];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++) {
                graph[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        solve(0, 0, N);

        System.out.println(whitePaperCnt);
        System.out.println(bluePaperCnt);
    }

    public static void solve(int y, int x, int length) {
        if (check(y, x, length)) {
            if (graph[y][x] == BLUE) {
                bluePaperCnt++;
            } else {
                whitePaperCnt++;
            }
        } else {
            int newLength = length / 2;

            solve(y, x, newLength);
            solve(y, x + newLength, newLength);
            solve(y + newLength, x, newLength);
            solve(y + newLength, x + newLength, newLength);
        }
    }

    public static boolean check(int y, int x, int length) {
        int color = graph[y][x];

        for (int i = y; i < y + length; i++) {
            for (int j = x; j < x + length; j++) {
                if (graph[i][j] != color) return false;
            }
        }

        return true;
    }
}
