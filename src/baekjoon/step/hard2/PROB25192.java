package baekjoon.step.hard2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class PROB25192 {
    // ENTER 사이 숫자 구하기

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static HashSet<String> hashSet = new HashSet<>();
    static int cnt;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++) {
            String temp = br.readLine();

            if (temp.equals("ENTER")) {
                cnt += hashSet.size();
                hashSet.clear(); // 초기화

            } else {
                hashSet.add(temp);
            }
        }

        cnt += hashSet.size();
        System.out.println(cnt);
    }
}
