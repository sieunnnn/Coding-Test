package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PROB2504 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] temp;
    static Stack<String> brackets = new Stack<>();
    static final int SQUARE_BRACKET = 3;
    static final int NORMAL_BRACKET = 2;
    static int answer = 0;
    static int sum = 1;

    public static void main(String[] args) throws IOException {
        temp = br.readLine().split("");

        for (int i = 0; i < temp.length; i++) {
            String current = temp[i];
            if (current.equals("(")) {
                brackets.push(current);
                sum *= NORMAL_BRACKET;

            } else if (current.equals("[")) {
                brackets.push(current);
                sum *= SQUARE_BRACKET;

            } else if (current.equals(")")) {
                if (brackets.isEmpty() || !brackets.peek().equals("(")) {
                    answer = 0;
                    break;

                } else if (temp[i - 1].equals("(")) {
                    answer += sum;
                }

                brackets.pop();
                sum /= NORMAL_BRACKET;

            } else if (current.equals("]")) {
                if (brackets.isEmpty() || !brackets.peek().equals("[")) {
                    answer = 0;
                    break;

                } else if (temp[i - 1].equals("[")) {
                    answer += sum;
                }

                brackets.pop();
                sum /= SQUARE_BRACKET;
            }
        }

        if (!brackets.isEmpty()) {
            System.out.println(0);

        } else {
            System.out.println(answer);
        }
    }
}