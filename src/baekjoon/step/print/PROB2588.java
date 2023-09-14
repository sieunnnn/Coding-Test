package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PROB2588 {
    /*
              4 7 2 - (1) = A
            x 3 8 5 - (2) = B
        -----------------
            2 3 6 0 - (3) = C
          3 7 7 6   - (4) = D
        1 4 1 6     - (5) = E
        -----------------
        1 8 1 7 2 0 - (6) = F

        (3), (4), (5), (6) 에 들어갈 값을 출력하세요.
     */

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int C = A * (B%10);
        int D = A * ((B%100)/10);
        int E = A * (B/100);
        int F = C + (D*10) + (E*100);

        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);

    }

}
