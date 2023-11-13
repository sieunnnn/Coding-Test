package baekjoon.level.bronze;

import java.io.IOException;
import java.util.Scanner;

public class PROB1259 {
    static Scanner sc = new Scanner(System.in);
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        while (true) {
            String numbers = sc.next();
            if (numbers.equals("0")) {
                break;
            } else {
                if (numbers.length() == 1) {
                    sb.append("yes").append("\n");
                } else {
                    solve(numbers);
                }
            }
        }
        System.out.println(sb);
    }

    public static void solve(String numbers) {
        int startIdx = 0;
        int lastIdx = numbers.length() - 1;
        boolean flag = false;

        while (startIdx < lastIdx) {
            if (numbers.charAt(startIdx) == numbers.charAt(lastIdx)) {
                startIdx ++;
                lastIdx --;
                flag = true;
            } else  {
                flag = false;
                break;
            }
        }

        if (flag) {
            sb.append("yes").append("\n");
        } else {
            sb.append("no").append("\n");
        }
    }
}
