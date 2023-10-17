package baekjoon.step.hard2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class PROB26069 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static HashSet<String> hashSet = new HashSet<>();
    static int N;
    static String str1, str2;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            str1 = st.nextToken();
            str2 = st.nextToken();

            if (str1.equals("ChongChong") || str2.equals("ChongChong") || hashSet.contains(str1) || hashSet.contains(str2)) {
                hashSet.add(str1);
                hashSet.add(str2);
            }
        }

        System.out.println(hashSet.size());
    }
}
