package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PROB3003 {
    /*
    체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1 개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
    동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int king = Integer.parseInt(st.nextToken());
        int queen = Integer.parseInt(st.nextToken());
        int rook = Integer.parseInt(st.nextToken());
        int bishop = Integer.parseInt(st.nextToken());
        int knight = Integer.parseInt(st.nextToken());
        int pawn = Integer.parseInt(st.nextToken());

        System.out.println((1-king) + " " + (1-queen) + " " + (2-rook) + " " + (2-bishop) + " " + (2-knight) + " " + (8 - pawn));
    }
}
