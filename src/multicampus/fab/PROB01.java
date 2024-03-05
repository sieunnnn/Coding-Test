package multicampus.fab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB01 {
    // 수의 범위를 고려 하지 않고 풀었음
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static double[] boxes;

    public static void main(String[] args) throws IOException {
        /*
        입출력 정리
        N : 상자의 수
        M : 명령의 횟수

        명령어 1 : a 번 상자에 m 개의 공을 넣는 명령어.
        명령어 2 : a 번 상자에 m 개의 공을 빼는 명령어. 단, 공의 개수가 m 개 보다 적으면 수행 하지 않음
         */

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        boxes = new double[N];
        
        solve();
        print();
    }

    public static void solve() throws IOException {
        for(int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            int command = Integer.parseInt(st.nextToken());
            double m = Double.parseDouble(st.nextToken());

            if (command == 1) {
                boxes[idx - 1] += m;
            } else {
                if (boxes[idx - 1] >= m) {
                    boxes[idx - 1] -= m;
                }
            }
        }
    }

    public static void print() {
        for (double value : boxes) {
            sb.append((long)value).append("\n");
        }

        System.out.printf(sb.toString()); // println 으로 하면 소수점이 같이 출력된다.
    }
}
