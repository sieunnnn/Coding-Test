package baekjoon.level.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PROB1152 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static List<String> words = new ArrayList<>();

    public static void main(String[] args) throws IOException {
         st = new StringTokenizer(br.readLine(), " ");
         while(st.hasMoreTokens()) {
             words.add(st.nextToken());
         }

        System.out.println(words.size());
    }
}
