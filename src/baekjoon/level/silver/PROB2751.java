package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB2751 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static int N;
    static int[] numbers;
    static int[] mergedNumbers;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        numbers = new int[N];
        mergedNumbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        mergeSort(0, N - 1);

        for (int number : numbers) {
            sb.append(number).append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void mergeSort(int low, int hight) {
        if (low < hight) {
            int mid = (low + hight) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, hight);
            merge(low, mid, hight);
        }
    }

    public static void merge(int low, int mid, int hight) {
        int i = low;
        int j = mid + 1;
        int k = low;

        while(i <= mid && j <= hight) {
            if (numbers[i] <= numbers[j])
                mergedNumbers[k++] = numbers[i++];
            else
                mergedNumbers[k++] = numbers[j++];
        }

        while(i <= mid)
            mergedNumbers[k++] = numbers[i++];

        while(j <= hight)
            mergedNumbers[k++] = numbers[j++];

        for(int l = low; l <= hight; l++)
            numbers[l] = mergedNumbers[l];
    }
}
