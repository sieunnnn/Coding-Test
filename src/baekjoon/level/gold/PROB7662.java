package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PROB7662 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();

    static final String EMPTY = "EMPTY";
    static final int DELETE_MAX_OPER = 1;
    static final int DELETE_MIN_OPER = -1;
    static int T;
    static int Q;

    static PriorityQueue<Integer> reversePq;
    static PriorityQueue<Integer> pq;
    static HashMap<Integer, Integer> map;

    public static void main(String[] args) throws IOException {
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            reversePq = new PriorityQueue<>(Collections.reverseOrder());
            pq = new PriorityQueue<>();
            map = new HashMap<>();

            Q = Integer.parseInt(br.readLine());

            for (int j = 0; j < Q; j++) {
                st = new StringTokenizer(br.readLine());
                String operation = st.nextToken();
                int number = Integer.parseInt(st.nextToken());

                if (operation.equals("I")) {
                    pq.add(number);
                    reversePq.add(number);
                    map.put(number, map.getOrDefault(number, 0) + 1);

                } else if (operation.equals("D")) {
                    if (number == DELETE_MIN_OPER) {
                        remove(pq);
                        if (!pq.isEmpty()) {
                            int min = pq.poll();
                            map.put(min, map.get(min) - 1);
                        }
                    } else if (number == DELETE_MAX_OPER) {
                        remove(reversePq);
                        if (!reversePq.isEmpty()) {
                            int max = reversePq.poll();
                            map.put(max, map.get(max) - 1);
                        }
                    }
                }
            }

            remove(pq);
            remove(reversePq);

            if (reversePq.isEmpty() && pq.isEmpty()) sb.append(EMPTY).append("\n");
            else sb.append(reversePq.peek()).append(" ").append(pq.peek()).append("\n");
        }

        System.out.println(sb.toString());
    }

    static void remove(PriorityQueue<Integer> pq) {
        while (!pq.isEmpty() && map.get(pq.peek()) == 0) {
            pq.poll();
        }
    }
}
