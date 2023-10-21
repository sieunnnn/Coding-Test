package baekjoon.step.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB4779 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int number;
    static int index;
    static int blankIndex;

    public static void main(String[] args) throws IOException {
        while (true) {
            String temp = br.readLine();
            if (temp == null) break;
            number = Integer.parseInt(temp);

            System.out.println(recursion(number));
        }
    }

    public static String recursion (int number) {
        StringBuilder sb = new StringBuilder();
        index = (int) Math.pow(3, number - 1);

        if (number == 0) {
            return "-";
        }

       for (int i = 0; i < index; i ++) {
           sb.append(" ");
       }

       String str = recursion(number - 1);

        return str + sb + str;
    }
}
