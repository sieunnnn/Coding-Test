package baekjoon;

public class PROB15596 {
    /*
    정수 n 개가 주어졌을 때, n 개의 합을 구하는 함수를 작성하세요.

    Java: long sum(int[] a);
        a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
        리턴값: a에 포함되어 있는 정수 n개의 합
     */

    long sum(int[] a) {
        long result = 0;

        for (int i = 0; i < a.length; i++) {
            result += a[i];
        }

        return result;
    }

}
