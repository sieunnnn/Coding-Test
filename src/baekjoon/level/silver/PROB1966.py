# 상근이가 개발한 프린터
# 현재 Queue 의 가장 앞에 있는 문서의 '중요도' 를 확인한다
# 나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고
# Queue 의 디에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.

# 풀이 1

import sys
from collections import deque

# 테스트 케이스의 개수 받기
T = int(input())

# que 구현하기
queue = deque()


for i  in range(T) :
    # 문서의 개수와 원하는 문서의 index 번호 입력받기
    N, M = map(int, sys.stdin.readline().split())
    # 문서의 우선순위 입력받기
    weight = list(map(int, sys.stdin.readline().split()))
    # weight 의 인덱스번호와 값을 같이 저장 (튜플)
    queue = [i for i in enumerate(weight)]
    # 원하는 문서가 몇번째로 인쇄되었는지 확인하기 위한 count
    count = 0

    while True :
        # 맨 왼쪽의 값
        left = queue.pop(0)

        # 맨 왼쪽의 값과 그 다음 index 의 값을 비교, 다음 값 중에 우선순위가 큰 값이
        # 한개라도 존재 한다면, 출력을 하지 않고 queue 의 맨 뒤로 보낸다.
        if any(left[1] < i[1] for i in queue) :
            queue.append(left)
        else :
            # 위의 상황이 아니라면 출력
            # 순서 올려주기
            count += 1

            if left[0] == M :
                print(count)
                break


################################################################

# 풀이 2

import sys
from collections import deque

# 테스트 케이스의 개수 받기
T = int(input())

# que 구현하기
queue = deque()


for i  in range(T) :
    # 문서의 개수와 원하는 문서의 index 번호 입력받기
    N, M = map(int, sys.stdin.readline().split())
    # 문서의 우선순위 입력받기
    weight = list(map(int, sys.stdin.readline().split()))
    # weight 의 인덱스번호와 값을 같이 저장 (튜플)
    queue = [i for i in enumerate(weight)]

    # 우선순위 내림차순으로 정렬(인쇄 순서)
    print_order = sorted(weight, reverse=True)
    # 인쇄순서 포인터 정의
    print_order_pointer = 0

    while queue :
        # 맨 왼쪽의 값
        left = queue.pop(0)

        # 맨 왼쪽의 값과 그 다음 index 의 값을 비교, 다음 값 중에 우선순위가 큰 값이
        # 한개라도 존재 한다면, 출력을 하지 않고 queue 의 맨 뒤로 보낸다.
        if left[1] != print_order[print_order_pointer]:
            queue.append(left)

        else :
            print_order_pointer += 1

            if left[0] == M :
                print(print_order_pointer)
