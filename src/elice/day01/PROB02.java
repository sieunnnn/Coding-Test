package elice.day01;

import java.io.*;

public class PROB02 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static int N;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());

        System.out.println(find(N));
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int find(int n) {
        int lowerPrime = n - 1;
        while(lowerPrime >= 2) {
            if (isPrime(lowerPrime)) {
                return lowerPrime;
            }
            --lowerPrime;
        }

        int upperPrime = n + 1;
        while (true) {
            if (isPrime(upperPrime)) {
                return upperPrime;
            }
            ++upperPrime;
        }
    }
}