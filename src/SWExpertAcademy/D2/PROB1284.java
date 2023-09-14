package SWExpertAcademy.D2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1284 {

    /*
    입력 : P Q R S W
    A 사 : P/L
    B 사 : Q 원 + R 초과시 S/L
    출력 : 더 저렴한 회사
     */

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            // A 사
            int A = P * W;

            // B 사
            int B = W - R < 0 ? Q : (W - R) * S + Q;

            int answer = A > B ? B : A;

            sb.append("#").append(i + 1).append(" ").append(answer).append("\n");
        }

        System.out.println(sb);
    }
}
