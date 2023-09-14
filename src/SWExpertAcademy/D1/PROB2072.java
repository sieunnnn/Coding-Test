package SWExpertAcademy.D1;

import java.io.*;

public class PROB2072 {
    /*
    10개의 수를 입력 받아, 그 중에서 홀수만 더한 값을 출력하는 프로그램을 작성하라.

    출력의 각 줄은 '#t'로 시작하고, 공백을 한 칸 둔 다음 정답을 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int sum = 0;

            String numbers[] = br.readLine().split(" ");
            for (String number : numbers) {
                int num = Integer.parseInt(number);
                if (num % 2 != 0) {
                    sum += num;
                }
            }

            System.out.println("#" + (i+1) + " " + sum);

        }
    }
}