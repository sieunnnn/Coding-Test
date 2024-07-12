package elice;

import java.util.*;
import java.io.*;

class Day05 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static long[] numbers;
    static List<Long> sequence1 = new ArrayList<>();
    static List<Long> sequence2 = new ArrayList<>();
    static final int DIFFERENCE = 0;
    static final int RATIO = 1;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        int size = (int) Math.pow(2, N);
        numbers = new long[size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < size; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        if (N == 1) {
            System.out.println(numbers[numbers.length - 1]);
        } else {
            Arrays.sort(numbers);
            findElements();
            print();
            System.out.println(sb.toString());
        }
    }

    public static void findElements() {
        long d = numbers[2] - numbers[1];
        long current = numbers[2] + d;
        int index = 3;

        sequence1.add(numbers[1]);
        sequence1.add(numbers[2]);

        while(index < numbers.length) {
            if (numbers[index] == current) {
                if (sequence1.size() == N) break;

                sequence1.add(numbers[index]);
                current += d;
            }
            index++;
        }

        if (sequence1.size() != N || !checkSequence()) {
            long r;
            index = 3;

            if (numbers[2] % numbers[1] == 0) {
                r = numbers[2] / numbers[1];
                current = numbers[2] * r;

                sequence2.add(numbers[1]);
                sequence2.add(numbers[2]);

                while (index < numbers.length) {
                    if (numbers[index] == current) {
                        if (sequence2.size() == N) break;

                        sequence2.add(numbers[index]);
                        current *= r;
                    }
                    index++;
                }
            }
        }
    }

    public static boolean checkSequence() {
        int sum = 0;
        for (int i = 0; i < N - 1; i++) sum += sequence1.get(i);

        return sum == numbers[N - 1];
    }

    public static int getStatus() {
        if (sequence2.size() == N) return RATIO;
        else return DIFFERENCE;
    }

    public static void print() {
        if (getStatus() == RATIO) {
            for (long element : sequence2) sb.append(element).append(" ");
        } else {
            for (long element : sequence1) sb.append(element).append(" ");
        }
    }
}