package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class PROB11279 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;
    static PriorityQueue<Integer> numbers = new PriorityQueue<>(Collections.reverseOrder());

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++) {
            int input = Integer.parseInt(br.readLine());
            if(input == 0) {
                if (numbers.isEmpty()) {
                    System.out.println(0);
                } else {
                    System.out.println(numbers.poll());
                }
            } else {
                numbers.add(input);
            }
        }
    }
}
