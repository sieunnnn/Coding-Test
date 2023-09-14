package SWExpertAcademy.D2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PROB1966 {

    // 오름차순 정렬
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());

            st = new StringTokenizer(br.readLine(), " ");

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < N; j++) {
                list.add(Integer.parseInt(st.nextToken()));
            }

            Collections.sort(list);

            sb.append("#").append(i + 1).append(" ");

            for (int num : list) {
                sb.append(num).append(" ");
            }

            sb.append("\n");
        }
        System.out.println(sb);

    }
}
