package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2525 {
    /*
    첫째 줄에는 현재 시각이 빈칸을 사이에 두고 주어진다. (24 시간제 이며, 23시 59 분에서 1 분이 지나면 0 시 0 분이 된다.)
    둘째 줄에는 요리 하는 데 필요한 시간 C 가 분 단위로 주어진다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        int H = ((A*60) + B + C)/60;
        int M = ((A*60) + B + C)%60;

        if(H>23) {
            H -= 24;
        }

        System.out.println(H + " " + M);

    }
}
