package programmers.algorithmKit.stackQueue;

import java.util.*;

public class PROB06 {
    static Queue<Integer> truckWeights = new LinkedList<>();
    static Queue<Integer> bridge = new LinkedList<>();
    static int currentBridgeWeight = 0;

    public int solution(int bridge_length, int weight, int[] truck_weights) {
        for (int truck_weight : truck_weights) {
            truckWeights.add(truck_weight);
        }

        for (int i = 0; i < bridge_length; i++) {
            bridge.add(0); // 다리 길이만큼 0으로 초기화
        }

        int time = 0;
        while (!bridge.isEmpty()) {
            time++;
            currentBridgeWeight -= bridge.poll(); // 다리에서 트럭이 나가는 것 처리

            if (!truckWeights.isEmpty()) {
                if (currentBridgeWeight + truckWeights.peek() <= weight) {
                    int truck = truckWeights.poll();
                    bridge.add(truck);
                    currentBridgeWeight += truck;

                } else { // 다리의 무게 한도를 초과하면, 다리에 트럭을 추가하지 않고 0을 추가
                    bridge.add(0);
                }
            }
        }

        return time;
    }
}
