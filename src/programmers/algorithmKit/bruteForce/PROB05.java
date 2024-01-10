package programmers.algorithmKit.bruteForce;

public class PROB05 {
    public int solution(String word) {
        int answer = word.length();
        String alphabets = "AEIOU";
        int[] increaseValues = {781, 156, 31, 6, 1};

        for(int i = 0; i < word.length(); i ++) {
            answer += increaseValues[i] * alphabets.indexOf(word.charAt(i));
        }
        return answer;
    }
}
