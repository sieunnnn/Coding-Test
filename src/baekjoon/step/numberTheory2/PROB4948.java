package baekjoon.step.numberTheory2;

import java.util.ArrayList;
import java.util.Scanner;

public class PROB4948 {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Boolean> primes = new ArrayList<>();
    static int index = 123456 * 2;
    static int n;

    public static void main(String[] args){
        getPrimes();

        while (true) {
            n = sc.nextInt();
            if (n == 0) break;
            getResult(n);
        }
    }

    public static void getPrimes() {
        primes.add(false);
        primes.add(false);

        for (int i = 2; i <= index; i ++) {
            primes.add(i, true);
        }

        for (int i = 2; i <= index; i ++) {
            for (int j = 2; i * j <= index; j ++) {
                primes.set(i * j, false);
            }
        }
    }

    public static void getResult(int n) {
        int cnt = 0;

        for (int i = n + 1; i <= 2 * n; i ++) {
            if (primes.get(i)) {
                cnt ++;
            }
        }

        System.out.println(cnt);
    }
}
