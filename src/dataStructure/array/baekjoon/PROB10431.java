package dataStructure.array.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB10431 {

    /**
     * 자기 앞에 자기보다 키가 큰 학생이 없다면 그냥 그 자리에 서고 차례가 끝난다
     * 자기 앞에 자기보다 키가 큰 학생이 한 명 이상 있다면 그중 가장 앞에 있는 학생(A)의 바로 앞에 선다.
     * 이때, A부터 그 뒤의 모든 학생들은 공간을 만들기 위해 한 발씩 뒤로 물러서게 된다.
     * 학생들이 총 몇 번 뒤로 물러서게 될까?
     * 학생은 항상 20 명
     *
     * @Variable P : 테스트 케이스
     *
     * 이중포문으로 i 앞의 학생들을 순차적으로 보면서 더 큰 학생이 몇명인지 파악한다.
     * 더 큰 학생수만큼 뒤로 물러나게 된다.
     */

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;
    static int[] students;
    static int cnt;

    public static void main (String[] args) throws IOException {

        int P = Integer.parseInt(br.readLine());
        students = new int[21];

        for (int i = 0; i < P; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < students.length; j++) {
                students[j] = Integer.parseInt(st.nextToken());
            }

            cnt = 0;
            for (int j = 1; j < 21; j++) {
                for (int k = 1; k < j; k++) {
                    if (students[k] > students[j]) {
                        cnt ++;
                    }
                }
            }

            sb.append(i + 1).append(" ").append(cnt).append("\n");;
        }

        System.out.println(sb);
    }
}
