package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB2609 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int number1, number2;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        number1 = Integer.parseInt(st.nextToken());
        number2 = Integer.parseInt(st.nextToken());

        System.out.println(gcd(number1, number2));
        System.out.println(lcm(number1, number2));
    }

    public static int lcm (int number1, int number2) {
        return number1 * number2 / gcd(number1, number2);
    }

    public static int gcd (int number1, int number2) {
        if (number1 % number2 == 0) {
            return number2;
        }

        return gcd (number2, number1 % number2);
    }
}
