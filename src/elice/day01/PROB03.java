package elice.day01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB03 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static int cnt = 0;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int area = Integer.parseInt(st.nextToken());
            int residence= Integer.parseInt(st.nextToken());
            int money = Integer.parseInt(st.nextToken());

            solve(area, residence, money);
        }

        System.out.println(cnt);
    }

    public static void solve(int area, int residence, int money) {
        if (area <= 85) {
            if (residence == 1) {
                if (money >= 300) cnt++;

            } else if (residence == 2) {
                if (money >= 250) cnt++;

            } else if (residence == 3) {
                if (money >= 200) cnt++;
            }

        } else if (area <= 102) {
            if (residence == 1) {
                if (money >= 600) cnt++;

            } else if (residence == 2) {
                if(money >= 400) cnt++;

            } else if (residence == 3) {
                if(money >= 300) cnt++;
            }

        } else if (area <= 135) {
            if (residence == 1) {
                if (money >= 1000) cnt++;

            } else if (residence == 2) {
                if (money >= 700) cnt++;

            } else if (residence == 3) {
                if(money >= 400) cnt++;
            }

        } else {
            if (residence == 1) {
                if (money >= 1500) cnt++;

            } else if (residence == 2) {
                if (money >= 1000) cnt++;

            } else if (residence == 3) {
                if(money >= 500) cnt++;
            }
        }
    }
}
