package programmers.kakao;

import java.util.*;

public class PROB3_2021 {
    public String solution(int n, int k, String[] cmd) {
        Stack<Integer> removeOrder = new Stack<Integer>();
        int tableSize = n;

        for(int i = 0; i < cmd.length; i ++) {
            char c = cmd[i].charAt(0);
            if(c == 'D')
                k += Integer.parseInt(cmd[i].substring(2));
            else if(c == 'U')
                k -= Integer.parseInt(cmd[i].substring(2));
            else if(c == 'C') {
                removeOrder.add(k);
                tableSize--;
                if(k == tableSize)
                    k--;
            }
            else if(c == 'Z') {
                if(removeOrder.pop() <= k)
                    k++;
                tableSize++;
            }
        }

        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < tableSize; i++) {
            builder.append("O");
        }

        while(!removeOrder.isEmpty()) {
            builder.insert(removeOrder.pop().intValue(), "X");
        }

        String answer = builder.toString();
        return answer;
    }
}
