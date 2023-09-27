package baekjoon.step.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PROB10814 {
    
    // 나이 순, 나이가 같으면 가입한 순으로 나이와 이름을 공백으로 구분하여 출력
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static int N;
    static String[][] users;
    
    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        
        users = new String[N][3];
        for (int i = 0; i < N; i ++) {
            st = new StringTokenizer(br.readLine());
            users[i][0] = st.nextToken();
            users[i][1] = st.nextToken();
            users[i][2] = String.valueOf(i);
        }

        Arrays.sort(users, ((o1, o2) -> {
            if (o1[0].equals(o2[0])) {
                return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]);
            } else {
                return Integer.parseInt(o1[0]) - Integer.parseInt(o2[0]);
            }
        }));

        for (String[] user : users) {
            System.out.println(user[0] + " " + user[1]);
        }
    }
}
