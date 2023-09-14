# 어떤 사람의 덩치를 키와 몸무게, 이 두 개의 값으로 표현하여 그 등수를 매겨보려고 한다.
# (몸무게, 키) 로 표시된다.
# 두개의 값이 다 커야 상대방보다 덩치가 크다고 할 수 있다.
# 자신보다 더 큰 덩치의 사람이 k 명 이라면, 그 사람의 덩치 등수는 k + 1 이 된다.

import sys

# 전체 사람의 수 N 값 입력받기
N = int(input())

# 전체 덩치 값 입력받기
input_data = []

for i in range(N):
    X, Y = map(int, sys.stdin.readline().split())
    input_data.append([X, Y])

# 덩치 큰 사람 찾기
for i in input_data:
    # 덩치 등수는 자신보다 더 큰 덩치의 사람의 수 + 1 이므로 기본값을 1 로 설정
    rank = 1

    for j in input_data:
        if i[0] < j[0] and i[1] < j[1]:
                rank += 1

    print(rank, end = " ")

