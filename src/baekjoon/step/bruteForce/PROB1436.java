package baekjoon.step.bruteForce;

import java.io.*;

public class PROB1436 {

    /**
     * 666 이 들어간 숫자들을 순서대로 나열하면...
     * {666, 1666, 2666 ... 5666, 6660, 6661 ... 6669, 7666, 8666, ... }
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        System.out.println(findNth666Series(Integer.parseInt(br.readLine())));
    }
    public static int findNth666Series (int n) {
        int loop = n;
        int number = 665;
        while (loop > 0) {
            number++;
            if (String.valueOf(number).contains("666")) {
                loop--;
            }
        }
        return number;
    }
}
