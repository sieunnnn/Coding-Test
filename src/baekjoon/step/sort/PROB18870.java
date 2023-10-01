package baekjoon.step.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class PROB18870 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static HashMap<Integer, Integer> map = new HashMap<>();
    static int N;
    static int[] numbers;
    static int[] orders;
    static int order = 0;

    public static void main(String[] args) throws IOException{
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        numbers = new int[N];
        orders = new int[N];
        for (int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(st.nextToken());
            orders[i] = numbers[i];
        }

        Arrays.sort(orders);

        for (int number : orders) {
            if (map.get(number) != null) continue;
            map.put(number, order);
            order ++;
        }

        for (int number : numbers) {
            sb.append(map.get(number)).append(" ");
        }

        System.out.println(sb.toString());
    }
}
