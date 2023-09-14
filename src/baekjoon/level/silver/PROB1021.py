# 지민이의 연산
# 1. 첫번째 원소를 뽑아낸다.
# 2. 왼쪽으로 한 칸 이동시킨다.
# 3. 오른쪽으로 한 칸 이동시킨다.


from collections import deque

N, M = map(int, input().split())
# 뽑아내려는 수
numbers_to_pop = list(map(int, input().split()))
# 덱 구현
deque = deque(i for i in range(1, N + 1))

# 결과
result = 0

for number in numbers_to_pop :
    while True :
        if deque[0] == number :
            deque.popleft()
            break
        else :
            # 덱에서의 number 의 인덱스 번호가 덱 길이의 1/2 보다 작다면
            # 즉, 덱 절반의 왼쪽에 있다면 반시계 방향으로 회전
            if deque.index(number) < len(deque) / 2 :
                deque.rotate(-1)
                result += 1

            else :
                deque.rotate(1)
                result += 1

print(result)