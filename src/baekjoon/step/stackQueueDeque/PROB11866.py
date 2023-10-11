# 요세푸스 문제는 다음과 같다.
# 1 번부터 N 번까지 N 명의 사람이 원을 이루면서 앉아있고, 양의 정수 K 가 주어진다.
# 이제 순서대로 K 번째 사람을 제거한다.


from collections import deque


# N 과 K 를 입력받는다.
N, K = map(int, input().split())

# 큐 구현
queue = deque()

for i in range(1, N + 1) :
    queue.append(i)

print("<", end='')

# 제거하기
while (queue) :
    for i in range(K - 1) :
        queue.append(queue.popleft())

    print(queue.popleft(), end='')

    if queue :
        print(', ', end='')

print(">")