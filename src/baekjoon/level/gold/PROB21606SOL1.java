package gold;

import java.io.*;
import java.util.*;

public class PROB21606SOL1 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st;
    static Map<Integer, Integer> map = new HashMap<>();
    static String[] temp;
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    static int N;
    static int count = 0;

    static final int OUT_PLACE = 0;
    static final int IN_PLACE = 1;

    public static void main(String[] args) throws IOException {
        N = Integer.parseInt(br.readLine());
        temp = br.readLine().split("");
        initMap();
        initGraph();

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for (int i = 1; i <= N; i++) {
            if (map.get(i) == IN_PLACE) {
                visited = new boolean[N + 1];
                countPaths(i);
            }
        }

        System.out.println(count);
    }

    public static void initMap() {
        for (int i = 0; i < temp.length; i++) {
            map.put(i + 1, Integer.parseInt(temp[i]));
        }
    }

    public static void initGraph() {
        for (int i = 0; i < N + 1; i++) {
            graph.add(new ArrayList<>());
        }
    }

    /*
    1. 시작점과 끝점은 모두 실내 (1)
    2. 산책 도중에 실내를 만나면 안됨
    =================================
    [탈출 조건]
    1. 시작점이 실외인 경우
    2. depth 가 1 이상인데 현재 지점이 실내인 경우
    3. 시작후 바로 그 다음점이 실내인 경우
    =================================
    [주의]
    1 -> 4 와 4 -> 1 은 다르다.
     */
    public static void countPaths(int start) {
        visited[start] = true;

        for (int neighbor : graph.get(start)) {
            if (map.get(neighbor) == IN_PLACE) count++;
            else if (!visited[neighbor] && map.get(neighbor) == OUT_PLACE) dfs(neighbor, start);
        }
    }

    public static void dfs(int current, int start) {
        visited[current] = true;

        for (int neighbor : graph.get(current)) {
            if (neighbor != start && map.get(neighbor) == IN_PLACE) count++;
            else if (!visited[neighbor] && map.get(neighbor) == OUT_PLACE) dfs(neighbor, start);
        }
    }
}