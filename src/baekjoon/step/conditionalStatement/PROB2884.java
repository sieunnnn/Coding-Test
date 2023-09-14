package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2884 {
    // 입력한 시간보다 45 분 앞서는 프로그램을 작성하세요. (단, 시간은 24 시간 표현을 사용하며, 하루의 시작은 0:0 이다.)
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H =Integer.parseInt(st.nextToken());
        int M =Integer.parseInt(st.nextToken());

        if(M <45) {
            H -= 1;
            M = 60 + (M - 45);

            if(H < 0) {
                H = 23;
            }
        } else {
            M -= 45;
        }

        System.out.println(H + " " + M);

    }
}
