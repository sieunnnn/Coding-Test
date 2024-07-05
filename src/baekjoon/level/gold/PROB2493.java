package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class PROB2493 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Stack<int[]> towers = new Stack<>();
    static StringBuilder sb = new StringBuilder();
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i < N + 1; i++) {
            int[] current = new int[]{i, Integer.parseInt(st.nextToken())};
            while(!towers.isEmpty()) {
                if (towers.peek()[1] >= current[1]) {
                    sb.append(towers.peek()[0]).append(" ");
                    break;
                }
                towers.pop();
            }
            if (towers.isEmpty()) {
                sb.append(0).append(" ");
            }
            towers.push(current);
        }

        System.out.println(sb.toString());
    }
}
