package SWExpertAcademy.D1;

import java.io.IOException;
import java.util.Scanner;

public class PROB2046 {

    /*
    주어진 숫자만큼 # 출력하기
     */

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.print("#");
        }
    }
}
