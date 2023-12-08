package baekjoon.level.silver;

import java.util.Scanner;

public class PROB5525 {
    static Scanner sc = new Scanner(System.in);
   static int N, M;
//   static String S, P;
    static char[] S;
   static int count = 0;
   static int result = 0;

//    public static void main(String[] args) {
//        N = sc.nextInt();
//        M = sc.nextInt();
//        S = sc.next();
//
//        generateString();
//        solve();
//        System.out.println(count);
//    }
//
//    public static void generateString() {
//        StringBuilder basic = new StringBuilder("IOI");
//        for(int i = 0; i < N - 1; i ++) {
//            basic.append("OI");
//        }
//
//        P = basic.toString();
//    }
//
//    public static void solve() {
//        for (int i = 0; i < S.length(); i ++) {
//            int diff = S.length() - i;
//            if (S.charAt(i) == 'I' && diff >= P.length()) {
//                String temp = S.substring(i, i + P.length());
////                System.out.println(temp);
//                if (temp.equals(P)) {
//                    count ++;
//                }
//            }
//        }
//    }

    public static void main(String[] args) {
        N = sc.nextInt();
        M = sc.nextInt();
        S = sc.next().toCharArray();
        for(int i=1; i < M - 1; i++) {
            if(S[i - 1] == 'I' && S[i] == 'O' && S[i + 1] == 'I') {
                count++;

                if(count == N) {
                    count--;
                    result++;
                }
                i++;
            }
            else {
                count = 0;
            }
        }

        System.out.println(result);
    }
}
