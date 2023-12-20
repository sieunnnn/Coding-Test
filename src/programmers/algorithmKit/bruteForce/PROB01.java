package programmers.algorithmKit.bruteForce;

public class PROB01 {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth = 0;
        int maxHeight = 0;

        for(int i = 0; i < sizes.length; i ++) {
            int x = sizes[i][0];
            int y = sizes[i][1];

            sizes[i][0] = Math.max(x, y);
            sizes[i][1] = Math.min(x, y);

            maxWidth = Math.max(maxWidth, sizes[i][0]);
            maxHeight = Math.max(maxHeight, sizes[i][1]);
        }

        return maxWidth * maxHeight;
    }
}
