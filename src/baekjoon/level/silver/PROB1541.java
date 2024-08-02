package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1541 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static String[] input;
    static int min;

    public static void main(String[] args) throws IOException {
        input = br.readLine().split("-");

        for (int i = 0; i < input.length; i++) {
            int total = 0;
            String[] temp = input[i].split("\\+");

            for (int j = 0; j < temp.length; j++) {
                total += Integer.parseInt(temp[j]);
            }

            if (i == 0) min += total;
            else min -= total;
        }

        System.out.println(min);
    }
}
