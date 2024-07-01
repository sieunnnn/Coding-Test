package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PROB10989 {

    /**
     * 수 정렬하기
     * @Variable N : 정렬할 수의 개수
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int[] numbers;
    static int[] countings;
    static int[] result;

//    public static void main (String[] args) throws IOException {
//        int N = Integer.parseInt(br.readLine());
//        numbers = new int[N];
//
//        for (int i = 0; i < N; i ++) {
//            numbers[i] = Integer.parseInt(br.readLine());
//        }
//
//        Arrays.sort(numbers);
//
//        for (int number : numbers) {
//            sb.append(number).append("\n");
//        }
//
//        System.out.println(sb);
//    }

    public static void main (String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        countings = new int[10000000];
        result = new int[N];

        for (int i = 0; i < N; i ++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        countingNumbers();
        cumulativeCountings();
        solve();

        for (int number : result) {
            sb.append(number).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void countingNumbers() {
        for (int number : numbers) {
            countings[number]++;
        }
    }

    public static void cumulativeCountings() {
        for (int i = 1; i < countings.length; i++) {
            countings[i] += countings[i - 1];
        }
    }

    public static void solve() {
        for (int i = numbers.length - 1; i >= 0; i --) {
            int index = numbers[i];
            countings[index]--;
            result[countings[index]] = index;
        }
    }
}
