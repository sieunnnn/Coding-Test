package src.baekjoon;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB1316 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int count = 0;
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            if (check()) {
                count++;
            }
        }
        System.out.print(count);

    }

    public static boolean check() throws IOException {
        boolean[] alphabet = new boolean[26];

        String str = br.readLine();

        int prev = 0;

        for(int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            // 앞 뒤 문자가 같지 않을 때
            if (prev != now) {
                if (!alphabet[now - 'a']) {
                    alphabet[now - 'a'] = true;

                    /*
                    만약 i = 0 인 상황이라면,
                        int now = str.charAt(0);
                        int prey = 0;
                    이므로 첫번째 if 문에 해당되는 조건 일 것이다.
                    해당되는 문자의 알파벳에 true 를 부여한 뒤, 다음 i = 1 상황으로 넘어간다고 생각해보자.
                    이때 prev 의 값을 재지정해주지 않는다면 계속 prev 의 값은 0 일 것이다.
                    따라서 아래와 같이 정의해주면 prev = str.charAt(0) 이 되고,
                    다음 반복에서 now 는 str.charAt(1) 이 되어서 각각 앞문자 뒷문자를 뜻하게 된다.
                     */

                    prev = now;

                } else return false;
            }
        }
        return true;

    }
}