package baekjoon;

import java.io.*;
import java.util.*;


public class PROB25314 {

    public static void main(String[] args) throws IOException{
        /*
        첫번째 줄에는 문제의 정수 N 이 주어 진다.
        long int = 4 byte
        long 이 더 붙을 때마다 + 4 byte?
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int quotient = N / 4;

        for (int i=0; i < quotient; i++) {

            sb.append("long ");
        }

        System.out.println(sb.append("int"));
    }
}
