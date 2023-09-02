package dataStructure.array.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB1236 {

    /**
     * 모든 행과 모든 열에 한 명 이상의 경비원이 있어야 함 (경비원 = X)
     * 추가해야 하는 최소 경비원의 수 구하기
     * @Variable N : 세로
     * @Variable M : 가로
     */

    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static String str;
    public static String[][] strList;


    public static void main (String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        strList = new String[N][M];

        int rowCnt = 0;
        // 입력과 동시에 행 체크
        for (int i = 0; i < N; i++) {
            str = br.readLine();
            strList[i] = str.split("");

            if (!str.contains("X")) {
                rowCnt ++;
            }
        }

        // 열체크
        int colCnt = 0;
        for (int i = 0; i < M; i ++) {
            boolean hasGuard = false;

            for (int j =0; j < N; j ++) {
                if (strList[j][i].equals("X")) {
                    hasGuard = true;
                    break;
                }
            }

            if(!hasGuard) {
                colCnt ++;
            }
        }

        System.out.println(Math.max(rowCnt, colCnt));
    }
}
