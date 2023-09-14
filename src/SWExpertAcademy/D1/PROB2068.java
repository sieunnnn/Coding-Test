package SWExpertAcademy.D1;

 import java.io.*;
 import java.util.*;

public class PROB2068 {
    //10개의 수를 입력 받아, 그 중에서 가장 큰 수를 출력하는 프로그램을 작성하라.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int max = 0;
            for(int j = 0; j < 10; j++) {
                max = Math.max(max, sc.nextInt());
            }
            System.out.println("#" + (i + 1) + " " + max);
        }

    }

}
