package baekjoon.level.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB10972 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] numbers;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        if (nextPermutation()) {
            for (int i = 0; i < N; i++) {
                sb.append(numbers[i]).append(" ");
            }
        } else {
            sb.append("-1");
        }

        System.out.println(sb);
    }

    public static boolean nextPermutation() {
        // 마지막 인덱스를 포함 하여 가장 긴 내림차순 배열을 찾는다.
        int i = N - 1; // 가장 긴 내림차순 배열의 시작 인덱스
        while (i > 0 && numbers[i - 1] >= numbers[i]) i--;
        if (i <= 0) return false;

        int j = N - 1;
        while (numbers[j] <= numbers[i - 1]) j--;

        swap(numbers, i - 1, j);

        j = N - 1; // 마지막 인덱스
        System.out.println("j : " + j);
        while (i < j) { // 이미 내림차순으로 정렬 되어 있기 때문에 뒤집기만 하면 됨.
            swap(numbers, i, j);
            i++;
            j--;
        }
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
