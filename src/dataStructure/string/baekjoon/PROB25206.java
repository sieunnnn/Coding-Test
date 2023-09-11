package dataStructure.string.baekjoon;

import java.util.HashMap;
import java.util.Scanner;

public class PROB25206 {
    // p 제외 전공 평점 구하기
    static HashMap<String, Double> map = new HashMap<>();
    static Scanner sc = new Scanner(System.in);
    static String[][] scores = new String[20][3];
    static double sumA = 0.0;
    static double sumB = 0.0;

    public static void main(String[] args) {
        // 과목 넣기
        map.put("A+", 4.5);
        map.put("A0", 4.0);
        map.put("B+", 3.5);
        map.put("B0", 3.0);
        map.put("C+", 2.5);
        map.put("C0", 2.0);
        map.put("D+", 1.5);
        map.put("D0", 1.0);
        map.put("F", 0.0);


        for (int i  = 0; i < 20; i ++) {
            String[] temp = sc.nextLine().split(" ");

            for (int j = 0; j < 3; j ++) {
                scores[i][j] = temp[j];
            }
        }

        for (String[] score : scores) {
            if (!score[2].equals("P")) {
                sumA += Double.parseDouble(score[1]) * map.get(score[2]);
                sumB += Double.parseDouble(score[1]);
            }
        }

        System.out.printf("%f", sumA / sumB);
    }
}
