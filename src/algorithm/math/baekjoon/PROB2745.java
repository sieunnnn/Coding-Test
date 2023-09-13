package algorithm.math.baekjoon;

import com.sun.jdi.IntegerValue;

import java.util.Scanner;

public class PROB2745 {
    // B 진법의 수 N 을 10 진법으로 바꾸기

    static Scanner sc = new Scanner(System.in);
    static String[] strings = new String[2];

    public static void main (String[] args) {
        strings = sc.nextLine().split(" ");
        System.out.println(Integer.valueOf(strings[0], Integer.parseInt(strings[1])));
    }
}
