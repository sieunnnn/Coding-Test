package baekjoon.step.setsAndMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class PROB11478 {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static Set<String> set = new HashSet<>();
    static String str;

    public static void main(String[] args) throws IOException {
        str = br.readLine();
        for (int i = 0; i < str.length(); i ++) {
            for (int j =i + 1; j <= str.length(); j ++) {
                set.add(str.substring(i, j));
            }
        }

        System.out.println(set.size());
    }
}
