package src.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PROB5622 {
    /*
    전화를 걸고 싶은 번호가 있다면, 숫자를 하나 누른 다음에 금속 핀이 있는 곳까지 시계방향을 돌려야 한다.
    숫자를 하나 누르면 다이얼은 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
    숫자 1 을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는 데 걸리는 시간은 이보다 더 걸리며,
    한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.

    상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다.
    즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC = 868242 와 같다.
    할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 최소 시간을 구하는 프로그램을 작성하세요.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(timeForCall(str));

    }


    private static int timeForCall(String str) {
        char[][] number = {{'A', 'B','C'}, {'D', 'E', 'F'}, {'G', 'H', 'I'}, {'J', 'K', 'L'},
                            {'M', 'N', 'O'}, {'P', 'Q', 'R', 'S'}, {'T', 'U', 'V'}, {'W', 'X', 'Y', 'Z'}};

        int time = 0;
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j < number.length; j++) {
                for (int k = 0; k < number[j].length; k++) {
                    if (number[j][k] == str.charAt(i)) {
                        time = j + 3;
                        sum += time;
                    }
                }
            }

        }

        return sum;
    }

}
