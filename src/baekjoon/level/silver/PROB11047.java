package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB11047 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int[] coins;
    static int N;
    static int K;
    static int idx;
    static int cnt;
    static int remainCoin;

    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        coins = new int[N];

        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            coins[i] = Integer.parseInt(st.nextToken());
        }

        idx = coins.length - 1;
        remainCoin = K;
        while (idx > 0) {
            cnt += remainCoin / coins[idx];
            remainCoin %= coins[idx];
            idx --;
        }

        cnt += remainCoin;

        System.out.println(cnt);
    }
}
