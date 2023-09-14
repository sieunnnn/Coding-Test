package SWExpertAcademy.D1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB1936 {

    /*
    가위 : 1, 바위 : 2, 보 : 3
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        // 기준을 A 두었을 때, 만약 A 가 1 이라면
        if (A == 1) {
            if (B == 2) {
                System.out.println("B");

            } else {
                System.out.println("A");
            }

        } else if (A == 2) {
            if (B == 3) {
                System.out.println("B");

            } else {
                System.out.println("A");
            }

        } else {
            if (B == 1) {
                System.out.println("B");

            } else {
                System.out.println("A");
            }
        }
    }
}
