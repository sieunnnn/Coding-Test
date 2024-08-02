package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB1931 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;

    static int N;
    static int[][] meetings;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        meetings = new int[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            meetings[i][0] = Integer.parseInt(st.nextToken());
            meetings[i][1] = Integer.parseInt(st.nextToken());
        }

        sortMeetings();
        System.out.println(solve());
    }

    public static void sortMeetings() {
        Arrays.sort(meetings, (o1, o2) -> {
            if (o1[1] == o2[1]) return o1[0] - o2[0];
            return o1[1] - o2[1];
        });
    }

    public static int solve() {
        int lastMeetingEndTime = 0;
        int count = 0;

        for (int[] meeting : meetings) {
            if (meeting[0] >= lastMeetingEndTime) {
                count++;
                lastMeetingEndTime = meeting[1];
            }
        }

        return count;
    }
}
