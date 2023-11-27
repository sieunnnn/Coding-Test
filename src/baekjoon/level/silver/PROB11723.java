package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class PROB11723 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Set<Integer> set = new HashSet<>();
    static StringBuilder sb = new StringBuilder();
    static int M;
    static String command;
    static int number;

    public static void main(String[] args) throws IOException {
        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i ++) {
            st = new StringTokenizer(br.readLine());
            command = st.nextToken();
            if (!command.equals("all") && !command.equals("empty")) {
                number = Integer.parseInt(st.nextToken());
            }
            solve(command, number);
        }
        System.out.println(sb.toString());
    }

    public static void solve(String command, int number) {
        if (command.equals("add")) {
            set.add(number);
        } else if (command.equals("remove")) {
            set.remove(number);
        } else if (command.equals("check")) {
            if (set.contains(number)) {
                sb.append(1).append("\n");
            } else {
                sb.append(0).append("\n");
            }
        } else if (command.equals("toggle")) {
            if (set.contains(number)) {
                set.remove(number);
            } else {
                set.add(number);
            }
        } else if (command.equals("all")) {
            set.clear();
            for (int i = 1; i <= 20; i ++) {
                set.add(i);
            }
        } else if (command.equals("empty")) {
            set.clear();
        }
    }
}
