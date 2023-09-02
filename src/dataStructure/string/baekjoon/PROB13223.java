package dataStructure.string.baekjoon;

import java.util.Scanner;

public class PROB13223 {
    // 현재시간과 실행 시간 사이의 시간차 구하기 (24 시간)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String currentArr[] = sc.next().split(":");
        String actionArr[] = sc.next().split(":");

        int currentHour = Integer.parseInt(currentArr[0]);
        int currentMin = Integer.parseInt(currentArr[1]);
        int currentSec = Integer.parseInt(currentArr[2]);
        int currentTime = (currentHour * 3600) + (currentMin * 60) + currentSec;

        int actionHour = Integer.parseInt(actionArr[0]);
        int actinoMin = Integer.parseInt(actionArr[1]);
        int actionSec = Integer.parseInt(actionArr[2]);
        int actionTime = (actionHour * 3600) + (actinoMin * 60) + actionSec;

        int answerTime = actionTime - currentTime;
        if (answerTime <= 0) {
            answerTime += 24 * 3600;
        }

        int hour = answerTime / 3600;
        int min = answerTime % 3600 / 60;
        int sec = answerTime % 60;


        System.out.printf("%02d:%02d:%02d", hour, min, sec);
    }
}
