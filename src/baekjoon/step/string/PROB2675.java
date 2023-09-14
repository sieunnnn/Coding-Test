package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2675 {
    // 문자열 S를 입력받은 후에, 각 문자를 R번 반복해서 새 문자열 P를 만든 후 출력하는 프로그램을 작성하세요.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for(int i = 0; i < T; i ++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            StringBuilder sb = new StringBuilder();

            int R = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) {


                for (int k = 0; k < R; k++) {
                    sb.append(str.charAt(j));
                }

            }
            System.out.println(sb);
        }

    }

}
