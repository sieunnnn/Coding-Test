package multicampus.fab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class PROB03 {
    // 부분 점수를 받은 문제. 아마 단어가 있는지 확인 하는 부분을 잘못 처리한 것 같다.
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int M;
    static HashSet<String> A = new HashSet<>();
    static HashSet<String> B = new HashSet<>();


    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        generateHashSet();
        solve();
        print();
    }

    public static void generateHashSet() throws IOException{
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i ++) {
            A.add(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            B.add(st.nextToken());
        }
    }

    public static void solve() throws IOException {
        for(int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (A.contains(a) && B.contains(b)) {
                A.remove(a);
                B.remove(b);
                A.add(b);
                B.add(a);
            }
        }
    }

    public static void print() {
        ArrayList<String> words = new ArrayList<>(A);
        Collections.sort(words);
        for(String word : words) {
            sb.append(word).append(" ");
        }

        System.out.println(sb);
    }
}
