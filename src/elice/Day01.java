package elice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Day01 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String[] N;
    static int input = 0;
    static int answer = Integer.MAX_VALUE;
    static boolean[] visited;
    static List<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        N = br.readLine().split("");
        visited = new boolean[N.length];

        saveInput();
        solve(0, "");
        findAnswer();

        System.out.println(answer);
    }

    public static void saveInput() {
        String temp = "";

        for (String n : N) {
            temp += n;
        }

        input = Integer.parseInt(temp);
    }

    public static void solve(int depth, String number) {
        if(depth == N.length) {
            numbers.add(Integer.parseInt(number));
            return ;
        }

        for (int i = 0; i < N.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                solve(depth + 1, number + N[i]);
                visited[i] = false;
            }
        }
    }

    public static void findAnswer() {
        for (int number : numbers) {
            if (number > input && number < answer) {
                answer = number;
            }
        }
    }
}
