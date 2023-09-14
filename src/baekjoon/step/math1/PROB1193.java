package baekjoon.step.math1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        if(X == 1) {
            System.out.println("1/1");

        } else {
            int n = 0;
            int sum = 0;

            while( sum < X) {
                n++;
                sum = n*(n+1)/2;
            }

            int number = X - n*(n-1)/2;
            int up;
            int down;

            if(n%2 == 0) {
                up = number;
                down = (n+1) - number;
            } else {
                up = (n+1) - number;
                down = number;
            }
            System.out.println(up + "/" + down);

        }
    }
}
