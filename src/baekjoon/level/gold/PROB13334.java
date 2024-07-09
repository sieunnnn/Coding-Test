package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PROB13334 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int d;
    static int[][] lines;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        lines = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            if (start > end) {
                int temp = start;
                start = end;
                end = temp;
            }

            lines[i][0] = start;
            lines[i][1] = end;
        }

        d = Integer.parseInt(br.readLine());

        Arrays.sort(lines, (o1, o2) -> {
            if(o1[1] == o2[1]) return o1[0] - o2[0];
            else return o1[1] - o2[1];
        });

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int maxCount = 0;

        for (int[] line : lines) {
            int start = line[0];
            int end = line[1];

            if (end - start <= d) {
                pq.add(start);
            }

            while (!pq.isEmpty() && pq.peek() < end - d) {
                pq.poll();
            }

            maxCount = Math.max(maxCount, pq.size());
        }

        System.out.println(maxCount);
    }
}
