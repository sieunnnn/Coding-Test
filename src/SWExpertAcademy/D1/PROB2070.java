package SWExpertAcademy.D1;

import java.io.*;
import java.util.StringTokenizer;

public class PROB2070 {
    // 2개의 수를 입력 받아 크기를 비교하여 등호 또는 부등호를 출력하는 프로그램을 작성하라.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());


            if (A > B) {
                System.out.println("#" + (i+1) + " >");
            } else if (A == B) {
                System.out.println("#" + (i+1) + " =");
            } else if ((A < B)) {
                System.out.println("#" + (i+1) + " < ");
            }

        }

    }

}
